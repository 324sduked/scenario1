package pages.html;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SubmittedBasicHtmlFormPage {

    private final SelenideElement submittedUsername = $("#_valueusername");
    private final SelenideElement submittedPassword = $("#_valuepassword");
    private final SelenideElement submittedComments = $("#_valuecomments");
    private final SelenideElement submittedFileName = $("#_valuefilename");
    private final List<String> chosenCheckBoxes = $$("#_checkboxes > ul").texts();
    private final SelenideElement selectedRadioButton = $("#_valueradioval");
    private final List<String> multipleSelectValues = $$("#_multipleselect > ul").texts();
    private final SelenideElement dropDownValue = $("#_valuedropdown");

    public SubmittedBasicHtmlFormPage shouldBeSubmittedUsername(String expectedUsername) {
        submittedUsername.shouldHave(Condition.text(expectedUsername));
        return this;
    }

    public SubmittedBasicHtmlFormPage shouldBeSubmittedPassword(String expectedPassword) {
        submittedPassword.shouldHave(Condition.text(expectedPassword));
        return this;
    }

    public SubmittedBasicHtmlFormPage shouldBeSubmittedComments(String expectedComments) {
        submittedComments.shouldBe(Condition.text(expectedComments));
        return this;
    }

    public SubmittedBasicHtmlFormPage shouldBeSubmittedFileName(String expectedFileName) {
        submittedFileName.shouldBe(Condition.text(expectedFileName));
        return this;
    }

    public SubmittedBasicHtmlFormPage shouldBeSelectedCheckBoxes(String expectedCheckBox) {
        chosenCheckBoxes.contains("cb" + expectedCheckBox);
        return this;
    }

    public SubmittedBasicHtmlFormPage shouldBeSubmittedMultipleSelectValues(String expectedMultipleSelectValues) {
        multipleSelectValues.contains("ms" + expectedMultipleSelectValues);
        return this;
    }

    public SubmittedBasicHtmlFormPage shouldBeSelectedRadioButton(String expectedRadioButton) {
        selectedRadioButton.shouldHave(Condition.text("rd" + expectedRadioButton));
        return this;
    }

    public SubmittedBasicHtmlFormPage shouldBeSelectedDropDownOption(String expectedDropDownOption) {
        dropDownValue.shouldHave(Condition.text("dd" + expectedDropDownOption));
        return this;
    }

}
