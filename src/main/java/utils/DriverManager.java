package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverManager {
    private static Properties cucumberProperties = new Properties();

    public static void loadCucumberProperties() {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/cucumber.properties");
            cucumberProperties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBrowserFromProperties() {
        loadCucumberProperties();
        return cucumberProperties.getProperty("browser");
    }

    public static String getBrowserSizeFromProperties() {
        loadCucumberProperties();
        return cucumberProperties.getProperty("browserSize");
    }

    public static String getTestPhoneURL() {
        loadCucumberProperties();
        return cucumberProperties.getProperty("url_nav_phones");
    }
}