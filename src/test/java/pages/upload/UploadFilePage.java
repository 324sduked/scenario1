package pages.upload;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class UploadFilePage {

    private SelenideElement chooseFileButton = $("#fileinput");
    private SelenideElement itsAnImageRadioButton = $("#itsanimage");
    private SelenideElement itsAnGeneralFileRadioButton = $("#itsafile");
    private SelenideElement uplaodButton = $(".styled-click-button");

    public UploadFilePage chooseAFile() {
        chooseFileButton.uploadFile(new File("src/test/resources/testfile.txt"));
        return this;
    }
    public UploadFilePage chooseAGeneralFile() {
        itsAnGeneralFileRadioButton.click();
        return this;
    }
    public UploadFilePage chooseAImage() {
        itsAnImageRadioButton.click();
        return this;
    }
    public UploadFileAfterClickingUploadButtonPage clickUploadButton() {
        uplaodButton.click();
        return new UploadFileAfterClickingUploadButtonPage();
    }
}
