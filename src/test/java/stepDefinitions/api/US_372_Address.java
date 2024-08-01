package stepDefinitions.api;

import hooks.api.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class US_372_Address {

    private Response response = HooksAPI.response;
    private RequestSpecification spec = HooksAPI.spec;

    @Given("API user verify that id {int}")
    public void api_user_verify_that_id(Integer id) {
        response.then().assertThat().body("addresses[0].id", equalTo(id));
    }
    @Given("API user verify that customer id is {int}")
    public void api_user_verify_that_customer_id_is(Integer cs_id) {
        response.then().assertThat().body("addresses[0].customer_id", equalTo(cs_id));
    }
    @Given("API user verify that address is {string}")
    public void api_user_verify_that_address_is(String address) {
        response.then().assertThat().body("addresses[0].address", equalTo(address));
    }
    @Given("API user verify that country name is {string}")
    public void api_user_verify_that_country_name_is(String country_name) {
        response.then().assertThat().body("addresses[0].get_country.name", equalTo(country_name));
    }

    @Given("API user enters name {string}, email {string}, address {string}, phone {string}, city {string}, state {string}, country {string}, postal_code {string}, address_type {string}")
    public void api_user_enters_name_email_address_phone_city_state_country_postal_code_address_type(String name, String email, String address, String phone, String city, String state, String country, String postal_code, String address_type) {
        JSONObject reqBody = new JSONObject();

        reqBody.put("name", name);
        reqBody.put("email", email);
        reqBody.put("address", address);
        reqBody.put("phone", phone);
        reqBody.put("city", city);
        reqBody.put("state", state);
        reqBody.put("country", country);
        reqBody.put("postal_code", postal_code);
        reqBody.put("address_type", address_type);

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


    }


    @Given("API user enters name {string}, email {string}, address {string}, phone {string}, city {string}, state {string}, country {string}, postal_code {string}, address_type {string} by {int} id")
    public void api_user_enters_name_email_address_phone_city_state_country_postal_code_address_type_by_id(String name, String email, String address, String phone, String city, String state, String country, String postal_code, String address_type, Integer id) {

        JSONObject reqBody = new JSONObject();
        reqBody.put("id", id);
        reqBody.put("name", name);
        reqBody.put("email", email);
        reqBody.put("address", address);
        reqBody.put("phone", phone);
        reqBody.put("city", city);
        reqBody.put("state", state);
        reqBody.put("country", country);
        reqBody.put("postal_code", postal_code);
        reqBody.put("address_type", address_type);

        System.out.println(reqBody.toString(2));

        response = given()
                .headers("Authorization", "Bearer " + HooksAPI.token)
                .contentType(ContentType.JSON)
                .accept("application/json")
                .spec(spec)
                .when()
                .body(reqBody.toString())
                .patch(HooksAPI.fullPath);
        HooksAPI.response = response;

    }

}
