package com.admaxim.mvc.config;

import java.util.Set;

public class AdSquareData {

    private String requestId;
    private Set<String> segments;
    private String adSquareToken;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Set<String> getSegments() {
        return segments;
    }

    public void setSegments(Set<String> segments) {
        this.segments = segments;
    }

    public String getAdSquareToken() {
        return adSquareToken;
    }

    public void setAdSquareToken(String adSquareToken) {
        this.adSquareToken = adSquareToken;
    }
}
