$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("VehicleApi.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "As user of vehicle API\nI used be able to fetch details for vehicle for given vehicle registration number",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Vehicle API fetch the details based on vehicle registration number",
  "description": "",
  "id": ";vehicle-api-fetch-the-details-based-on-vehicle-registration-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "The vehicle exist with valid registration number \"\u003cvalidRegistrationPlate\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "A request is sent to vehicle API",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The response is success code is 200",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "response should contain vrn as \"\u003cvalidRegistrationPlate\u003e\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "\"\u003cvalidRegistrationPlate\u003e\"",
      "offset": 49
    }
  ],
  "location": "VehicleAPIStepDefs.vehicle_exist_with(String)"
});
formatter.result({
  "duration": 1283477350000,
  "status": "passed"
});
formatter.match({
  "location": "VehicleAPIStepDefs.request_is_sent_to_vehicle_api()"
});
