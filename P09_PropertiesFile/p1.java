package P09_PropertiesFile;

import java.io.*;

import java.util.Properties;

public class p1 {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("P09_PropertiesFile/app.properties");
        props.load(fis);
        System.out.println(props.getProperty("app.name"));
        System.out.println(props.getProperty("db.url"));

    }
}
