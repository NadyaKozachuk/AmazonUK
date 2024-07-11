package steps;

import com.codeborne.selenide.Configuration;

import static utils.DriverManager.getBrowserFromProperties;
import static utils.DriverManager.getBrowserSizeFromProperties;

public class BaseStep {
    public static void setUpForUI() {
        Configuration.browser = getBrowserFromProperties();
        Configuration.browserSize = getBrowserSizeFromProperties();
        Configuration.timeout = 8000;
        Configuration.reportsFolder = "test-result/reports";
    }
}