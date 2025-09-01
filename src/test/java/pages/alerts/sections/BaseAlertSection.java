package pages.alerts.sections;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.switchTo;

public abstract class BaseAlertSection<T extends BaseAlertSection<T>> {

    protected abstract SelenideElement button();

    protected abstract SelenideElement returnText();

    protected abstract SelenideElement counterID();


    public T clickButton() {
        button().click();
        return (T) this;
    }

    public T acceptAlert() {
        switchTo().alert().accept();
        return (T) this;
    }

    public T shouldNotBeReturnTextVisible() {
        returnText().shouldNotBe(Condition.visible);
        return (T) this;
    }

    public T shouldBeReturnTextVisible() {
        returnText().shouldBe(Condition.visible);
        return (T) this;
    }

    public T shouldBeDataUseCount(String expectedCount) {
        Assert.assertEquals(counterID().getAttribute("data-use-count"), expectedCount);
        return (T) this;
    }

    public T shouldHaveBoxMessageText(String expectedMessage) {
        Assert.assertEquals(switchTo().alert().getText(), expectedMessage);
        return (T) this;
    }

    public T shouldBeReturnText(String expectedText) {
        Assert.assertEquals(returnText().getText(), expectedText);
        return (T) this;
    }

}
