package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HtmlDynamicTablePage {

    private List<String> actualNames = $$("#tablehere > table > tr > td:first-child").texts();
    private SelenideElement dynamicTableCaption = $("#tablehere > table > caption");
    private String dynamicTableId = $("#tablehere > table").getAttribute("id");
    private final SelenideElement tableDetailsButton = $(".centered > details");
    private final SelenideElement jsonTableTextArea = $("#jsondata");
    private final SelenideElement captionTextArea = $("#caption");
    private final SelenideElement tableIdTextArea = $("#tableid");
    private final SelenideElement refreshTableButton = $("#refreshtable");
    private String testEntry = "[{\"name\" : \"Alice\", \"age\" : 19}, {\"name\": \"Douglas\", \"age\" : 31}]";


    public HtmlDynamicTablePage setJsonTableData(String data) {
        jsonTableTextArea.clear();
        jsonTableTextArea.setValue(data);
        return this;
    }

    public HtmlDynamicTablePage setDynamicTableCaption(String caption) {
        captionTextArea.clear();
        captionTextArea.setValue(caption);
        return this;
    }

    public HtmlDynamicTablePage setTableIdText(String id) {
        tableIdTextArea.clear();
        tableIdTextArea.setValue(id);
        return this;
    }

    public HtmlDynamicTablePage clickTableDetailsButton() {
        tableDetailsButton.click();
        return this;
    }

    public HtmlDynamicTablePage clickRefreshTableButton() {
        refreshTableButton.click();
        return this;
    }

    public HtmlDynamicTablePage shouldHaveTableNames(List<String> names) {
        actualNames = $$("#tablehere > table > tr > td:first-child").texts();
        Assert.assertEquals(actualNames, names);
        return this;

    }

    public HtmlDynamicTablePage shouldHaveTableCaptionText(String caption) {
        dynamicTableCaption = $("#tablehere > table > caption");
        Assert.assertEquals(dynamicTableCaption.getText(), caption);
        return this;
    }

    public HtmlDynamicTablePage shouldHaveTableIdText(String testId) {
        dynamicTableId = $("#tablehere > table").getAttribute("id");
        Assert.assertEquals(dynamicTableId, testId);
        return this;
    }

}
