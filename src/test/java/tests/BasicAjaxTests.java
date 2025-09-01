package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.basicajax.BasicAjaxExamplePage;
import pages.HomePage;
import pages.basicajax.SubmittedBasicAjaxPage;

public class BasicAjaxTests extends BaseTest {

    private BasicAjaxExamplePage page;
    private SubmittedBasicAjaxPage submittedPage;

    @BeforeMethod
    public void openWindowsLinkPage() {
        page = goTo(HomePage::goToBasicAjaxExamplePage);
    }

    @Test
    public void basicAjaxTest() {
        for (Integer i = 1; i <= 3; i++) {
            page.chooseCategory(i).waitForLanguagesToLoad();
            int languagesCount = page.getLanguagesCount();

            for (Integer j = 1; j <= languagesCount; j++) {
                submittedPage =
                        page.chooseLanguage(j)
                                .clickCodeInIt();
                submittedPage
                        .shouldHaveCategoryId(i)
                        .shouldHaveLanguageId((i - 1)*10 + j - 1)
                        .clickGoBackToTheFormButton();
            }
        }
    }
}
