package steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static hooks.Hooks.scenario;
import static utils.DriverManager.*;

public class BaseStep {
    public static void setUpForUI() {
        Configuration.browser = getBrowserFromProperties();
        Configuration.browserSize = getBrowserSizeFromProperties();
        Configuration.timeout = 8000;
        Configuration.reportsFolder = "test-result/reports";

        try {
            ChromeOptions browserOptions = new ChromeOptions();
            browserOptions.setPlatformName("Windows 11");
            browserOptions.setBrowserVersion("latest");
            Map<String, Object> sauceOptions = new HashMap<>();
            sauceOptions.put("username", getUserNameFromProperties());
            sauceOptions.put("accessKey", getKeyFromProperties());
            sauceOptions.put("build", "selenium-build-Q6E2Q");
            sauceOptions.put("name", scenario.getName());
            browserOptions.setCapability("sauce:options", sauceOptions);

            URL url = new URL(getRemoteURLFromProperties());
            RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
            WebDriverRunner.setWebDriver(driver);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}