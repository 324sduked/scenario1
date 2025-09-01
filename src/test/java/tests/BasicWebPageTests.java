package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WebPageExamplePage;

public class BasicWebPageTests extends BaseTest {

    private WebPageExamplePage webPageExamplePage;

    @BeforeMethod
    public void openWindowsLinkPage() {
        webPageExamplePage = goTo(HomePage::goToWebPageExamplePage);
    }

    @Test
    public void paragraph1TextTest() {
        webPageExamplePage.paragraph1TextShouldHave("A paragraph of text");
    }

    @Test
    public void paragraph2TextTest() {
        webPageExamplePage.paragraph2TextShouldHave("Another paragraph of text");
    }
}
