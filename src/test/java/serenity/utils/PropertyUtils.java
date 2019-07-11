package serenity.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
    Properties prop = new Properties();
    String baseURI=null;
    String key = null;
    public void getRestData() throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"test//resources//restEnv.property");
        prop.load(fis);
        baseURI = prop.getProperty("HOST");
        baseURI = prop.getProperty("KEY");

    }


}
