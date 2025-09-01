package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DragAndDropPage;
import pages.HomePage;

public class DragAndDropTests extends BaseTest {

    private DragAndDropPage page;

    @BeforeMethod
    public void openWindowsLinkPage() {
        page = goTo(HomePage::goToDragAndDropPage);
    }
    @Test
    public void dragAndDropTest() {
        page
                .shouldBeFirstRedSquareText("Drop here")
                .shouldBeSecondRedSquareText("No Drop here")
                .dragAndDrop("1", "1")
                .shouldBeFirstRedSquareText("Dropped!")
                .dragAndDrop("2", "2")
                .shouldBeSecondRedSquareText("Dropped!")
                .dragAndDrop("2", "1")
                .shouldBeFirstRedSquareText("Get Off Me!")
                .refreshWithCtrlClick()
                .shouldBeFirstRedSquareText("Drop here")
                .shouldBeSecondRedSquareText("Drop here");

    }

}
