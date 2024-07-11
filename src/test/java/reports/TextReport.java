package reports;

import com.codeborne.selenide.logevents.SimpleReport;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Before;

public class TextReport {
    private final SimpleReport report = new SimpleReport();

    @Before
    public void beforeTest(Scenario scenario) {
        scenario.log("Starting " + scenario.getName());
        report.start();
    }

    @After
    public void afterTest(Scenario scenario) {
        scenario.log("Finished " + scenario.getName());
        report.finish(scenario.getName());
    }
}