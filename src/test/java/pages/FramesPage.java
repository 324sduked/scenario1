package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class FramesPage {

    private SelenideElement leftListItem0 = $("#left0");

    public FramesPage shouldBeLeftFrameFirstItemText(String expectedText) {
        switchTo().frame($("frame[name=left]"));
        leftListItem0.shouldBe(Condition.text(expectedText));
        return this;
    }
}
