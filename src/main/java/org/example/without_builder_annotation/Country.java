package org.example;

import java.util.List;

public class Country {
    private String id;
    private String name;
    private String nativeName;
    private int phoneCode;
    private String continent;
    private String capital;
    private String currency;
    private List<String> languages;

    public Country(String id, String name, String nativeName, int phoneCode, String continent, String capital, String curency, List<String> languages) {
        this.id = id;
        this.name = name;
        this.nativeName = nativeName;
        this.phoneCode = phoneCode;
        this.continent = continent;
        this.capital = capital;
        this.currency = curency;
        this.languages = languages;
    }

    public static class Builder {
        private String id;
        private String name;
        private String nativeName;
        private int phoneCode;
        private String continent;
        private String capital;
        private String currency;
        private List<String> languages;

        /*
        * Default constructor
        */
        public Builder() {}

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder nativeName(String nativeName) {
            this.nativeName = nativeName;
            return  this;
        }

        public Builder phoneCode(int phoneCode) {
            this.phoneCode = phoneCode;
            return this;
        }

        public  Builder continent(String continent) {
            this.continent = continent;
            return this;
        }

        public Builder capital(String capital) {
            this.capital = capital;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder languages(List<String> languages) {
            this.languages = languages;
            return this;
        }

        public Country build() {
            return new Country(id, name, nativeName, phoneCode, continent, capital, currency, languages);
        }
    }

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
