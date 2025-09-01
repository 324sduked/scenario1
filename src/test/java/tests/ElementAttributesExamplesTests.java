package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ElementAttributesExamplesPage;
import pages.HomePage;

public class ElementAttributesExamplesTests extends BaseTest {

    private ElementAttributesExamplesPage page;

    @BeforeMethod
    public void openWindowsLinkPage() {
        page = goTo(HomePage::goToElementAttributesExamplesPage);
    }

    @Test
    public void verifyChangesInAttributesAfterButtonClick() {
        page.shouldHaveNextId("1")
                .shouldNotHaveCustomAttribute("custom-1")
                .shouldNotHaveCustomAttribute("custom-2")
                .clickAddAttributeButton()
                .shouldHaveCustomAttribute("custom-1")
                .shouldNotHaveCustomAttribute("custom-2")
                .shouldHaveNextId("2")
                .clickAddAttributeButton()
                .shouldHaveCustomAttribute("custom-2");

    }


    @Test
    public void waitingForSpecificDataCountValueTest() {
        page.waitForSpecificDataCountValue(5);
    }

}
