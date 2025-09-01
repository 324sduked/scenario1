package pages.redirect;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.forward;

public class RedirectedToPage {

    private final SelenideElement goBackButton = $("#goback");


    public RedirectedToPage shouldBeLoaded() {
        WebDriverRunner.url().equals("https://testpages.eviltester.com/styled/redirected.html");
        goBackButton.shouldBe(Condition.visible, Duration.ofSeconds(6));
        return this;
    }

    public RedirectsPage clickGoBackButton() {
        goBackButton.click();
        return new RedirectsPage();
    }
}
