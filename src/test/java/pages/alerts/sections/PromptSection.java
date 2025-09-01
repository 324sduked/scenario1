package pages.alerts.sections;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class PromptSection extends BaseAlertSection<PromptSection> {

    private final SelenideElement button = $("#promptexample");
    private final SelenideElement returnText = $("#promptreturn");
    private final SelenideElement counterID = $("#promptreturn");


    @Override
    protected SelenideElement button() {
        return button;
    }

    @Override
    protected SelenideElement returnText() {
        return returnText;
    }

    @Override
    protected SelenideElement counterID() {
        return counterID;
    }

    public PromptSection enterPromptText(String promptText) {
        switchTo().alert().sendKeys(promptText);
        return this;
    }
}
