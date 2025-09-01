package pages.hover;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AfterClickingHoverLinkPage {

    private SelenideElement returnToPreviousPageButton = $("#returnlink");

    public AfterClickingHoverLinkPage shouldBeLoaded() {
        returnToPreviousPageButton.shouldBe(Condition.visible);
        return this;
    }
}
