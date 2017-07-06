package com.esure.api.common.state;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RequestState {

    private HttpMethod httpMethod;
    private String path;
    private Map<String, String> queryParams = new HashMap<>();

    public RequestState httpMethod(HttpMethod httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    public HttpMethod getHttpMethod() {
        return httpMethod;
    }

    public RequestState param(String key, String value) {
        queryParams.put(key, value);
        return this;
    }

    public Map<String, String> getQueryParams() {
        return queryParams;
    }

    public RequestState path(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return path;
    }
}
