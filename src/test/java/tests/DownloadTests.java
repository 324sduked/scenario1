package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DownloadPage;
import pages.HomePage;

import java.io.IOException;

public class DownloadTests extends BaseTest {

    private DownloadPage downloadPage;

    @BeforeClass
    public void setUp() {
        Configuration.fileDownload = FileDownloadMode.FOLDER;
    }

    @BeforeMethod
    public void openDownloadPage() {
        downloadPage = goTo(HomePage::goToDownloadPage);
    }

    @Test
    public void downloadFileFromDirectLinkDownloadAndAssertItsContentTest() throws IOException {
        String content = downloadPage.downloadFileFromDirectLinkDownload();
        Assert.assertEquals(downloadPage.normalize(content), "This is a text file.\n" +
                "\n" +
                "Downloaded from https://testapps.heroku.com\n" +
                "\n" +
                "Remember to visit https://EvilTester.com for all your testing edufication.\n");
    }

    @Test
    public void donwloadFileFromDirectLinkNewWindow() throws IOException {
        String content = downloadPage.downloadFileFromDirectLinkDownloadNewWindow();
        Assert.assertEquals(downloadPage.normalize(content), "This is a text file.\n" +
                "\n" +
                "Downloaded from https://testapps.heroku.com\n" +
                "\n" +
                "Remember to visit https://EvilTester.com for all your testing edufication.\n");
    }

    @Test
    public void downloadFileWithServerDownloadButton() throws IOException {
        String content = downloadPage.downloadFileFromServerDownloadButton();
        Assert.assertEquals(downloadPage.normalize(content), "This is a generated text file.\n" +
                "\n" +
                "Downloaded from https://testapps.heroku.com\n" +
                "\n" +
                "Remember to visit https://EvilTester.com for all your testing edufication.");
    }
}
