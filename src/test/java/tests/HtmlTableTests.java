package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HtmlTablePage;

import java.util.Map;

public class HtmlTableTests extends BaseTest {

    private HtmlTablePage page;
    private Map<String, Integer> names = Map.of("Alan", 0, "Bob", 1, "Aleister", 2, "Douglas", 3);

    @BeforeMethod
    public void openWindowsLinkPage() {
        page = goTo(HomePage::goToHtmlTablePage);
    }

    @Test
    public void checkNamesAgainstAmounts() {
        for (Map.Entry<String, Integer> entry : names.entrySet()) {
            page.checkNameValue(entry.getKey(), entry.getValue());
        }
    }
}
