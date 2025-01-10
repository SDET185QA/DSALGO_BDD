@Stack
Feature: Stack
Background: The user is logged in DS Algo portal
 Given The user logged in to dsAlgo Portal with credentials from "SignIn" and row 5

#@Tag1 always in comment
#	Scenario: Verify that user is able to land on Stack Page
#	Given The user is on the secondary home page after logged in
#	When The user clicks on Get Started under the Stack 
#	Then The user should be able to land on the Stack page

#@Tag2 Always in comment
#	Scenario: Verify the user is able to land when Stack option is selected
#	Given The user is on the secondary home page after logged in
#	When The user selects Stack from the menu bar
#	Then The user should land on Stack page

@Tag3 
Scenario: Verify the user is able to view the Operations in Stack
Given The user is on Stack page
When The user clicks on Operations in Stack link
Then The user should be able to view the details pertaining to the Operation in Stack 

@Tag4
	Scenario: Verify the user is able to view  Implementation page
	Given The user is on Stack page
	When The user clicks on Implementation link
	Then The user should be able to view the details pertaining to the Implementation page
	
@Tag5
	Scenario: Verify the user is able to view Appllications page
	Given The user is on Stack page
	When The user clicks on Applications link
	Then The user should be able to view the details pertaining to the Applications page
	
@Tag6
	Scenario Outline: Verify the user is able to navigate to practice questions page from every subpages on stack
	Given The user is on Stack page
	When The user navigate to Stack subpage from "<sheetName>" and <rowNumber>
	And The user clicks on Practice Questions link
	Then The user should be able to view the details pertaining to the Practice questions page
	Examples:
|sheetName|rowNumber|
|StackSubPage|2|
|StackSubPage|3|
|StackSubPage|4|

@Tag7
	Scenario Outline: Verify the user is able to navigate to try editor page from every subpages on stack
	Given The user is on Stack page
	When The user navigate to Stack subpage from "<sheetName>" and <rowNumber>
	And The user clicks on try here link on the subpage
	Then The user should navigate to try editor page  
	Examples:
|sheetName|rowNumber|
|StackSubPage|2|
|StackSubPage|3|
|StackSubPage|4|

@Tag8
	Scenario: Verify the user is able to view the error message without entering code and click on Run button on Try Editor Page
	Given The user is on Stack page
	And The user is on Try Editor Page
	When The user click on Run button without entering code
	Then The error message should be displayed on screen
	
@Tag9
	Scenario Outline: Verify If User is able to execute the valid python code in Try Editor
	Given The user is on Stack page
 	And The user navigates to Try Editor page from Stack
  When The user enters code from "<sheetName>" and <rowNumber> from try editor
	And The user click on Run button
  Then The user should be able to view the result in console window

Examples:
|sheetName|rowNumber|
|PythonCode|12|
	
@Tag10
	Scenario Outline: Verify If User is able to execute the invalid python code in Try Editor
	Given The user is on Stack page
 	And The user navigates to Try Editor page from Stack
  When The user enters code from "<sheetName>" and <rowNumber> from try editor
	And The user click on Run button
	Then The user should get error message in a pop up window
	Examples:
|sheetName|rowNumber|
|PythonCode|13|
