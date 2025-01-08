package hooks;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static steps.BaseStep.setUpForUI;

public class Hooks {

    public static Scenario scenario;
    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
        setUpForUI();
    }

    @After
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}
