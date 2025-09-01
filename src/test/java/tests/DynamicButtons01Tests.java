package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DynamicButtons01Page;
import pages.HomePage;

public class DynamicButtons01Tests extends BaseTest {

    private DynamicButtons01Page page;

    @BeforeMethod
    public void openDynamicButtonsPage() {
        page = goTo(HomePage::goToDynamicButtonsPage);
    }
    @Test
    public void shouldBeChallangeCompletedMessage() {
        page.clickStartButton()
                .clickButton(1)
                .clickButton(2)
                .clickButton(3)
                .shouldBeChallangeCompletedMessage("All Buttons Clicked");
    }
}
