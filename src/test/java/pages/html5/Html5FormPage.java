package pages.html5;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class Html5FormPage {

    private final SelenideElement colourPicker = $("#colour-picker");
    private final SelenideElement datePicker = $("#date-picker");
    private final SelenideElement dateTimePicker = $("#date-time-picker");
    private final SelenideElement emailTextArea = $("#email-field");
    private final SelenideElement monthPicker = $("#month-field");
    private final SelenideElement numberPicker = $("#number-field");
    private final SelenideElement submitButton = $(".styled-click-button[name='submitbutton']");

    public Html5FormPage pickColour(String colour) {
        colourPicker.setValue(colour);
        return this;
    }
    public Html5FormPage pickDate(String day, String month, String year) {
        datePicker.setValue(day);
        datePicker.sendKeys(Keys.ARROW_RIGHT);
        datePicker.sendKeys(month);
        datePicker.sendKeys(Keys.ARROW_RIGHT);
        datePicker.sendKeys(year);
        return this;
    }
    public Html5FormPage pickDateTime(String day, String month, String year, String hour, String minute, String second) {
        dateTimePicker.setValue(day);
        dateTimePicker.sendKeys(Keys.ARROW_RIGHT);
        dateTimePicker.sendKeys(month);
        dateTimePicker.sendKeys(Keys.ARROW_RIGHT);
        dateTimePicker.sendKeys(year);
        dateTimePicker.sendKeys(Keys.ARROW_RIGHT);
        dateTimePicker.sendKeys(hour);
        dateTimePicker.sendKeys(Keys.ARROW_RIGHT);
        dateTimePicker.sendKeys(minute);
        dateTimePicker.sendKeys(Keys.ARROW_RIGHT);
        dateTimePicker.sendKeys(second);
        return this;
    }
    public Html5FormPage inputEmail(String email) {
        emailTextArea.setValue(email);
        return this;
    }
    public Html5FormPage pickMonth(String month, String year) {
        monthPicker.setValue(month);
        monthPicker.sendKeys(Keys.ARROW_RIGHT);
        monthPicker.sendKeys(year);
        return this;
    }
    public Html5FormPage pickNumber(String number) {
        numberPicker.setValue(number);
        return this;
    }
    public SubmittedHtml5FormPage clickOnSubmitButton() {
        submitButton.click();
        return new SubmittedHtml5FormPage();
    }

}
