package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class UserReader {
    private static Properties properties;

    static {
        String path = "src/test/resources/configs/userList.properties";
        try {
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getUser(String userKey) {
        return properties.getProperty(userKey);
    }

    public static String getPassword(String passwordKey) {
        return properties.getProperty(passwordKey);
    }
}

