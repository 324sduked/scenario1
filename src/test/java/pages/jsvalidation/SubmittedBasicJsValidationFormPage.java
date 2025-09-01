package pages.jsvalidation;

import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.switchTo;

public class SubmittedBasicJsValidationFormPage {

    public SubmittedBasicJsValidationFormPage shouldHaveFirstValue(String expected) {
        $("#_valuevalue1").shouldHave(exactText(expected));
        return this;
    }

    public SubmittedBasicJsValidationFormPage shouldHaveSecondValue(String expected) {
        $("#_valuevalue2").shouldHave(exactText(expected));
        return this;
    }

    public BasicJsValidationFormPage clickGoBackToTheFormButton() {
        $("#back_to_form").click();
        return new BasicJsValidationFormPage();
    }

}
