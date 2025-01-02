Feature: Queue Feature
 
Background: The user is logged in DS Algo portal
  	Given The user is on DS-ALGO application sign in page
  	When The user enter valid credentials "SDET185" and password as "@SDET!*%"
  	Then The user should land in homepage

Scenario: User is able to navigate to Queue page clicking on Get Started
    Given The user is on the Home page	
    When User clicks the Get Started button in Queue 
    Then User should be redirected to the "Queue" page clicking on Get Started
	
Scenario: User is able to navigate to Implementation of Queue in python page 
    Given User is on the Queue Page
    When user clicks Implementation of Queue in python link
    Then User should be redirected to the "Implementation of Queue in Python" Page	
    
Scenario: User is able to navigate to try Editor on Queue page 
    Given  User is on the Implementation of Queue in python link
    When  user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test

          
Scenario: User is able to navigate to Implementation using Collection.deque page 
    Given User is on the Queue Page
    When User clicks  Implementation using Collection.deque link
    Then User should be redirected to the "Implementation using collections.deque" Page
    
Scenario: User is able to navigate to try Editor on Queue Pages 
    Given  User is on the Implementation using Collection.deque link
    When  user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test
    
Scenario: User is able to navigate to Implementation using array page  
    Given User is on the Queue Page
    When user clicks  Implementation using array page  link
    Then User should be directed to the "Implementation using array" page
    
Scenario: User is able to Interact  with Code Editor on Queue Pages 
    Given  User is on the Implementation using Collection.deque link
    When  user clicks try here button
    Then user should be redirected to a page having an tryEditor with a Run button to test
    
Scenario: User is able to navigate to Queue Operations page 
    Given User is on the Queue Page
    When user clicks  Queue Operations page link
    Then User should be redirected to the "Queue Operations" Page
    
Scenario: User is able to navigate to Practice Questions 
    Given  User is on the Queue Operation page 
    When  user clicks Practice Questions link
    Then User should be directed to the "Practice Questions" Page with list of Questions Page 
       
Scenario Outline: Validation of valid python code in TryEditor page
    Given User is on the "Try Editor Page".
    When User should enter Valid Python code from sheet "<SheetName>" and <RowNumber>
    And User clicks on Run 
    Then User should see the  valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
 Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page". 
    When User should enter Invalid Python code from sheet "<SheetName>" and <RowNumber>
    And User clicks on  the Run 
    Then User should be able to see the Error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
           
    
 
