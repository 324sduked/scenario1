package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.redirect.RedirectedToPage;
import pages.redirect.RedirectsPage;

import java.time.Duration;
import java.time.Instant;

public class RedirectTests extends BaseTest {

    private RedirectsPage page;
    private RedirectedToPage redirectedPage;

    @BeforeMethod
    public void openRedirectPage() {
        page = goTo(HomePage::goToRedirectsPage);
    }

    @Test
    public void redirecting2SecondButtonTimeTest() {
        Instant start = Instant.now();
        redirectedPage = page.clickRedirect2SecondsButton();
        redirectedPage.shouldBeLoaded();
        Duration elapsed = Duration.between(start, Instant.now());
        System.out.println(elapsed.toMillis());
        Assert.assertTrue(elapsed.toMillis() >= 1500 && elapsed.toMillis() <= 3000);
    }

    @Test
    public void redirecting5SecondButtonTimeTest() {
        Instant start = Instant.now();
        redirectedPage = page.clickRedirect5SecondsButton();
        redirectedPage.shouldBeLoaded();
        Duration elapsed = Duration.between(start, Instant.now());
        System.out.println(elapsed.toMillis());
        Assert.assertTrue(elapsed.toMillis() >= 4500 && elapsed.toMillis() <= 6000);
    }
}
