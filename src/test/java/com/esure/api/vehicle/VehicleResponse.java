package com.esure.api.vehicle;

/**
 * Created by bhawana on 12/06/2017.
 */
public class VehicleResponse {
    private String vrm = "afdsfd";
    private String registrationDate = "afdada";
    private String colourCode = "asdfds";
    private String colourDescription = "afadsfds";

    public VehicleResponse setVrm(String vrm) {
        this.vrm = vrm;
        return this;
    }

    public VehicleResponse setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    public VehicleResponse setColourCode(String colourCode) {
        this.colourCode = colourCode;
        return this;
    }
    public VehicleResponse setColourDescription(String colourDescription) {
        this.colourDescription = colourDescription;
        return this;
    }

}
