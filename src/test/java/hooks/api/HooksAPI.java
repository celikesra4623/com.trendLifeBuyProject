package hooks.api;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.Authentication;
import utilities.ConfigReader;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class HooksAPI {
    //Bu sepece herkes nasil ulasir? cozum uretmemiz gerekiyor
    //HooksAPI.spec ile herkes ulasabilir. bu bir cozum
    public static RequestSpecification spec;
    public static String token;
    public static Map<String, Object> dataCredentials = fillMap();
    public static Response response;
    public static String fullPath;

    @Before(order = 0)
    public void beforeAPIScnerio() {
        spec = new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("base_url"))
                .build();
    }

    @Before(order = 1)
    public void beforeAPIGenerateToken() {
        token = Authentication.generateToken();
        //System.out.println(token);
    }

    private static Map<String, Object> fillMap() {
        Map<String, Object> bodyData = new HashMap<>();
        bodyData.put("email", ConfigReader.getProperty("email"));
        bodyData.put("password", ConfigReader.getProperty("password"));
        return bodyData;
    }

    @After
    public void afterCloseSources() {
        response = null;
        fullPath = null;
    }
}