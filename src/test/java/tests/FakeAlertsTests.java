package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FakeAlertsPage;
import pages.HomePage;

public class FakeAlertsTests extends BaseTest {

    private FakeAlertsPage page;

    @BeforeMethod
    public void openWindowsLinkPage() {
        page = goTo(HomePage::goToFakeAlertsPage);
    }

    @Test
    public void fakeAlertTest() {

        page
                .clickFakeAlertButton()
                .shouldBeFadedBackgroundActive()
                .shouldBeDialogText("I am a fake alert box!")
                .clickAtPageBody()
                .shouldBeFadedBackgroundActive()
                .clickDialogOkButton()
                .shouldNotBeFadedBackgroundActive();
    }

    @Test
    public void modalDialogTest() {
        page
                .clickModalDialogButton()
                .shouldBeDialogText("I am a modal div!")
                .shouldBeFadedBackgroundActive()
                .clickAtPageBody()
                .shouldNotBeFadedBackgroundActive();
    }
}
