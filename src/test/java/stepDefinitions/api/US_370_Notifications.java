package stepDefinitions.api;

import hooks.api.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class US_370_Notifications {

    private Response response = HooksAPI.response;
    private RequestSpecification spec = HooksAPI.spec;

    @Given("API user verify that user id {int}")
    public void api_user_verify_that_user_id(Integer user_id) {
        response.then().assertThat().body("notifications[0].user_id", equalTo(user_id));
    }

    @Given("API user verify that notification setting id is {int}")
    public void api_user_verify_that_notification_setting_id_is(Integer ns_id) {
        response.then().assertThat().body("notifications[0].notification_setting_id", equalTo(ns_id));
    }

    @Given("API user verify that type is {string}")
    public void api_user_verify_that_type_is(String ntfctnType) {
        response.then().assertThat().body("notifications[0].type", equalTo(ntfctnType));
    }

    @Given("API user verify that event is {string}")
    public void api_user_verify_that_event_is(String ntfctnEvent) {
        response.then().assertThat().body("notifications[0].notification_setting.event", equalTo(ntfctnEvent));
    }

    @Given("API user updates that update the event to {string} by {int} id and {string} type")
    public void api_user_updates_that_update_the_event_to_by_id_and_type(String event, Integer id, String type) {
        JSONObject reqBody = new JSONObject();
        JSONObject innerBody = new JSONObject();

        reqBody.put("type", type);
        reqBody.put("id", id);

        innerBody.put("event", event);
        reqBody.put("notification_setting", innerBody);

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

        //response.prettyPrint();

    }
}
