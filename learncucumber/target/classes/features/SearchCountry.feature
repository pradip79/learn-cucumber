#This feature enables a user search for country names
Feature: Search for country names
  In order to know about few countries
  As a user
  I want to search few country names
#First scenario
Scenario: Search for an Asian country
  Given I am on Main Page
  When I search for country "India"
  Then I verify "India" displays in the header
