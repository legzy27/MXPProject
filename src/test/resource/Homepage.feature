@Findadealer
@slow
Feature: This is new upgraded Mazda Europe Homepage
As a user i want to find a dealer and test drive a car


Scenario Outline: Go on mazda canada homepage Find a Dealer
Given Its my first time on the mazda website
When click on 'Mazda Home'
Then I go to 'Find a Dealer'
Then I click on search by location i see the names of all the dealer
Then I click on search by postal code i enter postcode
Then I enter correct postal code <Postal Code>
Then I enter incorrect postal code <Incorrect PostalCode>
Then I get an error message
Then I search by dealer name
Then close browser

Examples: 
 | Postal Code | Incorrect PostalCode |
 | M5P 2N7     | E3 3LP               |
 
 
 
 Scenario: I want to drive a mazda car
 Given I want to test drive a car
 When I click Book a Test Drive
 Then I see collection of vehicles
 Then I select one vehicle
 Then I select a dealer
 Then I select a date and time
 Then I enter contact details
 Then I request a Test Drive
 Then I will see Thank You!
 And I close the browser
 
 Scenario Outline: I want to request a quote
 Given I am shopping Tools page
 When I select vehicle
 Then I see list of <Mazda Vehicle>
 And I select one mazda vehicle
 And I select a dealer
 And I Enter contact details
 And I change Province
 And I request quote
 
 Examples: 
  | Mazda Vehicle       | Non Available Vehicle |
  | 2016 MAZDA3         |   MAZDA2              | 
  | 2016 MAZDA3 SPORT   |   MAZDA1              |
  | 2016 MAZDA6         |   MAZDA0              |
  | 2016 MAZDA5         |   MAZDA00             |
  | 2017 CX3            |   MAZDA02             |
  | 2016.5 CX-5         |   MAZDA03             |
  | 2016 CX-9           |   MAZDA04             |
  | 2016 MX-5           |   MAZDA05             |
  
  

 