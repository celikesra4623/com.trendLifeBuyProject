package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {
    private static RequestSpecification spec = null;

    public static void main(String[] args) {
        generateToken();
    }

    public static String generateToken() {
        spec = new RequestSpecBuilder().setBaseUri(URI.create("https://trendlifebuy.com/api/login")).build();

        //Create data for body
        Map<String, Object> dataCredentials = new HashMap<>();
        dataCredentials.put("email", ConfigReader.getProperty("email"));
        dataCredentials.put("password", ConfigReader.getProperty("password"));

        //Send the Post request and get the data
        Response response = given()
                .spec(spec)
                .contentType(ContentType.JSON)
                .body(dataCredentials)
                .when()
                .post();
        JsonPath json = response.jsonPath();
        //TODO: responsu yazdirmaliyim
        String token = json.getString("token");
        //System.out.println("token = " + token);
        return token;
    }
}