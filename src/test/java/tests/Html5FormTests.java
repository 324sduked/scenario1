package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.html5.Html5FormPage;
import pages.html5.SubmittedHtml5FormPage;

public class Html5FormTests extends BaseTest {

    private Html5FormPage page;
    private SubmittedHtml5FormPage submittedPage;

    @BeforeMethod
    public void openWindowsLinkPage() {
        page = goTo(HomePage::goToHtml5FormPage);
    }

    @Test
    public void html5FormSubmissionTest() {
        submittedPage =
                page.pickColour("#000000")
                        .pickDate("2", "12", "2020")
                        .pickDateTime("2", "11", "2054", "1", "34", "10")
                        .inputEmail("bob@mailinator.com")
                        .pickMonth("February",  "2025")
                        .pickNumber("40")
                        .clickOnSubmitButton();

        submittedPage
                .shouldHaveSubmittedColour("#000000")
                .shouldHaveSubmittedDate("2020-12-02")
                .shouldHaveSubmittedDateTime("2054-11-02T01:34")
                .shouldHaveSubmittedEmail("bob@mailinator.com")
                .shouldHaveSubmittedMonth("2025-02")
                .shouldHaveSubmittedNumber("40");
    }
}
