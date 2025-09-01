package pages;

import com.codeborne.selenide.SelenideElement;
import pages.alerts.AlertBoxesPage;
import pages.basicajax.BasicAjaxExamplePage;
import pages.expanding.ExpandingDivPage;
import pages.hover.HoverPage;
import pages.html.BasicHtmlFormPage;
import pages.html5.Html5FormPage;
import pages.jsvalidation.BasicJsValidationFormPage;
import pages.redirect.RedirectsPage;
import pages.upload.UploadFilePage;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private final SelenideElement webPageExampleLink = $("#basicpagetest");
    private final SelenideElement elementAttributesExamplesLink = $("#elementattributestest");
    private final SelenideElement htmlTableLink = $("#tablestest");
    private final SelenideElement htmlDynamicTableLink = $("#dynamictablestest");
    private final SelenideElement alertBoxesLink = $("#alerttest");
    private final SelenideElement fakeAlertLink = $("#fakealerttest");
    private final SelenideElement basicHtmlFormLink = $("#htmlformtest");
    private final SelenideElement html5FormLink = $("#html5formtest");
    private final SelenideElement windowsLinkLink = $("#windowstest");
    private final SelenideElement basicAjaxLink = $("#basicajaxtest");
    private final SelenideElement dragAndDropLink = $("#useractionstest");
    private final SelenideElement basicJsValidationLink = $("#javascriptfieldvalidationtest");
    private final SelenideElement keysAndClickEventLink = $("#clickdisplaytest");
    private final SelenideElement redirectsPageLink = $("#redirecttest");
    private final SelenideElement hoverLink = $("#csspseudohover");
    private final SelenideElement expandingDivLink = $("#expanding");
    private final SelenideElement dynamicButtonsChallange01Link = $("#button01");
    private final SelenideElement dynamicButtonsChallange02Link = $("#button02");
    private final SelenideElement uploadFileLink = $("#fileuploadtest");
    private final SelenideElement downloadLink = $("#download");
    private final SelenideElement progressBarsLink = $("#progressbars");
    private final SelenideElement framesLink = $("#framestest");


    public AlertBoxesPage goToAlertBoxesPage() {
        alertBoxesLink.click();
        return new AlertBoxesPage();
    }

    public WebPageExamplePage goToWebPageExamplePage() {
        webPageExampleLink.click();
        return new WebPageExamplePage();
    }

    public ElementAttributesExamplesPage goToElementAttributesExamplesPage() {
        elementAttributesExamplesLink.click();
        return new ElementAttributesExamplesPage();
    }

    public HtmlTablePage goToHtmlTablePage() {
        htmlTableLink.click();
        return new HtmlTablePage();
    }

    public HtmlDynamicTablePage goToHtmlDynamicTablePage() {
        htmlDynamicTableLink.click();
        return new HtmlDynamicTablePage();
    }

    public FakeAlertsPage goToFakeAlertsPage() {
        fakeAlertLink.click();
        return new FakeAlertsPage();
    }

    public BasicHtmlFormPage goToBasicHtmlFormPage() {
        basicHtmlFormLink.click();
        return new BasicHtmlFormPage();
    }

    public Html5FormPage goToHtml5FormPage() {
        html5FormLink.click();
        return new Html5FormPage();
    }

    public WindowsLinkPage goToWindowsLinkPage() {
        windowsLinkLink.click();
        return new WindowsLinkPage();
    }

    public BasicAjaxExamplePage goToBasicAjaxExamplePage() {
        basicAjaxLink.click();
        return new BasicAjaxExamplePage();
    }

    public DragAndDropPage goToDragAndDropPage() {
        dragAndDropLink.click();
        return new DragAndDropPage();
    }

    public BasicJsValidationFormPage goToBasicJsValidationFormPage() {
        basicJsValidationLink.click();
        return new BasicJsValidationFormPage();
    }

    public KeysAndClickEventPage goToKeysAndClickEventPage() {
        keysAndClickEventLink.click();
        return new KeysAndClickEventPage();
    }

    public RedirectsPage goToRedirectsPage() {
        redirectsPageLink.click();
        return new RedirectsPage();
    }

    public HoverPage goToHoverPage() {
        hoverLink.click();
        return new HoverPage();
    }

    public ExpandingDivPage goToExpandingDivPage() {
        expandingDivLink.click();
        return new ExpandingDivPage();
    }

    public DynamicButtons01Page goToDynamicButtonsPage() {
        dynamicButtonsChallange01Link.click();
        return new DynamicButtons01Page();
    }

    public DynamicButtons02Page goToDynamicButtonsPage2() {
        dynamicButtonsChallange02Link.click();
        return new DynamicButtons02Page();
    }

    public UploadFilePage goToUploadFilePage() {
        uploadFileLink.click();
        return new UploadFilePage();
    }

    public DownloadPage goToDownloadPage() {
        downloadLink.click();
        return new DownloadPage();
    }

    public ProgressBarsPage goToProgressBarsPage() {
        progressBarsLink.click();
        return new ProgressBarsPage();
    }

    public FramesPage goToFramesPage() {
        framesLink.click();
        return new FramesPage();
    }
}
