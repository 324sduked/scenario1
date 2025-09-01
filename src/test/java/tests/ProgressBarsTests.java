package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProgressBarsPage;

import java.util.List;

public class ProgressBarsTests extends BaseTest {

    private ProgressBarsPage page;

    @BeforeMethod
    public void openProgressBarsPage() {
        page = goTo(HomePage::goToProgressBarsPage);
    }

    @Test
    public void checkIfProgressBarsCompletesInGivenOrder() {
        page.shouldBeOrderOfCompletion(List.of("Task 1", "Task 2", "Task 3"));
    }
}
