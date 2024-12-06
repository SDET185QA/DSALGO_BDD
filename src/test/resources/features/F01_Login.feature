@login
Feature: Login to DS-ALGO Application and validate login page with different scenarios
 

  @TestScenario01
  Scenario: Verify that user is able to land on Login Page
    Given The user is on the DS Algo Login Page
    
    When User enters email as "SDET185" and password as "@SDET!*%"
    Then The user should land in Data Structure Home Page with message "You are logged in"
  
  @TestScenario02
  Scenario: Verify signout from DS-Algo page
     Given The user is in home page
     When The user clicks on signout button
     Then The user should be redirected to the DS Algo home page to enter email as "SDET185" and password as "@SDET!*%"