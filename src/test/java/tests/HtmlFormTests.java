package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.html.BasicHtmlFormPage;
import pages.HomePage;
import pages.html.SubmittedBasicHtmlFormPage;

public class HtmlFormTests extends BaseTest {
    private BasicHtmlFormPage page;
    private SubmittedBasicHtmlFormPage submittedPage;

    @BeforeMethod
    public void openWindowsLinkPage() {
        page = goTo(HomePage::goToBasicHtmlFormPage);
    }

    @Test
    public void basicHtmlFormTest() {
        submittedPage =
                page.inputUserName("username")
                        .inputPassword("password")
                        .inputComments("comments")
                        .chooseTestFile()
                        .clickOnCheckbox(1)
                        .clickOnCheckbox(2)
                        .clickOnRadio(2)
                        .multipleSelectValue(2)
                        .chooseDropDownOption(3)
                        .clickOnSubmitButton();

        submittedPage
                .shouldBeSubmittedUsername("username")
                .shouldBeSubmittedPassword("password")
                .shouldBeSubmittedComments("comments")
                .shouldBeSubmittedFileName("testfile.txt")
                .shouldBeSelectedCheckBoxes("1")
                .shouldBeSelectedCheckBoxes("2")
                .shouldBeSelectedRadioButton("2")
                .shouldBeSubmittedMultipleSelectValues("")
                .shouldBeSelectedDropDownOption("3");


    }
}
