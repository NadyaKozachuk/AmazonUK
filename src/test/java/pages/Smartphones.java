package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class Smartphones {
    private static final Logger LOGGER = LoggerFactory.getLogger(Smartphones.class);
    private static final String MODEL_YEAR_2023 = "//*[@id='p_n_feature_thirteen_browse-bin/12421314031']/span/a/span";
    private static final String MODEL_YEAR_2022 = "//*[@id='p_n_feature_thirteen_browse-bin/12421315031']/span/a/span[contains(text(),'2022')]";
    private static final String MODEL_YEAR_LIST = "//ul[@data-csa-c-content-id='4029190031']//a//span[@class='a-size-base a-color-base']";
    private static final String BRAND_SAMSUNG = "//*[@id='p_123/46655']/span/a/span";
    private static final String PRICE_50_100 = "//*[@id='s-refinements']/div[42]/ul/li[3]/span/a/span";
    private static final String CAMERA_RESOLUTION_MORE_20 = "//*[@id='p_n_feature_four_browse-bin/14210450031']/span/a/span";
    private static final String ACCEPT_COOKIE = "//input[@id='sp-cc-accept']";
    private static final String CHOOSE_LOCATION = "//*[@id='glow-ingress-line2']";
    private static final String POSTCODE_FIELD = "//input[@id='GLUXZipUpdateInput']";
    private static final String POSTCODE_VALUE = "HR4 9BG";
    private static final String APPLY_BUTTON = "//*[@id='GLUXZipUpdate']";
    private static final String CLOSE_POPUP = "(//input[@id='GLUXConfirmClose'])[2]";

    public static void selectModelYear(String year) {
        int selectedYear = Integer.parseInt(year);
        switch (selectedYear) {
            case 2023:
                $(By.xpath(MODEL_YEAR_2023)).click();
                LOGGER.info("Selected MODEL_YEAR_2023");
                break;
            case 2022:
                $(By.xpath(MODEL_YEAR_2022)).click();
                LOGGER.info("Selected MODEL_YEAR_2022");
                break;
            default:
                List<String> modelYearsActualList = $$(By.xpath(MODEL_YEAR_LIST)).texts();
                Assert.assertNotNull(modelYearsActualList);
                String existingYear = modelYearsActualList.get(0);
                Assert.assertTrue("Can't find Model Year " + year + " on the Smartphone Page. Try with: " + existingYear, modelYearsActualList.contains(year));
                LOGGER.info("Check element locator to the Smartphone page for year: " + year);
                closeWindow();
        }
    }

    public static void selectPrice(String price) {
        if (price.contains("50_100")) {
            $(By.xpath(PRICE_50_100)).click();
            LOGGER.info("Selected price " + price);
        } else {
            LOGGER.info("Please add the element locator to the Smartphone page for price: " + price);
            closeWindow();
        }
    }

    public static void selectModel(String model) {
        if (model.contains("SAMSUNG")) {
            $(By.xpath(BRAND_SAMSUNG)).click();
            LOGGER.info("Selected brand " + model);
        } else {
            LOGGER.info("Please add the element locator to the Smartphone page for model brand: " + model);
            closeWindow();
        }
    }

    public static void selectCameraResolution(String resolution) {
        if (resolution.contains("MORE_20")) {
            $(By.xpath(CAMERA_RESOLUTION_MORE_20)).click();
            LOGGER.info("Selected camera resolution " + resolution);
        } else {
            LOGGER.info("Please add the element locator to the Smartphone page for camera resolution: " + resolution);
            closeWindow();
        }
    }

    public static void acceptCookie() {
        if ($(By.xpath(ACCEPT_COOKIE)).isDisplayed()) {
            $(By.xpath(ACCEPT_COOKIE)).click();
        }
    }

    public static void selectDeliverTo() {
        $(By.xpath(CHOOSE_LOCATION)).click();
        LOGGER.info("CHOOSE_LOCATION");
        $(By.xpath(POSTCODE_FIELD)).setValue(POSTCODE_VALUE);
        LOGGER.info("POSTCODE_VALUE");
    }

    public static void apply() {
        if ($(By.xpath(APPLY_BUTTON)).isDisplayed()) {
            $(By.xpath(APPLY_BUTTON)).click();
            sleep(1000);
            LOGGER.info("APPLY_BUTTON");
        }
    }

    public static void closePopup() {
        if ($(By.xpath(CLOSE_POPUP)).isDisplayed()) {
            $(By.xpath(CLOSE_POPUP)).click();
            LOGGER.info("CLOSE_POPUP");
        }
    }
}