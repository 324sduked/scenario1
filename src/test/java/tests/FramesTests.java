package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.HomePage;

public class FramesTests extends BaseTest {

    private FramesPage page;

    @BeforeMethod
    public void goToFramesPage() {
        page = goTo(HomePage::goToFramesPage);
    }

    @Test
    public void framesTest() {
        page.shouldBeLeftFrameFirstItemText("Left List Item 0");
    }
}
