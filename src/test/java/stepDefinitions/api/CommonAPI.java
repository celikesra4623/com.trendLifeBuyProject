package stepDefinitions.api;

import hooks.api.HooksAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CommonAPI {

    private static Response response = HooksAPI.response;
    private RequestSpecification spec = HooksAPI.spec;

    @Given("API user sets required path params {string}")
    public void api_user_sets_required_path_params(String rawPaths) {
        String[] paths = rawPaths.split(",");
        StringBuilder tempPath = new StringBuilder("{");
        for (int i = 0; i < paths.length; i++) {
            String key = "get" + i;
            spec.pathParam(key, paths[i].trim());
            tempPath.append(key + "}/{");
        }
        tempPath.deleteCharAt(tempPath.lastIndexOf("{"));
        tempPath.deleteCharAt(tempPath.lastIndexOf("/"));
        HooksAPI.fullPath = tempPath.toString();
    }

    @Given("API user sends requests and gets response")
    public void api_user_sends_requests_and_gets_response() {
        response = given()
                .headers("Authorization", "Bearer " + HooksAPI.token)
                .contentType(ContentType.JSON)
                .spec(spec)
                .when()
                //.body(HooksAPI.dataCredentials)
                .get(HooksAPI.fullPath);
        HooksAPI.response = response;
        HooksAPI.response.prettyPrint();
    }

    @Then("API user verify that status code is {int}")
    public void api_user_verify_that_status_code_is(int statusCode) {
        HooksAPI.response.then().assertThat()
                .statusCode(statusCode)
                .contentType(ContentType.JSON);
        HooksAPI.response.prettyPrint();
    }

    @Then("API user verify response with matcher class")
    public void api_user_verify_response_with_matcher_class() {
        response.then().body("user.id", equalTo(453));
        response.then().body("user.username", equalTo("4545464646"));
        response.then().body("user.last_name", equalTo("testLastName"));
    }

    @Then("API user verify response with json path")
    public void api_user_verify_response_with_json_path() {
        JsonPath json = response.jsonPath();

        int actualId = json.getInt("user.customer_addresses[0].customer_id");
        Assert.assertEquals(453, actualId);

        String actualState = json.getString("user.customer_addresses[0].state");
        Assert.assertEquals("3953", actualState);
    }

    @Given("API user verify that response message is {string} v1")
    public void api_user_verify_that_response_message_is_v1(String message) {
        HooksAPI.response.then().body("msg", equalTo(message));
    }

    @Given("API user verify that response message is {string} v2")
    public void api_user_verify_that_response_message_is_v2(String message) {
        HooksAPI.response.then().body("message", equalTo(message));
    }

}
