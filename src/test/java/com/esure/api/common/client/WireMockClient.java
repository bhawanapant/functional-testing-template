package com.esure.api.common.client;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;

/**
 * Created by bhawana on 13/06/2017.
 */
public class WireMockClient {

    public static void invoke(){
        configureFor("localhost", 8080);
        stubFor(get(urlEqualTo("/my/resource"))
            .withHeader("Accept", equalTo("text/xml"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "text/xml")
                .withBody("Hello World")));

    }
}
