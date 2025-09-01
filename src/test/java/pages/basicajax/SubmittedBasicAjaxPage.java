package pages.basicajax;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.exactText;

public class SubmittedBasicAjaxPage {

    public SubmittedBasicAjaxPage shouldHaveCategoryId(Integer expected) {
        $("#_valueid").shouldHave(exactText(expected.toString()));
        return this;
    }

    public SubmittedBasicAjaxPage shouldHaveLanguageId(Integer expected) {
        $("#_valuelanguage_id").shouldHave(exactText(expected.toString()));
        return this;
    }

    public SubmittedBasicAjaxPage shouldHaveSubmitButtonValue(String expected) {
        $("#_valuesubmitbutton").shouldHave(exactText(expected));
        return this;
    }
    public BasicAjaxExamplePage clickGoBackToTheFormButton() {
     $(".styled-click-button").click();
     return new BasicAjaxExamplePage();
    }
}
