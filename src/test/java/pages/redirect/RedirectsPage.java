package pages.redirect;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RedirectsPage {

    private final SelenideElement redirect5SecondsButton = $("#delaygotobasic");
    private final SelenideElement redirect2SecondsButton = $("#delaygotobounce");

    public RedirectedToPage clickRedirect5SecondsButton() {
        redirect5SecondsButton.click();
        return new RedirectedToPage();
    }
    public RedirectedToPage clickRedirect2SecondsButton() {
        redirect2SecondsButton.click();
        return new RedirectedToPage();
    }
}
