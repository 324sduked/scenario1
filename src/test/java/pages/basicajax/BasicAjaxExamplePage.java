package pages.basicajax;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BasicAjaxExamplePage {


    private final SelenideElement categorySelect = $("#combo1");
    private final SelenideElement languageSelect = $("#combo2");
    private final SelenideElement codeInItButton = $(".styled-click-button");
    private final SelenideElement loadingImg = $("#ajaxBusy");


    private ElementsCollection categoryOptions() { return $$("#combo1 > option"); }
    private ElementsCollection languageOptions() { return $$("#combo2 > option"); }

    public BasicAjaxExamplePage chooseCategory(String visibleText) {
        categorySelect.selectOption(visibleText);
        return this;
    }


    public BasicAjaxExamplePage chooseCategory(int index1Based) {
        categorySelect.selectOption(index1Based - 1);
        return this;
    }



    public BasicAjaxExamplePage chooseLanguage(String visibleText) {
        languageSelect.selectOption(visibleText);
        return this;
    }

    public BasicAjaxExamplePage chooseLanguage(int index1Based) {
        languageSelect.selectOption(index1Based - 1);
        return this;
    }


    public SubmittedBasicAjaxPage clickCodeInIt() {
        codeInItButton.shouldBe(enabled).click();
        return new SubmittedBasicAjaxPage();
    }

    public int getLanguagesCount(){
        return languageOptions().size();
    }
    public BasicAjaxExamplePage waitForLanguagesToLoad(){
        loadingImg.shouldNotBe(visible);
        return this;
    }
}
