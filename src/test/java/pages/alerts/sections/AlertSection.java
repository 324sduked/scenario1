package pages.alerts.sections;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AlertSection extends BaseAlertSection<AlertSection> {

    private final SelenideElement button = $("#alertexamples");
    private final SelenideElement returnText = $("#alertexplanation");
    private final SelenideElement counterID = $("#alertreturn");

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

}
