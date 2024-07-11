package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/TestSamsungPhones.feature", plugin = {"pretty", "html:target/cucumber.html"}, glue = "steps" )
public class RunTest {
}