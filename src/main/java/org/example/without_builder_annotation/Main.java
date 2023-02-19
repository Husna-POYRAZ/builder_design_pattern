package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Country country = new Country.Builder()
                .id("TR")
                .name("Turkey")
                .nativeName("Türkiye")
                .phoneCode(90)
                .continent("AS")
                .capital("Ankara")
                .currency("TRY")
                .languages(Arrays.asList("tr"))
                .build();
        System.out.println(country);

        Country country1 = new Country.Builder()
                .id("CA")
                .name("Canada")
                .languages(Arrays.asList("en", "fr"))
                .build();
        System.out.println(country1);
    }
}