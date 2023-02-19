package org.example.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Country {
    private String id;
    private String name;
    private String nativeName;
    private int phoneCode;
    private String continent;
    private String capital;
    private String currency;
    private List<String> languages;

    @Override
    public String toString() {
        return "Country{" + '\n' +
                "id: " + id + '\n' +
                "name: " + name + "\n" +
                "nativeName: " + nativeName + "\n" +
                "phoneCode: " + phoneCode + "\n" +
                "continent: " + continent + "\n" +
                "capital: " + capital + "\n" +
                "currency: " + currency + "\n" +
                "languages: " + languages + "\n" +
                "}";

    }
}
