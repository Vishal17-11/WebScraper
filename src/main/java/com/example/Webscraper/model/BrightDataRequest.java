package com.example.Webscraper.model;

public class BrightDataRequest {
    private String url;
    private String country;

    public BrightDataRequest(String url, String country) {
        this.url = url;
        this.country = country;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
