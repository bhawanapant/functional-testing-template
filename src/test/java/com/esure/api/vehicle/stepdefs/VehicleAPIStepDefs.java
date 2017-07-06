package com.esure.api.vehicle.stepdefs;

import com.esure.api.common.annotation.SpringTestAnnotation;
import com.esure.api.common.config.ConfigVariables;
import com.esure.api.common.state.ScenarioState;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static com.esure.api.common.state.HttpMethod.GET;

@SpringTestAnnotation
public class VehicleAPIStepDefs {

    @Autowired private ScenarioState scenario;
    @Autowired private ConfigVariables configVariables;


    @Given("^The vehicle exist with valid registration number (.*)$")
    public void vehicle_exist_with(String vrn) throws Throwable {
        scenario.request()
            .httpMethod(GET)
            .path(configVariables.getVehicleApiUrl())
            .param("registration-plate", vrn);
    }

    @When("^A request is sent to vehicle API$")
    public void request_is_sent_to_vehicle_api() throws Throwable {
        scenario.sendRequest();
    }

    @Then("^The response is success code is (.*)$")
    public void the_response_code_is(int statusCode) throws Throwable {
        scenario.response().statusCodeIs(statusCode);
    }

    @And("^response should contain vrn as \"([^\"]*)\"$")
    public void verify_details_of_the_response_body(String vrn) throws Throwable {
        scenario.response().verifyResposeBodyDetailIs();
    }
}
