package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US016_Pojo.RoomCreateUpdateDelete;
import pojos.US017_Pojo.CreateUpdateDeleteTestItem;

import static io.restassured.RestAssured.given;

public class ApiUtils {

    public static Response getRequest(String token, String endpoint) {

        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(endpoint);
        return response;

    }

    public static Response postRequestTestItem(String token, String endpoint, CreateUpdateDeleteTestItem createUpdateDeleteTestItem) {

        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).contentType(ContentType.JSON).body(createUpdateDeleteTestItem).when().post(endpoint);
        return response;
    }

    public static Response postRequestRoom(String token, String endpoint, RoomCreateUpdateDelete room) {

        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).contentType(ContentType.JSON).body(room).when().post(endpoint);
        return response;
    }

}