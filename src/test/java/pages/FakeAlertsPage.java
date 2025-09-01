package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class FakeAlertsPage {

    private final SelenideElement fakeAlertButton = $("#fakealert");
    private final SelenideElement modalDialogButton = $("#modaldialog");
    private final SelenideElement dialogOkButton = $("#dialog-ok");
    private final SelenideElement dialogtextID = $("#dialog-text");
    private final SelenideElement fadedBackground = $("div.faded-background");

    public FakeAlertsPage clickFakeAlertButton() {
        fakeAlertButton.click();
        return this;
    }

    public FakeAlertsPage clickModalDialogButton() {
        modalDialogButton.click();
        return this;
    }

    public FakeAlertsPage clickDialogOkButton() {
        dialogOkButton.click();
        return this;
    }

    public FakeAlertsPage shouldBeDialogText(String expectedtext) {
        dialogtextID.shouldHave(Condition.text(expectedtext));
        return this;
    }

    public FakeAlertsPage shouldNotBeFadedBackgroundActive() {
        Assert.assertEquals(fadedBackground.getAttribute("class"), "faded-background");
        return this;
    }

    public FakeAlertsPage shouldBeFadedBackgroundActive() {
        Assert.assertEquals(fadedBackground.getAttribute("class"), "faded-background active");
        return this;
    }

    public FakeAlertsPage clickAtPageBody() {
        actions().moveByOffset(1, 1).click().perform();
        return this;
    }
}
