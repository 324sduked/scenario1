package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DynamicButtons01Page {

    private SelenideElement startButton = $("#button00");
    private ElementsCollection buttons = $$("#buttons > button");
    private SelenideElement challangeCompletedMessage = $("#buttonmessage");

    public DynamicButtons01Page clickStartButton() {
        startButton.click();
        return this;
    }
    public DynamicButtons01Page clickButton(int buttonIndex) {
        buttons.get(buttonIndex).shouldBe(Condition.clickable, Duration.ofSeconds(5));
        buttons.get(buttonIndex).click();
        return this;
    }
    public DynamicButtons01Page shouldBeChallangeCompletedMessage(String message) {
        challangeCompletedMessage.shouldBe(Condition.text(message));
        return this;
    }
}
