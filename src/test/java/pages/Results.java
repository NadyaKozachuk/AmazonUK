package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class Results {
    private static final Logger LOGGER = LoggerFactory.getLogger(Results.class);
    private static final String EXPECTED_MODEL_SAMSUNG = "Sams";
    private static final String ACTUAL_MODELS_LIST = "//div[@id='search']/div/div/div/span/div/div/div/div/span/div/div/div[2]/div/h2";


    public static void getSearchResult() {
        List<String> textActual = $$(By.xpath(ACTUAL_MODELS_LIST)).texts();
        LOGGER.info("Resul page is loaded");
        Assert.assertTrue("On the resul page expected model has not found", textActual.stream().distinct().allMatch(s -> s.contains(EXPECTED_MODEL_SAMSUNG)));
        LOGGER.info("Asserted Result" + EXPECTED_MODEL_SAMSUNG);
    }

    public static void getSearchResult(String result) {
        List<String> textActual = $$(By.xpath(ACTUAL_MODELS_LIST)).texts();
        Assert.assertTrue(textActual.stream().distinct().anyMatch(s -> s.contains(result)));
        LOGGER.info("Asserted Search Result" + result);
    }
}