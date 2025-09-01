package pages.html;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BasicHtmlFormPage {

    private final SelenideElement userNameTextArea = $("input[name='username']");
    private final SelenideElement passwordTextArea = $("input[name='password']");
    private final SelenideElement commentsTextArea = $("textarea[name='comments']");
    private final SelenideElement chooseFileButton = $("input[name='filename']");
    private final SelenideElement submitButton = $("input[type='submit']");
    private final SelenideElement dropDownButton = $("select[name='dropdown']");


    public BasicHtmlFormPage inputUserName(String userName) {
        userNameTextArea.setValue(userName);
        return this;
    }

    public BasicHtmlFormPage inputPassword(String password) {
        passwordTextArea.setValue(password);
        return this;
    }

    public BasicHtmlFormPage inputComments(String comments) {
        commentsTextArea.setValue(comments);
        return this;
    }

    public BasicHtmlFormPage chooseTestFile() {
        chooseFileButton.uploadFile(new File("src/test/resources/testfile.txt"));
        return this;
    }

    public BasicHtmlFormPage clickOnCheckbox(int option) {
        $$("input[type='checkbox']").get(option).click();
        return this;
    }

    public BasicHtmlFormPage clickOnRadio(int option) {
        $$("input[name='radioval']").get(option - 1).click();
        return this;
    }

    public BasicHtmlFormPage multipleSelectValue(int option) {
        $$("select[multiple='multiple'] > option").get(option - 1).click();
        return this;
    }
    public BasicHtmlFormPage chooseDropDownOption(int option) {
        dropDownButton.click();
        $$("select[name='dropdown'] > option").get(option - 1).click();
        return this;
    }
    public SubmittedBasicHtmlFormPage clickOnSubmitButton() {
        submitButton.click();
        return new SubmittedBasicHtmlFormPage();
    }

}
