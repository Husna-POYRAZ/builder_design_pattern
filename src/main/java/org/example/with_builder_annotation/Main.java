package org.example.test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Country country = Country.builder()
                .id("ZA")
                .name("South Africa")
                .capital("Pretoria")
                .languages(Arrays.asList("af", "en", "nr", "st", "ss", "tn", "ts", "ve", "xh", "zu"))
                .build();
        System.out.println(country);
    }
}
