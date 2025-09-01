package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;

public class KeysAndClickEventPage {

    private SelenideElement button = $("#button");
    private ElementsCollection eventsList = $$("#events > p");
    private List<String> expectedEventListTypesAndNames = new ArrayList<>();

    public KeysAndClickEventPage clickButton() {
        button.click();
        expectedEventListTypesAndNames.add("click");
        return this;
    }

    public KeysAndClickEventPage clickKeyAndCheckIfItIsDisplayed(Keys key){
        actions().sendKeys(key).perform();
        System.out.println(eventsList.texts());
        expectedEventListTypesAndNames.add("down " + key.name());
        expectedEventListTypesAndNames.add("up " + key.name());
        return this;
    }

    public KeysAndClickEventPage shouldBeEventsListSize(int size){
        Assert.assertEquals(eventsList.size(), size);
        return this;
    }

    public KeysAndClickEventPage shouldBeEventsTexts(){
        eventsList.shouldHave(texts(expectedEventListTypesAndNames));
        return this;
    }

    public KeysAndClickEventPage reverseOrderOfExpectedList(){
        Collections.reverse(expectedEventListTypesAndNames);
        return this;
    }
}
