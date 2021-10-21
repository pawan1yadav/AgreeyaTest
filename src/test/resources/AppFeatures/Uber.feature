@All
Feature: Uber online Bookking Feature

@Smoke
Scenario: Booking Cab sedan
Given User want to select a car type "sedan" from Uber application
When  User select a car "sedan" and pick up point "Banglore" and drop location "Pune"
Then Driver start the journey
And  Driver ends the journey
Then User pays 1000 USD

@Regression
Scenario: Booking Cab SUV
Given User want to select a car type "SUV" from Uber application
When  User select a car "sedan" and pick up point "Delhi" and drop location "UP"
Then Driver start the journey
And  Driver ends the journey
Then User pays 1000 USD

@Regression @Smoke
Scenario: Booking Cab Mercidise
Given User want to select a car type "Mercidise" from Uber application
When  User select a car "sedan" and pick up point "" and drop location "MP"
Then Driver start the journey
And  Driver ends the journey
Then User pays 1000 USD

@Prod
Scenario: Booking Cab Indigo
Given User want to select a car type "Indigo" from Uber application
When  User select a car "sedan" and pick up point "Delhi" and drop location "MP"
Then Driver start the journey
And  Driver ends the journey
Then User pays 1000 USD