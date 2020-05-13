package util;

import java.io.FileInputStream;
import java.util.Properties;

public class configurationReader {
    private static Properties properties;

    static{
        try{
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getData(String key){
        return properties.getProperty(key);
    }
}
