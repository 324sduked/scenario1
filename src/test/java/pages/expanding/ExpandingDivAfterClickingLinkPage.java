package pages.expanding;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ExpandingDivAfterClickingLinkPage {

    private SelenideElement goBackLink = $(".noticeme > p > a");

    public ExpandingDivAfterClickingLinkPage shouldBeLoaded() {
        goBackLink.shouldBe(Condition.visible);
        return this;
    }
}
