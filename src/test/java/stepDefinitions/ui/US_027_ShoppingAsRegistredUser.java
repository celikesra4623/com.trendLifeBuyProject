package stepDefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.comp.*;
import pages.user.*;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.URLReader;
import utilities.UserReader;

import java.time.Duration;
import java.util.List;

public class US_027_ShoppingAsRegistredUser {

    PageHome home;
    String productName;
    String productPrice;

    @And("LOGIN button is visible")
    public void loginButtonIsVisible() {
        CompHeader header = new CompHeader();
        header.buttonLogin.isDisplayed();
    }

    @Then("Toast message title is {string} and message is {string}")
    public void toast_message_title_is_and_message_is(String expectedTitle, String expectedMessage) {
        CompToastMessage toast = new CompToastMessage();
        String actualTitle = toast.labelTitleToast.getText();
        String actualMessage = toast.labelMessageToast.getText();
        Assert.assertEquals(expectedTitle, actualTitle);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("LOGOUT button is visible")
    public void logout_button_is_visible() {
        CompHeader header = new CompHeader();
        header.buttonLogout.isDisplayed();
    }

    @Then("DASHBOARD button is visible")
    public void dashboard_button_is_visible() {
        CompHeader header = new CompHeader();
        header.buttonDashboard.isDisplayed();
    }

    @When("User lands on user login url and logins with {string} email and {string} password without cancelling toast message")
    public void userLandsOnUserLoginUrlAndLoginsWithEmailAndPasswordWithoutCancellingToastMessage(String email, String password) {
        PageUserLogin pageLogin = new PageUserLogin();
        pageLogin.fieldEmail.sendKeys(UserReader.getUser(email));
        pageLogin.fieldPassword.sendKeys(UserReader.getPassword(password));
        ReusableMethods.clickElementByJS(pageLogin.buttonSignin);
    }

    @Then("Trending products are visible")
    public void trendingProductsAreVisible() {
        PageHome home = new PageHome();
        List<WebElement> productListTrending = home.productListTrending;
        Assert.assertTrue(productListTrending.size() >= 4);
        productListTrending.forEach(we -> Assert.assertTrue(we.isDisplayed()));
    }

    @And("Hover over on the first product in TrendingProducts")
    public void hoverOverOnTheFirstProductInTrendingProducts() {
        home = new PageHome();
        WebElement myElement = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOf(home.firstProductInTrending));
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(false);", myElement);
        new CompPromotion().close();
        new Actions(Driver.getDriver()).moveToElement(myElement).build().perform();
    }

    @Then("Verify that Add to Cart button is displayed")
    public void verifyThatAddToCartButtonIsDisplayed() {
        WebElement webElement = ReusableMethods.waitForVisibility(home.buttonAddToCard, 20);
        System.out.println("visibility = " + home.buttonAddToCard.getCssValue("visibility"));
        System.out.println("display = " + home.buttonAddToCard.getCssValue("display"));
        System.out.println("opacity = " + home.buttonAddToCard.getCssValue("opacity"));
        System.out.println("text = " + home.buttonAddToCard.getText());
        Assert.assertTrue(webElement.isDisplayed());
    }

    @When("Click to Add to Card button on the hovered item")
    public void click_to_add_to_card_button_on_the_hovered_item() {
        home = new PageHome();
        home.buttonAddToCard.click();
    }

    @When("Save the information of the product in an instance variable")
    public void save_the_information_of_the_product_in_an_instance_variable() {
        home = new PageHome();
        ReusableMethods.wait(2);
        productName = home.labelProductHeader.getText();
        String[] innerHTMLS = home.labelProductPrice.getAttribute("innerHTML").split("\\n");
        if (innerHTMLS.length > 1)
            productPrice = innerHTMLS[innerHTMLS.length - 2].trim();
    }

    @Then("Verify that pop up is visible with the product information")
    public void verify_that_pop_up_is_visible_with_the_product_information() {
        CompProductQuickView quickView = new CompProductQuickView();
        WebElement popUp = ReusableMethods.waitForVisibility(quickView.buttonAddToCart, 20);
        Assert.assertTrue(popUp.isDisplayed());
        Assert.assertEquals(productPrice, quickView.productPrice.getText());
        Assert.assertEquals(productName, quickView.productTitle.getText());
    }

    @Then("Click to Add to Card button on the the pop up")
    public void click_to_add_to_card_button_on_the_the_pop_up() {
        CompProductQuickView quickView = new CompProductQuickView();
        quickView.buttonAddToCart.click();
    }

    @Then("Verify that pop up is visible with the message {string}")
    public void verify_that_pop_up_is_visible_with_the_message(String expectedMessage) {
        CompProductAdded added = new CompProductAdded();
        WebElement webElement = ReusableMethods.waitForVisibility(added.labelSuccessMessage, 20);
        String actualMessage = webElement.getText();
        Assert.assertTrue(added.popUpProductAdded.isDisplayed());
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("Click to View Cart button on the pop up")
    public void click_to_view_cart_button_on_the_pop_up() {
        CompProductAdded added = new CompProductAdded();
        WebElement webElement = ReusableMethods.waitForVisibility(added.buttonViewCart, 20);
        webElement.click();

    }

    @Then("Verify that URL of the page is {string}")
    public void verify_that_url_of_the_page_is(String url) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = URLReader.getUrl(url);
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @And("Verify that added product is visible in the cart page")
    public void verifyThatAddedProductIsVisibleInTheCartPage() {
        PageCart cart = new PageCart();
        Assert.assertTrue(cart.labelPossibleAddedProduct.isDisplayed());
    }

    @Then("Verify that View Cart button is visible in the pop up")
    public void verifyThatViewCartButtonIsVisibleInThePopUp() {
        CompProductAdded added = new CompProductAdded();
        WebElement webElement = ReusableMethods.waitForVisibility(added.buttonViewCart, 20);
        Assert.assertTrue(webElement.isDisplayed());
    }

    @Then("Verify that the Proceed to Checkout button is visible on the Cart page")
    public void verify_that_the_proceed_to_checkout_button_is_visible_on_the_cart_page() {
        PageCart cart = new PageCart();
        WebElement webElement = ReusableMethods.waitForVisibility(cart.buttonProceedToCheckout, 20);
        Assert.assertTrue(webElement.isDisplayed());
    }

    @When("Click the Proceed to Checkout button on the Cart page")
    public void click_the_proceed_to_checkout_button_on_the_cart_page() {
        PageCart cart = new PageCart();
        WebElement webElement = ReusableMethods.waitForVisibility(cart.buttonProceedToCheckout, 20);
        webElement.click();
    }

    @Then("Verify that Continue to Shipping button is visible")
    public void verifyThatContinueToShippingButtonIsVisible() {
        PageCheckout checkout = new PageCheckout();
        WebElement webElement = ReusableMethods.waitForVisibility(checkout.buttonContinueToShipping, 20);
        Assert.assertTrue(webElement.isDisplayed());
    }

    @When("Fill the required fields")
    public void fill_the_required_fields() {
        PageCheckout co = new PageCheckout();
        co.fieldEmail.sendKeys(UserReader.getUser("user.anil"));
        co.fieldName.sendKeys("Anil");
        co.fieldAddress.sendKeys("United States of America");
        co.fieldPhone.sendKeys("03123121212");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(false);", co.dropDownCity);
        ReusableMethods.wait(1);
        co.dropDownCity.click();
        ReusableMethods.wait(1);
        co.itemCity.click();
    }

    @When("Click Continue to Shipping button")
    public void click_continue_to_shipping_button() {
        new PageCheckout().buttonContinueToShipping.click();
    }

    @When("Select Free Shipping option")
    public void select_free_shipping_option() {
        new PageCheckoutPost().radioFreeShipping.click();
    }

    @When("Click Continue to Payment button")
    public void click_continue_to_payment_button() {
        WebElement webElement = ReusableMethods.waitForVisibility(new PageCheckoutPost().buttonContinueToPayment, 20);
        webElement.click();
    }

    @Then("Verify that Ship To element is visible")
    public void verify_that_ship_to_element_is_visible() {
        PageCheckoutPost postCheckout = new PageCheckoutPost();
        WebElement webElement = ReusableMethods.waitForVisibility(postCheckout.buttonContinueToPayment, 20);
        Assert.assertTrue(webElement.isDisplayed());
    }

    @Then("Verify that Continue to Payment button is visible")
    public void verifyThatContinueToPaymentButtonIsVisible() {
        WebElement webElement = ReusableMethods.waitForVisibility(new PageCheckoutPost().buttonContinueToPayment, 20);
        Assert.assertTrue(webElement.isDisplayed());
    }

    @When("Save the tax added price and product name")
    public void save_the_tax_added_price_and_product_name() {
        PageCheckoutPost postCheckout = new PageCheckoutPost();
        productPrice = postCheckout.labelTaxAddedPrice.getText();
        productName = postCheckout.labelProductName.getText();
    }

    @Then("Verify that Pay Now button is visible")
    public void verifyThatPayNowButtonIsVisible() {
        WebElement payNow = new PagePayment().buttonPayNow;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(false);", payNow);
        Assert.assertTrue(payNow.isDisplayed());
    }

    @When("Clicks to Pay Now button")
    public void clicks_to_pay_now_button() {
        WebElement payNow = new PagePayment().buttonPayNow;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(false);", payNow);
        ReusableMethods.clickWithJS(payNow);
    }

    @Then("Verify that Summary Field is visible")
    public void verify_that_summary_field_is_visible() {
        boolean isDisplayed = new PageSummary().labelSummary.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Then("Verify that information of the product in the summary page are same")
    public void verifyThatInformationOfTheProductInTheSummaryPageAreSame() {
        PageSummary summary = new PageSummary();
        String title = summary.titleProduct.getText();
        String price = summary.priceProduct.getText();
        Assert.assertEquals(productName, title);
        Assert.assertEquals(productPrice, price);
    }

    @Then("verify that Continue to Shopping button is visible")
    public void verifyThatContinueToShoppingButtonIsVisible() {
        new PageSummary().buttonContinueShopping.isDisplayed();
    }

    @When("Clicks the Continue to Shopping button")
    public void clicks_the_continue_to_shopping_button() {
        new PageSummary().buttonContinueShopping.click();
    }
}
