package com.esure.api.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigVariables {

    @Value("${vehicleApiUrl}")
    private String vehicleApiUrl;

    public String getVehicleApiUrl() {
        return vehicleApiUrl;
    }
}
