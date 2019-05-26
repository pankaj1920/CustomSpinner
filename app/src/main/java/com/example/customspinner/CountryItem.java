package com.example.customspinner;

public class CountryItem {
    String country_name;
    int country_flag;

    public CountryItem(String country_name, int country_flag) {
        this.country_name = country_name;
        this.country_flag = country_flag;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public int getCountry_flag() {
        return country_flag;
    }

    public void setCountry_flag(int country_flag) {
        this.country_flag = country_flag;
    }
}

//Create a CustomAdapter to fill our spinner with these item