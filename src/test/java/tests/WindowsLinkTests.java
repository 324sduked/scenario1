package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WindowsLinkPage;

public class WindowsLinkTests extends BaseTest {

    private WindowsLinkPage windowsLinkPage;

    @BeforeMethod
    public void openWindowsLinkPage() {
        windowsLinkPage = goTo(HomePage::goToWindowsLinkPage);
    }
    @Test
    public void clickBasicAjaxButton() {
        windowsLinkPage.goToBasicAjaxLink().clickBasicAjaxButton();
    }
}
