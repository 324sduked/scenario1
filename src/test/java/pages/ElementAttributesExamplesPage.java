package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class ElementAttributesExamplesPage {

    private final SelenideElement addAttributeButton = $(".styled-click-button");
    private final SelenideElement dynamicParagraphWithButtonAddableAttributes = $("#jsattributes");
    private final SelenideElement constantChangingAttributeValuesParagraph = $("#jsautoattributes");

    public ElementAttributesExamplesPage clickAddAttributeButton() {
        addAttributeButton.click();
        return this;
    }

    public ElementAttributesExamplesPage shouldHaveNextId(String expected) {
        dynamicParagraphWithButtonAddableAttributes.shouldHave(Condition.attribute("nextid", expected));
        return this;
    }

    public String getNextId() {
        return dynamicParagraphWithButtonAddableAttributes.getAttribute("nextId");
    }

    public String getCustomAttribute(String customAttributeName) {
        return dynamicParagraphWithButtonAddableAttributes.getAttribute(customAttributeName);
    }

    public ElementAttributesExamplesPage shouldNotHaveCustomAttribute(String customAttributeName) {
        dynamicParagraphWithButtonAddableAttributes.shouldNotHave(Condition.attribute(customAttributeName));
        return this;
    }

    public ElementAttributesExamplesPage shouldHaveCustomAttribute(String customAttributeName) {
        dynamicParagraphWithButtonAddableAttributes.shouldHave(Condition.attribute(customAttributeName));
        return this;
    }

    public ElementAttributesExamplesPage waitForSpecificDataCountValue(Integer expected) {
        constantChangingAttributeValuesParagraph.shouldHave(
                Condition.attribute("data-count", expected.toString()),
                Duration.ofSeconds(expected));
        return this;
    }
    public void tearDown(){

    }


}
