package com.rycox.ildemo.domain;

public class HealthResponse {

    public HealthResponse() {
        this.setStatus("OK");
    }

    public HealthResponse(String status) {
        this.setStatus(status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

}
