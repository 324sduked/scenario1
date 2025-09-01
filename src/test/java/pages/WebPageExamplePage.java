package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WebPageExamplePage {

    private final SelenideElement para1 = $("#para1");
    private final SelenideElement para2 = $("#para2");

    public void paragraph1TextShouldHave(String expected) {
        para1.shouldHave(Condition.text(expected));
    }

    public void paragraph2TextShouldHave(String expected) {
        para2.shouldHave(Condition.text(expected));
    }

}
