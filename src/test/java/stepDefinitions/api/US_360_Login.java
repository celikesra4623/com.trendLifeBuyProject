package stepDefinitions.api;

import hooks.api.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class US_360_Login {
    @Given("API user enters email to {string} email and {string} password and send post request")
    public void api_user_enters_email_to_email_and_password_and_send_post_request(String email, String password) {
        JSONObject reqBody = new JSONObject();

        reqBody.put("email", email);
        reqBody.put("password", password);

        System.out.println(reqBody.toString(2));

        HooksAPI.response = given()
                .headers("Authorization", "Bearer " + HooksAPI.token)
                .contentType(ContentType.JSON)
                .accept("application/json")
                .spec(HooksAPI.spec)
                .when()
                .body(reqBody.toString())
                .post(HooksAPI.fullPath);
        HooksAPI.response.prettyPrint();
    }

}
