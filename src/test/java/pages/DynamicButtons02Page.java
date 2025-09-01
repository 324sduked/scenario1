package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DynamicButtons02Page {

    private ElementsCollection buttons = $$("#buttons > button");
    private SelenideElement challangeCompletedMessage = $("#buttonmessage");

    public DynamicButtons02Page clickStartButton() {
        buttons.get(0).shouldBe(Condition.exist);
        buttons.get(0).click();
        return this;
    }
    public DynamicButtons02Page clickButton(int buttonIndex) {
        buttons.get(buttonIndex).shouldBe(Condition.enabled, Duration.ofSeconds(7));
        buttons.get(buttonIndex).click();
        return this;
    }
    public DynamicButtons02Page shouldBeChallangeCompletedMessage(String message) {
        challangeCompletedMessage.shouldBe(Condition.text(message));
        return this;
    }
}
