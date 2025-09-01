package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.alerts.AlertBoxesPage;
import pages.HomePage;

public class AlertBoxesTests extends BaseTest {

    private AlertBoxesPage page;

    @BeforeMethod
    public void openWindowsLinkPage() {
        page = goTo(HomePage::goToAlertBoxesPage);
    }

    @Test
    public void alertBoxTest() {

        page.alertSection
                .shouldNotBeReturnTextVisible()
                .shouldBeDataUseCount("0")
                .shouldNotBeReturnTextVisible()
                .clickButton()
                .shouldHaveBoxMessageText("I am an alert box!")
                .acceptAlert()
                .shouldBeReturnTextVisible()
                .shouldBeDataUseCount("1");

    }

    @Test
    public void confirmBoxTest() {
        page.confirmSection
                .shouldNotBeReturnTextVisible()
                .shouldBeDataUseCount("0")
                .shouldNotBeReturnTextVisible()
                .clickButton()
                .shouldHaveBoxMessageText("I am a confirm alert")
                .acceptAlert()
                .shouldBeReturnTextVisible()
                .shouldBeDataUseCount("1");
    }

    @Test
    public void promptBoxTest() {
        page.promptSection
                .shouldNotBeReturnTextVisible()
                .shouldBeDataUseCount("0")
                .shouldNotBeReturnTextVisible()
                .clickButton()
                .shouldHaveBoxMessageText("I prompt you")
                .enterPromptText("random text")
                .shouldBeReturnText("random text")
                .shouldBeReturnTextVisible()
                .shouldBeDataUseCount("1");
    }
}
