package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utils {
    public utils(){}
    public static String fetchConfigProperties(String prop) throws IOException {
        FileInputStream loadProperties = new FileInputStream(System.getProperty("user.dir")+"//src/main/resources/testData.properties");
        Properties globalProperties = new Properties();
        globalProperties.load(loadProperties);
        String propertyValue = globalProperties.getProperty(prop);
        return propertyValue;
    }
}
