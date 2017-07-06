package com.esure.api.common.state;

import io.restassured.response.Response;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.Assertions.assertThat;

@Component
public class ResponseState {

    private Response response;

    public void response(Response response) {
        this.response = response;
    }

    public void statusCodeIs(int statusCode) {
        assertThat(response.getStatusCode()).isEqualTo(statusCode);
    }

    public void verifyResposeBodyDetailIs() {
    }
}
