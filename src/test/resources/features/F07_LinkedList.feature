@linkedlist
Feature: Linked List
 Background: The user is logged in DS Algo portal
 Given The user logged in to dsAlgo Portal with credentials from "SignIn" and row 5
# When The user enter valid credentials "SDET185" and password as "@SDET!*%"
# Then The user should land in homepage

#@Tag1 Always in comment
#	Scenario: Verify the user is able to land in Linked List page
#	Given The user is on the secondary home page after logged in
#	When The user clicks on Get Started under the linked List 
#	Then The user should land on Linked list page
#	
#@Tag2 Always in comment
#	Scenario: Verify the user is able to land when Linked list option is selected
#	Given The user is on the secondary home page after logged in
#	When The user selects Linked list from the menu bar
#	Then The user should land on Linked list page

@Tag3
	Scenario: Verify the user is able to view the Introduction page
	Given The user is on the Linked list page 
	When The user clicks on Introduction link
	Then The user should be able to view all details pertaining to Introduction

@Tag5
	Scenario: Verify the user is able to view the error message without entering code and click on Run button 
Given The user is on the Linked list page
And The user navigates to Try Editor page
When The user clicks Run button without entering code
Then The error message should be displayed
	
@Tag6
	Scenario Outline: Verify If User is able to execute the valid python code from Try Editor
	Given The user is on the Linked list page
	And The user navigates to Try Editor page
	When The user enters code from "<sheetName>" and <rowNumber> from try editor
	And The user click on Run button
  Then The user should be able to view the result in console window

Examples:
|sheetName|rowNumber|
|PythonCode|12|

@Tag7
	Scenario Outline: Verify If User is able to execute the invalid python code in Try Editor
	Given The user is on the Linked list page
	And The user navigates to Try Editor page
	When The user enters code from "<sheetName>" and <rowNumber> from try editor 
	And The user click on Run button
	Then The user should get error message in a pop up window
	Examples:
	|sheetName|rowNumber|
	|PythonCode|13|

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
  Given The user is on the Linked list page
  And The user is on the Introduction page
  When The user clicks on Practice Questions Link
  Then The user should be able to view contents pertaining to Practice Questions page  
 
	@Tag33
	Scenario Outline: Verify the user is able to navigate to try editor page from every sub pages on Linkedlist
	Given The user is on the Linked list page 
	When The user navigate to subpage from "<sheetName>" and <rowNumber>
	And The user clicks on try here link on the sub page
	Then The user should land on try editor page  
	Examples:
	|sheetName|rowNumber|
	|SubPage|2|
	|SubPage|3|
	|SubPage|4|
	|SubPage|5|
	|SubPage|6|
	|SubPage|7|
	|SubPage|8|


	