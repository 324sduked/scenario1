package pages.hover;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HoverPage {

    private SelenideElement hoverPara = $("#hoverpara");
    private SelenideElement hoverDiv = $("#hoverdivpara");
    private SelenideElement hoverLink = $("#hoverlink");

    public HoverPage hoverOverParagraph() {
        hoverPara.hover();
        return this;
    }
    public HoverPage hoverOverDiv() {
        hoverDiv.hover();
        return this;
    }
    public HoverPage shouldBeHoverLinkVisibleAndClickable() {
        hoverLink.shouldBe(Condition.visible);
        hoverLink.shouldBe(Condition.clickable);
        return this;
    }
    public AfterClickingHoverLinkPage clickHoverLink() {
        hoverLink.click();
        return new AfterClickingHoverLinkPage();
    }
}
