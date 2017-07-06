Feature:
  As user of vehicle API
  I used be able to fetch details for vehicle for given vehicle registration number

Scenario: Vehicle API fetch the details based on vehicle registration number
  Given The vehicle exist with valid registration number "<validRegistrationPlate>"
  When  A request is sent to vehicle API
  Then The response is success code is 200
  And response should contain vrn as "<validRegistrationPlate>"

#Examples:
#|validRegistrationPlate|
#|LC03HYX               |
#|P783WLS               |