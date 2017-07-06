package com.esure.api.vehicle.mock;

import com.esure.api.common.client.WireMockClient;
import com.github.tomakehurst.wiremock.WireMockServer;

/**
 * Created by bhawana on 13/06/2017.
 */

public class Service {
    public WireMockServer wireMockServer;

    public void MockServer() {
        wireMockServer = new WireMockServer(); //No-args constructor will start on port 8080, no HTTPS
        wireMockServer.start();
        WireMockClient.invoke();
        wireMockServer.stop();
    }
}
