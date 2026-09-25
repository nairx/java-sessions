package com.example;

import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException{
        Properties props = new Properties();
        InputStream input = Main.class.getClassLoader().getResourceAsStream("config.properties");
        props.load(input);
        System.out.println(props.getProperty("app.name"));

    }
}