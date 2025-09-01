package tests;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.function.Function;

import static com.codeborne.selenide.Selenide.*;

public abstract class BaseTest {

    protected HomePage homePage;

    @BeforeMethod
    public void openHomePage() {
        open("https://testpages.eviltester.com/styled/index.html");
        homePage = new HomePage();
    }
    protected <T> T goTo(Function<HomePage, T> action) {
     return action.apply(homePage);
    }

    @AfterMethod
    public void refreshBrowser() {
       refresh();
    }

}
