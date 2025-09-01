package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.expanding.ExpandingDivAfterClickingLinkPage;
import pages.expanding.ExpandingDivPage;

public class ExpandingDivTests extends BaseTest {

    private ExpandingDivPage page;
    private ExpandingDivAfterClickingLinkPage thisLinkPage;

    @BeforeMethod
    public void goToExpandingDivPage() {
        page = goTo(HomePage::goToExpandingDivPage);
    }

    @Test
    public void expandingDivClickableLinkTest() {
      thisLinkPage =  page.hoverOverDiv()
                .shouldBeLinkVisibleAndClickable()
                .clickThisLink();

      thisLinkPage.shouldBeLoaded();

    }
}
