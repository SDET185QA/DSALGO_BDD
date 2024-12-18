Feature: Queue Feature
 
Background: The user is logged in DS Algo portal
  	Given The user is on DS-ALGO application sign in page
  	When The user enter valid credentials "SDET185" and password as "@SDET!*%"
  	Then The user should land in homepage

 Scenario: User is able to navigate to Queue page clicking on Get Started
    Given The user is on the Home page	
    When User clicks the Get Started button in Queue 
    Then User should be redirected to the Queue page clicking on Get Started
	
Scenario: User is able to navigate to Implementation of Queue in python page 
    Given User is on the Queue Page
    When user clicks Implementation of Queue in python link
    Then User should be redirected to the Implementation of queue in Python Page	
    
Scenario: User is able to navigate to try Editor on Queue page 
    Given  User is on the Implementation of Queue in python link
    When  user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test

          
Scenario: User is able to navigate to Implementation using Collection.deque page 
    Given User is on the Queue Page
    When User clicks  Implementation using Collection.deque link
    Then User should be redirected to the Implementation using Collection.deque Page
    
Scenario: User is able to navigate to try Editor on Queue Pages 
    Given  User is on the Implementation using Collection.deque link
    When  user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test
    
Scenario: User is able to navigate to Implementation using array page  
    Given User is on the Queue Page
    When user clicks  Implementation using array page  link
    Then User should be redirected to the Implementation using array page
    
Scenario: User is able to Interact  with Code Editor on Queue Pages 
    Given  User is on the Implementation using Collection.deque link
    When  user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test
    
Scenario: User is able to navigate to Queue Operations page 
    Given User is on the Queue Page
    When user clicks  Queue Operations page link
    Then User should be directed to the Queue Operations page
    
  Scenario: User is able to navigate to Practice Questions 
    Given  User is on the Queue Operation page 
    When  user clicks Practice Questions link
    Then User should be directed to the Practice Question Page with list of Questions Page    
  Scenario Outline: User is able to Interact  with Code Editor on Queue Page with Valid python code
    Given user is on Try Editor page
    When  user enter valid pythonCode in tryEditor as print "<Input>"
    Then  user should be presented with Run result
    Examples:
     |Input| 
     |print('Hello')|
   Scenario Outline:  User is able to Interact  with Code Editor on Queue Page with InValid python code
    Given user is on Try Editor page
    When  user enter Invalid pythonCode in tryEditor "<Input>"
    Then  The user should get an alert message
    Examples:
     |Input| 
     |print Try|
           
    
 
