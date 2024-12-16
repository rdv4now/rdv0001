package com.crs.payload;

import java.util.Date;

public class ErrorDetails {

    private Date date;
    private String message;
    private String request;

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public ErrorDetails(String message, Date date, String request) {
        this.message = message;
        this.date = date;
        this.request = request;
    }

    public String getRequest() {
        return request;
    }
}
