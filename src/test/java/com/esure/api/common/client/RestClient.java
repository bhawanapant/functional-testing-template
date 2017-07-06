package com.esure.api.common.client;

import com.esure.api.common.state.HttpMethod;
import com.esure.api.common.state.RequestState;
import io.restassured.response.Response;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.given;


@Component
public class RestClient {


    public Response invoke(RequestState requestState) throws Exception {
        HttpMethod method = requestState.getHttpMethod();

        switch (method) {
            case GET:
                return given()
                    .queryParams(requestState.getQueryParams())
                    .when()
                    .get(requestState.getPath())
                    .thenReturn();
            default:
                throw new Exception("Not Implemented for method " + method.name());
        }

    }
}
