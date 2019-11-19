package serenity.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class restResources {

    public static String restDataResource() {
        String resource = "";
        return resource;
    }

    public static void launch_RESTURI(String URI) {
        RestAssured.get(URI);
    }

    public static int verifyStatusCode() {
        int statusCode = 0;


        return statusCode;
    }

    public boolean assertStatusCode() {
        boolean flag = false;

        return flag;
    }

    public boolean deleteEndpoint() {
        boolean flag = false;

        return flag;
    }
}
