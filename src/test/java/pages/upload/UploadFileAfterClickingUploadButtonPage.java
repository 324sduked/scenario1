package pages.upload;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class UploadFileAfterClickingUploadButtonPage {

    private SelenideElement uploadedFileName = $("#uploadedfilename");

    public UploadFileAfterClickingUploadButtonPage shouldBeUploadedFileNameText(String expectedFileName) {
        uploadedFileName.shouldBe(Condition.text(expectedFileName));
        return this;
    }
}
