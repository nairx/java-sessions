package P09_PropertiesFile;

import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;
public class p3 {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.setProperty("name", "MyApplication");
        props.setProperty("user", "root");
        props.setProperty("password", "root");

        FileOutputStream fos = new FileOutputStream("P09_PropertiesFile/app1.properties");
        props.store(fos, "App Details");
        System.out.println("Property file created");

    }
}
