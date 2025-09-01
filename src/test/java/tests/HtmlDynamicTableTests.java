package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HtmlDynamicTablePage;

import java.util.List;

public class HtmlDynamicTableTests extends BaseTest {

    private HtmlDynamicTablePage page;
    private List<String> expextedNames = List.of("Bob", "George");
    private String testEntry = "[{\"name\" : \"Alice\", \"age\" : 19}, {\"name\": \"Douglas\", \"age\" : 31}]";
    private List<String> testNames = List.of("Alice", "Douglas");

    @BeforeMethod
    public void openWindowsLinkPage() {
        page = goTo(HomePage::goToHtmlDynamicTablePage);
    }

    @Test
    public void textAreasTest() {
        page
                .shouldHaveTableNames(expextedNames)
                .clickTableDetailsButton()
                .setJsonTableData(testEntry)
                .setDynamicTableCaption("Test Caption")
                .setTableIdText("test")
                .clickRefreshTableButton()
                .shouldHaveTableNames(testNames)
                .shouldHaveTableCaptionText("Test Caption")
                .shouldHaveTableIdText("test");
    }
}
