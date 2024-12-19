package com.example.Webscraper.model;

public class BrightDataResponse {
    private String status;
    private String data;

    public BrightDataResponse() {}

    public BrightDataResponse(String status, String data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
