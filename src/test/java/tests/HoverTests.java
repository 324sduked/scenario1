package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.hover.AfterClickingHoverLinkPage;
import pages.hover.HoverPage;

public class HoverTests extends BaseTest {

    private HoverPage page;
    private AfterClickingHoverLinkPage nextPage;

    @BeforeMethod
    public void openHoverPage() {
        page = goTo(HomePage::goToHoverPage);
    }

    @Test
    public void doesHoverLinkWorkTest() {
        nextPage = page.hoverOverDiv()
                .shouldBeHoverLinkVisibleAndClickable()
                .clickHoverLink();
        nextPage.shouldBeLoaded();
    }
}
