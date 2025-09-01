package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class WindowsLinkPage {

    private final SelenideElement basicAjaxLink = $("#gobasicajax");
    private final SelenideElement basicAjaxButton = $(".styled-click-button");
    private final SelenideElement attributesLink = $("#goattributes");
    private final SelenideElement alertsLink = $("#goalerts");

    public WindowsLinkPage goToBasicAjaxLink() {
        basicAjaxLink.click();
        switchTo().window("basicajax");
         return this;
    }
    public WindowsLinkPage clickBasicAjaxButton() {
        basicAjaxButton.click();
        return this;
    }
}
