package pages.expanding;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ExpandingDivPage {

    private SelenideElement expandingDiv = $(".expand");
    private SelenideElement thisLink = $(".expand > p > a");

    public ExpandingDivPage hoverOverDiv() {
        expandingDiv.hover();
        return this;
    }
    public ExpandingDivPage shouldBeLinkVisibleAndClickable() {
        thisLink.shouldBe(Condition.visible);
        thisLink.shouldBe(Condition.clickable);
        return this;
    }
    public ExpandingDivAfterClickingLinkPage clickThisLink() {
        thisLink.click();
        return new ExpandingDivAfterClickingLinkPage();
    }
}
