package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class URLReader {
    private static Properties properties;

    static {
        String path = "src/test/resources/configs/urlList.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getUrl(String userKey) {
        return properties.getProperty(userKey);
    }
}

