package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DynamicButtons02Page;
import pages.HomePage;

public class DynamicButtons02Tests extends BaseTest {
    private DynamicButtons02Page page;

    @BeforeMethod
    public void openDynamicButtonsPage() {
        page = goTo(HomePage::goToDynamicButtonsPage2);
    }

    @Test
    public void dynamicButtons02ChallangeTest() {
        page.clickStartButton()
                .clickButton(1)
                .clickButton(2)
                .clickButton(3)
                .shouldBeChallangeCompletedMessage("All Buttons Clicked");
    }
}
