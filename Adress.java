package com.gmail.dmytrohrytsenko5;

public class Adress {
    private String country;
    private String street;
    private  String city;

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
