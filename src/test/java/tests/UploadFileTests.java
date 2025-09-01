package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.upload.UploadFileAfterClickingUploadButtonPage;
import pages.upload.UploadFilePage;

public class UploadFileTests extends BaseTest {

    private UploadFilePage page;
    private UploadFileAfterClickingUploadButtonPage nextPage;

    @BeforeMethod
    public void goToUploadFilePage() {
        page = goTo(HomePage::goToUploadFilePage);
    }

    @Test
    public void uploadFileTest() {
        nextPage = page
                .chooseAFile()
                .chooseAGeneralFile()
                .clickUploadButton();

        nextPage.shouldBeUploadedFileNameText("testfile.txt");
    }

}
