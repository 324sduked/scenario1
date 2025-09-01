package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KeysAndClickEventPage;

public class KeyAndClickEventTests extends BaseTest {

    private KeysAndClickEventPage page;

    @BeforeMethod
    public void openKeysAndClickEventPage() {
        page = goTo(HomePage::goToKeysAndClickEventPage);
    }
    @Test
    public void checkIfClickedKeysAreDisplayed(){
        page.clickKeyAndCheckIfItIsDisplayed(Keys.CONTROL)
                .shouldBeEventsListSize(2)
                .clickKeyAndCheckIfItIsDisplayed(Keys.ENTER)
                .shouldBeEventsListSize(4)
                .clickKeyAndCheckIfItIsDisplayed(Keys.ALT)
                .clickKeyAndCheckIfItIsDisplayed(Keys.ESCAPE)
                .shouldBeEventsListSize(8)
                .reverseOrderOfExpectedList()
                .shouldBeEventsTexts();
    }
}
