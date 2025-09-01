package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.jsvalidation.BasicJsValidationFormPage;
import pages.jsvalidation.SubmittedBasicJsValidationFormPage;

public class JsValidationTests extends BaseTest {

    private BasicJsValidationFormPage page;
    private SubmittedBasicJsValidationFormPage submittedPage;

    @BeforeMethod
    public void openWindowsLinkPage() {
        page = goTo(HomePage::goToBasicJsValidationFormPage);
    }

    @Test
    public void properValuesTest() {
        submittedPage = page
                .enterFirstValue("21")
                .enterSecondValue("23")
                .clickSubmitButtonWithValidValues();

        submittedPage.shouldHaveFirstValue("21")
                .shouldHaveSecondValue("23")
                .clickGoBackToTheFormButton();
    }

    @Test
    public void invalidValuesTest() {
        page.enterFirstValue("35")
                .clickTab()
                .clickAlertOkButton()
                .shoulNotBeVisibleAlert()
                .enterSecondValue("60")
                .clickSubmitButtonWithInvalidValues()
                .shouldBeVisibleAlert();
    }
}
