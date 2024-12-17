
Feature: Graph Feature

Background: The user is logged in DS Algo portal
  	Given The user is on DS-ALGO application sign in page
  	When The user enter valid credentials "SDET185" and password as "@SDET!*%"
  	Then The user should land in homepage

    
 Scenario: User is able to navigate to Graph home page clicking on Get Started 
    Given The user is on the Home page	
		When User clicks the Get Started button in Graph 
		Then User should be redirected to the Graph home page clicking on Get Started
		
Scenario: User is able to navigate to Graph page from  Graph home Page 
    Given user is on the Graph home Page
    When user clicks Graph
    Then user should be redirected to Graph page from  Graph home Page		
    
Scenario: User is able to navigate to try Editor on Graph Page 
    Given user is on the Graph Page
    When user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test
    

Scenario:  User is able to navigate to the Graph Representation page
    Given user is on the Graph Page 
    When user clicks on the Graph Representation link
    Then user should be redirected to the Graph Representation Page
    
Scenario: User is able to navigate to try Editor on Graph Representation Page 
    Given user is on the Graph Representation Page
    When user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test
    
Scenario: User is able to navigate to Practice Questions 
    Given User is on the Graph Representations
    When user clicks Practice Questions  link
    Then User should be directed to the Practice Question Page with list of Questions Page
    
    Scenario Outline: User is able to Interact with Code Editor on Graph Page with Valid python code
    Given user is on Try Editor
    When  user enter valid pythonCode in tryEditor as "<Input>"
    Then  user should be presented with Run result
    Examples:
     |Input| 
     |print('Hello')|
    
Scenario Outline:  User is able to Interact  with Code Editor on Graph Page with InValid python code
    Given user is on Try Editor
    When  user enter Invalid pythonCode in tryEditor as "<Input>"
    Then  The user should get an alert message
    Examples:
     |Input| 
     |print Hello|   
 