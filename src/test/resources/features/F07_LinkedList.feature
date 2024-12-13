@linkedlist
Feature: Linked List

	Background: The user is on the secondary home page after logged in
@Tag1
	Scenario: Verify the user is able to land in Linked List page
	Given The user is on the secondary home page after logged in
	When The user clicks on Get Started under the linked List 
	Then The user should land on Linked list page
	
@Tag2
	Scenario: Verify the user is able to land when Linked list option is selected
	Given The user is on the secondary home page after logged in
	When The user selects Linked list from the menu bar
	Then The user should land on Linked list page
	
@Tag3
	Scenario: Verify the user is able to view the Introduction page
	Given The user is on the Linked list page 
	When The user clicks on Introduction link
	Then The user should be able to view all details pertaining to Introduction
	
@Tag4
	Scenario: Verify the user is able to view the try editior page 
	Given The user is on the Introduction page  
	When The user clicks on try here link
	Then The user should land on try editor page with Run button
	
@Tag5
	Scenario: Verify the user is able to view the error message without entering code and click on Run button
	Given The user is on Try Editor page
	When The user clicks Run button without entering code
	Then The error message should be displayed
	
@Tag6
	Scenario: Verify If User is able to execute the valid python code in Try Editor
	Given The user is on Try Editor page
	When The user enters valid python code in try editor
	Then The user should be able to view the result in console window
	
@Tag7
	Scenario: Verify If User is able to execute the invalid python code in Try Editor
	Given The user is on Try Editor page
	When  The user enter invalid python code in try editor 
	Then The user should get error message in a pop up window
	
@Tag8
	Scenario: Verify the user is able to view the Creating Linked list page
	Given The user is on the Linked list page 
	When The user clicks on Creating Linked list link
	Then The user should be able to view all details pertaining to Creating linked list
	
@Tag9
	Scenario: Verify the user is able to view the try editior page
	Given The user is on the Creating Linked List page
	When The user clicks on try here link
	Then The user should land on try editor page
	
@Tag10
	Scenario: Verify If User is able to execute the valid python code in Try editor
	Given The user is on Try Editor page
	When The user enters valid python code in try editor
	Then The user should be able to view the result in console window
	
@Tag11
	Scenario: Verify If User is able to execute the invalid python code in Try editor
	Given The user is on Try Editor page
	When  The user enter invalid python code in try editor 
	Then The user should get error message in a pop up window
	
@Tag12
	Scenario: Verify the user is able to view the Types of Linked list page
	Given The user is on the Linked list page 
	When The user clicks on Types of Linked list link
	Then The user should be able to view all details pertaining to Types of linked list
	
@Tag13
	Scenario: Verify the user is able to view the try editior page
	Given The user is on the Types of Linked list page
	When The user clicks on try here link
	Then The user should land on try editor page
	
@Tag14
	Scenario: Verify If User is able to execute the valid python code in Try editor
	Given The user is on Try Editor page
	When The user enters valid python code in try editor
	Then The user should be able to view the result in console window
	
@Tag15
	Scenario: Verify If User is able to execute the invalid python code in Try editor
	Given The user is on Try Editor page
	When  The user enter invalid python code in try editor 
	Then The user should get error message in a pop up window
	
@Tag16
	Scenario: Verify the user is able to view the Implement Linked list in python page
	Given The user is on the Linked list page 
	When The user clicks on Implement Linked list in python page link
	Then The user should be able to view all details pertaining to Implement linked list in python page

@Tag17
	Scenario: Verify the user is able to view the try editior page
	Given The user is on the Implement Linked First in python page
	When The user clicks on try here link
	Then The user should land on try editor page
	
@Tag18
	Scenario: Verify If User is able to execute the valid python code in Try editor
	Given The user is on Try Editor page
	When The user enters valid python code in try editor
	Then The user should be able to view the result in console window
	
@Tag19
	Scenario: Verify If User is able to execute the invalid python code in Try editor
	Given The user is on Try Editor page
	When  The user enter invalid python code in try editor 
	Then The user should get error message in a pop up window
	
	@Tag20
		Scenario: Verify the user is able to view the Traversal page
		Given The user is on the Linked list page 
		When The user clicks on Traversal page link
		Then The user should be able to view all details pertaining to Traversal page
		
	@Tag21
		Scenario: Verify the user is able to view the try editior page
		Given The user is on the Traversal list page 
		When The user clicks on try here link        
		Then The user should land on try editor page
		
	@Tag22
		Scenario: Verify If User is able to execute the valid python code in Try editor
		Given The user is on Try Editor page
		When The user enters valid python code in try editor
		Then The user should be able to view the result in console window 
		
	@Tag23
		Scenario: Verify If User is able to execute the invalid python code in Try editor
		Given The user is on Try Editor page
		When  The user enter invalid python code in try editor 
		Then The user should get error message in a pop up window
		
	@Tag24
	Scenario: Verify the user is able to view the Insertion page
	Given The user is on the Linked list page 
	When The user clicks on Insertion page link
	Then The user should be able to view all details pertaining to Insertion page
	
	@Tag25
	Scenario: Verify the user is able to view the try editior page
	Given The user is on the Insertion page 
	When The user clicks on try here link        
	Then The user should land on try editor page
	
	@Tag26
 	Scenario: Verify If User is able to execute the valid python code in Try editor
 	Given The user is on Try Editor page
 	When The user enters valid python code in try editor
 	Then The user should be able to view the result in console window
 	
 	@Tag27
 	Scenario: Verify If User is able to execute the invalid python code in Try editor
 	Given The user is on Try Editor page
 	When  The user enter invalid python code in try editor 
 	Then The user should get error message in a pop up window
 	
 	@Tag28
 	Scenario: Verify the user is able to view the Deletion page
 	Given The user is on the Linked list page 
 	When The user clicks on Deletion link
 	Then The user should be able to view all details pertaining to Deletion page
 	
 	@Tag29
 	Scenario: Verify the user is able to view the try editior page
 	Given The user is on the Insertion page 
 	When The user clicks on try here link        
 	Then The user should land on try editor page
 	
 	@Tag30
 	Scenario: Verify If User is able to execute the valid python code in Try editor
 	Given The user is on Try Editor page
 	When The user enters valid python code in try editor
 	Then The user should be able to view the result in console window
 	
  @Tag31
  Scenario: Verify If User is able to execute the invalid python code in Try editor
  Given The user is on Try Editor page
  When  The user enter invalid python code in try editor 
  Then The user should get error message in a pop up window
  
  @Tag32
  Scenario: Verify the user is able to view the Practice questions page
  Given The user is on the Linked list page 
  When The user clicks on Practice Questions Link
  Then  The user should be able to view all details pertaining to Practice Questions page   #Bug
 	
