
@array
Feature: User is in DS-ALGO application page and test the Array page


  Background: The user is logged in DS Algo portal
  	Given The user is on DS-ALGO application sign in page
  	When The user enter valid credentials "SDET185" and password as "@SDET!*%"
  	Then The user should land in homepage 
 

  @TestScenario01_array
  Scenario: The user is able to navigate to array page in Datasturcture
  
    Given The user is on the home page of DS-ALGO application
    When The user select the drop down option and select the array option
    Then The user lands in the arrays Datastructure page