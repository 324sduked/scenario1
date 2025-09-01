package pages.jsvalidation;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

public class BasicJsValidationFormPage {

    private final SelenideElement firstValueTextArea = $("#lteq30a");        // adjust selector if needed
    private final SelenideElement secondValueTextArea = $("#lteq30b");      // adjust selector if needed
    private final SelenideElement submitButton = $(".styled-click-button");

    public BasicJsValidationFormPage enterFirstValue(String value) {
        firstValueTextArea.setValue(value);
        return this;
    }

    public BasicJsValidationFormPage enterSecondValue(String value) {
        secondValueTextArea.setValue(value);
        return this;
    }

    public SubmittedBasicJsValidationFormPage clickSubmitButtonWithValidValues() {
        submitButton.click();
        return new SubmittedBasicJsValidationFormPage();
    }
    public BasicJsValidationFormPage clickSubmitButtonWithInvalidValues() {
        submitButton.click();
        return new BasicJsValidationFormPage();
    }
    public BasicJsValidationFormPage shouldBeVisibleAlert() {
        Assert.assertEquals(switchTo().alert().getText(),"Enter a numeric value less than 30" );
        return this;
    }
    public BasicJsValidationFormPage clickAlertOkButton() {
        switchTo().alert().accept();
        return this;
    }
    public BasicJsValidationFormPage clickTab(){
        actions().keyDown(Keys.TAB).perform();
        actions().keyUp(Keys.TAB).perform();
        return this;
    }

    public BasicJsValidationFormPage shoulNotBeVisibleAlert() {
        Assert.assertNotEquals(switchTo().alert().getText(),"Enter a numeric value less than 30" );
        return this;
    }
}
