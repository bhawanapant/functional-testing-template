package com.esure.api.common.state;

import com.esure.api.common.client.RestClient;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScenarioState {

    @Autowired private RequestState requestState;
    @Autowired private RestClient restClient;
    @Autowired private ResponseState responseState;

    public void sendRequest() throws Exception {
        Response response = restClient.invoke(requestState);
        responseState.response(response);
    }

    public RequestState request() {
        return requestState;
    }

    public ResponseState response() {
        return responseState;
    }
}
