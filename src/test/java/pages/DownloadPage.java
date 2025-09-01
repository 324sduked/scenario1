package pages;

import com.codeborne.selenide.SelenideElement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static com.codeborne.selenide.Selenide.$;

public class DownloadPage {

    private SelenideElement directLinkDownloadButton = $("#direct-download");
    private SelenideElement directLinkDownloadNewWindowButton = $("#direct-download-window");
    private SelenideElement serverDownloadButton = $("#server-download");
    private SelenideElement postGetRedirectServerButton = $("#post-getserver-download");
    private SelenideElement directLinkButton = $("#direct-link");

    public String normalize(String text) {
        return text.replace("\r\n", "\n").replace("\r", "\n");
    }

    public String downloadFileFromDirectLinkDownload() throws IOException {
        File file = directLinkDownloadButton.download();
        return Files.readString(file.toPath());
    }

    public String downloadFileFromDirectLinkDownloadNewWindow() throws IOException {
        File file = directLinkDownloadNewWindowButton.download();
        return Files.readString(file.toPath());
    }
    public String downloadFileFromServerDownloadButton() throws IOException {
        File file = serverDownloadButton.download();
        return Files.readString(file.toPath());
    }
}











