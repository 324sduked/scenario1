package pages;

import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class ProgressBarsPage {

    private ElementsCollection progressBars = $$("#progressrendering > p > progress");
    private Instant start = Instant.now();
    private Duration maxWait = Duration.ofSeconds(20);
    private HashMap<String, Long> barsOrderOfCompletion = new HashMap<>();


    public ProgressBarsPage shouldBeOrderOfCompletion(List<String> expectedOrder) {
        Instant[] finishedAt = new Instant[progressBars.size()];
        Set<Integer> done = new HashSet<>();

        long deadline = System.currentTimeMillis() + maxWait.toMillis();
        while (done.size() < progressBars.size() && System.currentTimeMillis() < deadline) {
            for (int i = 0; i < progressBars.size(); i++) {
                if (done.contains(i)) continue;
                String v = progressBars.get(i).getAttribute("value");
                if ("100".equals(v)) {
                    finishedAt[i] = Instant.now();
                    done.add(i);
                }
            }
            sleep(50);
        }
        for (int i = 0; i < progressBars.size(); i++) {
            Duration d = Duration.between(start, finishedAt[i]);
            barsOrderOfCompletion.put(progressBars.get(i).parent().getText(), d.toMillis());
            System.out.println("Bar " + (i + 1) + " finished in " + d.toMillis() + " ms");
        }
        Map<String, Long> barsSortedByCompletionTime = new TreeMap<>(barsOrderOfCompletion);
        System.out.println(barsSortedByCompletionTime.keySet().toString());
        Assert.assertEquals(barsSortedByCompletionTime.keySet(), expectedOrder);
        return this;
    }

}
