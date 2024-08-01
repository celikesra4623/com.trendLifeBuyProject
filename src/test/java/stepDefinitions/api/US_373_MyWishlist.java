package stepDefinitions.api;

import hooks.api.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;

import java.math.BigDecimal;
import java.math.BigInteger;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class US_373_MyWishlist {


    private Response response = HooksAPI.response;
    private RequestSpecification spec = HooksAPI.spec;

    @Given("API User verify that user id {int}")
    public void api_user_verify_that_user_id(Integer user_id) {

        response.then().assertThat().body("products.1[0].user_id", equalTo(user_id));

    }

    @Given("API user verify that seller id is {int}")
    public void api_user_verify_that_seller_id_is(Integer seller_id) {

        response.then().assertThat().body("products.1[0].seller_id", equalTo(seller_id));
    }

    @Given("API User verify that type is {string}")
    public void api_user_verify_that_type_is(String myWishListType) {
        response.then().assertThat().body("products.1[0].type", equalTo(myWishListType));
    }

    @Given("API user verify that seller product id is {int}")
    public void api_user_verify_that_seller_product_id_is(Integer seller_product_id) {
        response.then().assertThat().body("products.1[0].seller_product_id", equalTo(seller_product_id));
    }
    @Given("API user verify that product id is {int}")
    public void api_user_verify_that_product_id_is(Integer product_id) {
        response.then().assertThat().body("products.1[0].product.product_id", equalTo(product_id));
    }

    @Given("API user verify that product name is {string}")
    public void api_user_verify_that_product_name_is(String product_name) {
        response.then().assertThat().body("products.1[0].product.product_name", equalTo(product_name));
    }

    @Given("API user enters seller id {int}, seller product id {int}, type {string}")
    public void api_user_enters_seller_id_seller_product_id_type(Integer s_id, Integer sp_id, String type) {
        JSONObject reqBody = new JSONObject();

        reqBody.put("type", type);
        reqBody.put("seller_id", s_id);
        reqBody.put("seller_product_id", sp_id);


        System.out.println(reqBody.toString(2));

        response = given()
                .headers("Authorization", "Bearer " + HooksAPI.token)
                .contentType(ContentType.JSON)
                .accept("application/json")
                .spec(spec)
                .when()
                .body(reqBody.toString())
                .post(HooksAPI.fullPath);
        HooksAPI.response = response;

        response.prettyPrint();

    }




}
