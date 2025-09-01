package pages.html5;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;

public class SubmittedHtml5FormPage {

    private final SelenideElement colourValue = $("#_valuecolour");
    private final SelenideElement dateValue = $("#_valuedate");
    private final SelenideElement dateTimeValue = $("#_valuedatetime");
    private final SelenideElement emailValue = $("#_valueemail");
    private final SelenideElement monthValue = $("#_month");
    private final SelenideElement numberValue = $("#_valuenumber");

    public SubmittedHtml5FormPage shouldHaveSubmittedColour(String expected) {
        colourValue.shouldHave(text(expected));
        return this;
    }

    public SubmittedHtml5FormPage shouldHaveSubmittedDate(String expected) {
        dateValue.shouldHave(text(expected));
        return this;
    }

    public SubmittedHtml5FormPage shouldHaveSubmittedDateTime(String expected) {
        dateTimeValue.shouldHave(text(expected));
        return this;
    }

    public SubmittedHtml5FormPage shouldHaveSubmittedEmail(String expected) {
        emailValue.shouldHave(text(expected));
        return this;
    }

    public SubmittedHtml5FormPage shouldHaveSubmittedMonth(String expected) {
        monthValue.shouldHave(text(expected));
        return this;
    }

    public SubmittedHtml5FormPage shouldHaveSubmittedNumber(String expected) {
        numberValue.shouldHave(text(expected));
        return this;
    }
}
