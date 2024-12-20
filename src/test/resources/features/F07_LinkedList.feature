@linkedlist
Feature: Linked List
    Background: The user is logged in DS Algo portal
    Given The user is on DS-ALGO application sign in page
    When The user enter valid credentials "SDET185" and password as "@SDET!*%"
    Then The user should land in homepage

#@Tag1
#	Scenario: Verify the user is able to land in Linked List page
#	Given The user is on the secondary home page after logged in
#	When The user clicks on Get Started under the linked List 
#	Then The user should land on Linked list page
#	
#@Tag2
#	Scenario: Verify the user is able to land when Linked list option is selected
#	Given The user is on the secondary home page after logged in
#	When The user selects Linked list from the menu bar
#	Then The user should land on Linked list page

@Tag3
	Scenario: Verify the user is able to view the Introduction page
	Given The user is on the Linked list page 
	When The user clicks on Introduction link
	Then The user should be able to view all details pertaining to Introduction
	
@Tag4 
	Scenario: Verify the user is able to view the try editior page 
	Given The user is on the Introduction page  
	When The user clicks on try here link
	Then The user should land on try editor page
	
@Tag5
	Scenario: Verify the user is able to view the error message without entering code and click on Run button
	Given The user is on Try Editor page
	When The user clicks Run button without entering code
	Then The error message should be displayed
	
@Tag6
	Scenario Outline: Verify If User is able to execute the valid python code in Try Editor
	Given The user is on Try Editor page
	When The user enters "<code>" in try editor
	And The user click on Run button
  Then The user should be able to view the result in console window

Examples:
|code|
|print ('Hello')|

@Tag7
	Scenario Outline: Verify If User is able to execute the invalid python code in Try Editor
	Given The user is on Try Editor page
	When  The user enters "<code>" in try editor 
	And The user click on Run button
	Then The user should get error message in a pop up window
	Examples:
	|code|
	|print ('Hi)|	
	
@Tag8
	Scenario: Verify the user is able to view the Creating Linked list page
	Given The user is on the Linked list page 
	When The user clicks on Creating Linked list link
	Then The user should be able to view all details pertaining to Creating linked list

@Tag12
	Scenario: Verify the user is able to view the Types of Linked list page
	Given The user is on the Linked list page 
	When The user clicks on Types of Linked list link
	Then The user should be able to view all details pertaining to Types of linked list
	
@Tag16
	Scenario: Verify the user is able to view the Implement Linked list in python page
	Given The user is on the Linked list page 
	When The user clicks on Implement Linked list in python page link
	Then The user should be able to view all details pertaining to Implement linked list in python page

	@Tag20
		Scenario: Verify the user is able to view the Traversal page
		Given The user is on the Linked list page 
		When The user clicks on Traversal page link
		Then The user should be able to view all details pertaining to Traversal page

	@Tag24
	Scenario: Verify the user is able to view the Insertion page
	Given The user is on the Linked list page 
	When The user clicks on Insertion page link
	Then The user should be able to view all details pertaining to Insertion page
	
 	@Tag28
 	Scenario: Verify the user is able to view the Deletion page
 	Given The user is on the Linked list page 
 	When The user clicks on Deletion link
 	Then The user should be able to view all details pertaining to Deletion page
 	
  #Bug#
 
  @Tag32 
  Scenario: Verify the user is able to view the Practice questions page
  Given The user is on the Introduction page 
  When The user clicks on Practice Questions Link
  Then  The user should be able to view all details pertaining to Practice Questions page  
 	
	@Tag33
	Scenario Outline: Verify the user is able to navigate to try editor page from every sub pages on Linkedlist
	Given The user is on the Linked list page 
	When The user navigate to "<sub page>"
	And The user clicks on try here link on the sub page
	Then The user should land on try editor page  
	Examples:
	|sub page|
	|Introduction|
	|Creating Linked LIst|
	|Types of Linked List|
	|Implement Linked List in Python|
	|Traversal|
	|Insertion|
	|Deletion|