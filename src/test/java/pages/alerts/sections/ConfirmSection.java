package pages.alerts.sections;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class ConfirmSection extends BaseAlertSection<ConfirmSection> {

    private final SelenideElement button = $("#confirmexample");
    private final SelenideElement returnText = $("#confirmreturn");
    private final SelenideElement counterID = $("#confirmreturn");

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

    public ConfirmSection dismissAlert() {
        switchTo().alert().dismiss();
        return this;
    }
}
