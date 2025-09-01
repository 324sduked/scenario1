package pages;

import org.testng.Assert;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class HtmlTablePage {
    private final List<String> names = $$("#mytable tbody tr td:first-child").texts();
    private final List<String> amounts = $$("#mytable tbody tr td:nth-child(2)").texts();



    public String getName(int index){
        return names.get(index);
    }

    public String getAmount(int index){
        return amounts.get(index);
    }

    public HtmlTablePage checkNameValue(String expected, int index){
        Assert.assertEquals(expected, names.get(index));
        return new HtmlTablePage();
    }

    public HtmlTablePage checkAmountValue(String expected, int index){
        Assert.assertEquals(expected, amounts.get(index));
        return new HtmlTablePage();
    }
}