package com.broadridge;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        String name = "John";

        System.out.println(name.toUpperCase());

        System.out.println(StringUtils.upperCase(name));

    }
}