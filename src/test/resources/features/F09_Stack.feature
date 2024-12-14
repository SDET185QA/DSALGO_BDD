@Stack
Feature: Stack

@Tag1
	Scenario: Verify that user is able to land on Stack Page
	Given The user is on the secondary home page after logged in
	When The user clicks on Get Started under the Stack 
	Then The user should be able to land on the Stack page
	
@Tag2
	Scenario: Verify the user is able to land when Stack option is selected
	Given The user is on the secondary home page after logged in
	When The user selects Stack from the menu bar
	Then The user should land on Stack page
	
@Tag3 
	Scenario: Verify the user is able to view when the user clicks on Introduction
	Given The user is on Stack page
	When The user clicks on Operations in Stack link
	Then The user should be able to view the details pertaining to the Operation in Stack 
	
@Tag4
	Scenario: Verify the user is able to view the try editior page
	Given The user is on Operations in Stack page
	When The user clicks on try here link
	Then The user should land on try editor page 

@Tag5
	Scenario: Verify the user is able to view the error message without entering code and click on Run button
	Given The user is on Try Editor
	When The user clicks on Run button without entering code
	Then The error message should be displayed
	
@Tag6
	Scenario: Verify If User is able to execute the valid python code in Try editor
	Given The user is on Try Editor
	When The user enters valid python code in try editor
	Then The user should be able to view the result in console window
	
@Tag7
	Scenario: Verify If User is able to execute the invalid python code in Try editor
	Given The user is on Try Editor
	When  The user enter invalid python code in try editor 
	Then The user should get error message in a pop up window
	
@Tag8

	Scenario: Verify the user is able to view  Implementation page
	Given The user is on Stack page
	When The user clicks on Implementation link
	Then The user should be able to view the details pertaining to the Implementation page
	
@Tag9
	Scenario: Verify the user is able to view the try editior page
	Given The user is on the Implementation page
	When The user clicks on try here link
	Then The user should land on try editor page
	
@Tag10
	Scenario: Verify If User is able to execute the valid python code in Try editor
	Given The user is on Try Editor
	When The user enters valid python code in try editor
	Then  The user should be able to view the result in console window
	
@Tag11
	Scenario: Verify If User is able to execute the invalid python code in Try editor
	Given The user is on Try Editor
	When  The user enter invalid python code in try editor 
	Then The user should get error message in a pop up window
	
@Tag12
	Scenario: Verify the user is able to view Appllications page
	Given The user is on Stack page
	When The user clicks on Applications link
	Then The user should be able to view the details pertaining to the Applications page
	
@Tag13
	Scenario: Verify the user is able to view the try editior page
	Given The user is on the Applications page
	When The user clicks on try here link
	Then The user should land on try editor page
	
@Tag14 
	Scenario: Verify If User is able to execute the valid python code in Try editor
	Given The user is on Try Editor
	When The user enters valid python code in try editor
	Then The user should be able to view the result in console window
	
@Tag15
	Scenario: Verify If User is able to execute the invalid python code in Try editor
	Given The user is on Try Editor
	When  The user enter invalid python code in try editor 
	Then The user should get error message in a pop up window
	
@Tag16
	Scenario: Verify the user is able to view Practice Questions page
	Given The user is on Stack page
	When The user clicks on Practice Questions link
	Then The user should be able to view the details pertaining to the Practice questions page