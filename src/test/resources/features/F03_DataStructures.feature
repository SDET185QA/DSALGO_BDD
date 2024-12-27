@data-structures-introduction
Feature: Data Structures Introduction Functionality


 Background: The user is logged in DS Algo portal
  	Given The user is on DS-ALGO application sign in page
  	When The user enter valid credentials "SDET185" and password as "@SDET!*%"
  	Then The user should land in homepage

  @TestScenario_dS_01
    Scenario: Redirect to Data Structures Introduction page by clicking on Get Started button
   	Given The user is logged in and on the HomePage
		When The user clicks the Get Started button on Home Page Page
		Then The user should be redirected to the "Data Structures-Introduction" page
		
	@TestScenario_dS_02
		Scenario: User is redirected to Time Complexity Page
		Given  User is on  the Data-Structures-Introduction page
		When The user clicks Time Complexity
	  Then  user is redirected to "Time Complexity" Page

	@TestScenario_dS_03
    Scenario: User is able to navigate to try Editor on Time Complexity Page 
    Given  User is on the Time Complexity Page 
    When  user clicks try here button of Time Complexity
    Then user should be redirected to a page having an tryEditor with a Run button
    
 	@TestScenario_dS_04
    Scenario Outline: User is able to Interact  with Code Editor on Data Structures-Introduction with Valid python code
    Given user is on Try Editor page of Data Structures-Introduction
    When User enters a valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks the Run button
    Then User should be able to see valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
     
  @TestScenario_dS_05  
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given user is on Try Editor page of Data Structures-Introduction
    When User enters a invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message dialogue

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
      
 @TestScenario_ds_06
   Scenario: User is able to navigate to Practice Questions
    Given  User is on the Time Complexity Page 
    When  user clicks on Practice Questions link
    Then user should be redirected to "Practice Questions" page  
    
