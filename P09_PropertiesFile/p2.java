package P09_PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class p2 {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("P09_PropertiesFile/app.properties");
        props.load(fis);
        for (String key:props.stringPropertyNames()){
            System.out.println(key + ":" + props.getProperty(key));
        }
       

    }
}
