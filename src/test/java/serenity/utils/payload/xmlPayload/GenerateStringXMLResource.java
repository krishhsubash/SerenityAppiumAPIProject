package serenity.utils.payload.xmlPayload;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GenerateStringXMLResource {

    public static String generateXMLAsString(String xmlFile) throws IOException {
        return new String(Files.readAllBytes(Paths.get(xmlFile)));

    }
}
