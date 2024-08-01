package stepDefinitions.db;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

public class US_381_Carts {



    @Then("DB user creates a product in the carts table with the {int} id, {int} seller id, {string} product type, {int} product id, {int} qty, {int} price")
    public void db_user_creates_a_product_in_the_carts_table_with_the_id_seller_id_product_type_product_id_qty_price(Integer id, Integer sellerID, String productType, Integer productID, Integer qty, Integer price) {
        int resultCode =  DBUtils.insertProduct(String.valueOf(id), String.valueOf(sellerID), productType,String.valueOf(productID),String.valueOf(qty),String.valueOf(price));
        Assert.assertEquals(1, resultCode);
    }



}
