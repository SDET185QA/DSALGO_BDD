@login
Feature: Login to DS-ALGO Application and validate login page with different scenarios
 

  @TestScenario01_login
  Scenario: Verify that user is able to land on Login Page
    Given The user is on the DS Algo Home Page "https://dsportalapp.herokuapp.com/"
    
    When User enters email as "SDET185" and password as "@SDET!*%"
    Then The user should land in Data Structure Home Page with message "You are logged in"