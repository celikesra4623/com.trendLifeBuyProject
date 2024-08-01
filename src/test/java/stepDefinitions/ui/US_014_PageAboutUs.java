package stepDefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.user.PageAboutUs;
import utilities.Driver;

public class US_014_PageAboutUs {

    PageAboutUs aboutUs = new PageAboutUs();


    @When("The user clicks About Us button")
    public void theUserClicksAboutUsButton() {
        aboutUs.buttonAboutUs.click();
    }

    @And("The user sees About Us page.")
    public void theUserSeesAboutUsPage() {
        String actualPageAboutUsTitle = Driver.getDriver().getTitle();
        String expectedPageAboutUsTitle = "About Us | Trendlifebuy Online Shopping";
        Assert.assertEquals(expectedPageAboutUsTitle, actualPageAboutUsTitle);
    }

    @And("The user sees the text of {string}")
    public void theUserSeesTheTextOfQualityAndReasonablePrice(String nameOfElement) {
        WebElement webElement = PageAboutUs.mapTextWebElement.get(nameOfElement);
        Assert.assertTrue(webElement.isDisplayed());
    }


    @Then("The user sees the image of Robert Pattison")
    public void theUserSeesTheImageOfRobertPattison() {
        Assert.assertTrue(aboutUs.imageProfileRobertPattinson.isDisplayed());
    }


    @Then("The user sees the image of Johnny Depp")
    public void theUserSeesTheImageOfJohnnyDepp() {
        Assert.assertTrue(aboutUs.imageProfileJohnnyDepp.isDisplayed());
    }


    @Then("The user sees the image of Jason Statham")
    public void theUserSeesTheImageOfJasonStatham() {
        Assert.assertTrue(aboutUs.imageProfileJasonStatham.isDisplayed());
    }


    @And("The user sees the image of Bradley Cooper")
    public void theUserSeesTheImageOfBradleyCooper() {
        Assert.assertTrue(aboutUs.imageProfileBradleyCooper.isDisplayed());
    }
}
