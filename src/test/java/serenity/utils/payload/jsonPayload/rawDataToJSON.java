package serenity.utils.payload.jsonPayload;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class rawDataToJSON {

    public static JsonPath rawToJSON(Response res) {
        String response = res.toString();
        JsonPath jsonPath = new JsonPath(response);
        return jsonPath;
    }

}
