package serenity.utils.payload.xmlPayload;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class rawDataToXML {

    public static XmlPath rawToXML(Response res) {
        String response = res.toString();
        XmlPath xml = new XmlPath(response);
        return xml;
    }

}
