package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverManager;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static pages.Results.getSearchResult;
import static pages.Smartphones.*;

public class TestSamsungPhonesStep extends BaseStep {
    @Given("I am on the Amazon UK Mobile Phones page")
    public void iAmOnTheAmazonUKMobilePhonesPage() {
        open(DriverManager.getTestPhoneURL());
        acceptCookie();
        selectDeliverTo();
        apply();
        closePopup();
    }

    @When("I filter by price  {string}")
    public void iFilterByPrice(String price) {
        selectPrice(price);
    }

    @And("filter model {string}")
    public void filterModel(String model) {
        selectModel(model);
    }

    @And("model Year {string}")
    public void modelYear(String year) {
        selectModelYear(year);
    }

    @And("camera resolution {string}")
    public void cameraResolution(String resolution) {
        selectCameraResolution(resolution);
        sleep(5000);
    }

    @Then("check model {string} is present on the Result page")
    public void checkModelIsPresentOnTheResultPage(String result) {
        getSearchResult(result);
    }

    @Then("verify Result page contains Samsung phones")
    public void verifyResultPageContainsSamsungPhones() {
        getSearchResult();
    }
}