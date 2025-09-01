package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class DragAndDropPage {

    private SelenideElement firstRedSquare = $("#droppable1");
    private SelenideElement secondRedSquare = $("#droppable2");

    public DragAndDropPage dragAndDrop(String from, String to) {
        actions().dragAndDrop($("#draggable" + from), $("#droppable" + to)).pause(500).perform();
        return this;
    }
    public DragAndDropPage shouldBeFirstRedSquareText(String expectedText) {
        firstRedSquare.shouldBe(Condition.text(expectedText));
        return this;
    }
    public DragAndDropPage shouldBeSecondRedSquareText(String expectedText) {
        secondRedSquare.shouldBe(Condition.text(expectedText));
        return this;
    }
    public DragAndDropPage refreshWithCtrlClick() {
       actions().keyDown(Keys.CONTROL).perform();
       actions().keyUp(Keys.CONTROL).perform();
        return this;
    }
}
