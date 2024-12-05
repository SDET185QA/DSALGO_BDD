@DataStructurePage
Feature: Data Structure page validation dsalgo

  Background: The user is logged in to DS Algo portal
    Given The User is on Sign In Page of DsAlgo Portal
    When The user enters valid UserName and Password
    And  User clicks on signin button
    Then The User is redirected to the HomePage

  Scenario: User is clicks on datastructure page
    Given The user is on HomePage 
    When User clicks on DataStructures GetStarted
    Then User is redirected to DataStructures - Introduction Page
    When User clicks on TimeComplexiy
    Then It should navigate to TimeComplexity Page
    When User clicks on TryHere 
    Then It should navigate to Python Code Editor
    When User enters the valid Python Code
      | print"DataStructure Introduction" |
    And clicks on Run button
    Then The editor should print the valid result