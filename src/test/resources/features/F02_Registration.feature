@registration
Feature:Registration

#@Tag1
  #Scenario: Verify the user is able to launch the webpage
    #Given The user is on the home page 
    #When The user clicks Get Started button on the home page
    #Then The user should be redirected to the secondary home page
#
#@Tag2
#	Scenario: Verify the user is able to land on Registration
#		Given The user is on the secondary home page 
#		When The user clicks Register link on the Home page
#		Then The user should be redirected to Register form

@Tag3
  Scenario: Verify the user receives error message for all empty fields during registration
 	Given The user is on the registration page 
 	When The user clicks Register button with all fields empty
 	Then The error Please fill out this field appears below Username textbox
 	
@Tag4
 	Scenario Outline: Verify that user received error message for empty username field
	 	Given The user is on the registration page
	 	When The user clicks Register button after entering password and passwordConfirmation and leaves username field empty with inputs from "<sheetName>" and <rowNumber>
	 	Then The error Please fill out this field appears below Username textbox
 	Examples:
 		|sheetName|rowNumber|
 		|Register|2|
 		|Register|3|
 	
@Tag5
 	Scenario Outline: Verify that user receives error message for empty Password field during registration
	 	Given The user is on the registration page
	 	When The user clicks Register button after entering username with other fields empty with inputs from "<sheetName>" and <rowNumber>
	 	Then The error message Please fill out this field appears below Password textbox
	 Examples:
	 |sheetName|rowNumber|
	 |Register|4|	
@Tag6 
 	Scenario Outline: Verify that user receives error message for empty Password Confirmation field during registration
 	Given The user is on the registration page 
 	When The user clicks Register button after entering username and Password with passwordConfirmation field empty with inputs from "<sheetName>" and <rowNumber>
 	Then The error message Please fill out this field appears below Password Confirmation textbox    
 Examples:
 |sheetName|rowNumber|
 |Register|5|
 
@Tag7
 Scenario Outline: Verify that user receives error message for invalid username field during registration
 	Given The user is on the registration page 
 	When The user clicks Register button after entering a username with special characters other than digits with inputs from "<sheetName>" and <rowNumber>
 	Then The user is able to see error msg after entering invalid data Password mismatch The two password fields did not match
 	Examples:
 	|sheetName|rowNumber|
	|Register|6|

@Tag8
 Scenario Outline: Verify that user receives error message for invalid password field during registration
 Given The user is on the registration page
 When The user clicks Register button after entering a password with numeric data and valid username with inputs from "<sheetName>" and <rowNumber>
 Then The user is able to see error msg after entering invalid data Password mismatch The two password fields did not match
 Examples:
 |sheetName|rowNumber|
 |Register|7|
 
 @Tag9
 Scenario Outline: Verify that user receives error message for mismatched Password and Password Confirmation field during registration
 Given The user is on the registration page 
 When The user clicks Register button after entering different passwords in password and passwordConfirmation fields with inputs from "<sheetName>" and <rowNumber>
 Then The user is able to see error msg after entering invalid data Password mismatch The two password fields did not match
 Examples:
 |sheetName|rowNumber|
 |Register|8|
 
 #@Tag10
 #Scenario Outline: Verify that user is able to land on Homepage after registration with valid fields
 #Given The user is on the registration page 
 #When The user clicks Register button after entering  with valid "<username>", "<password>" and "<passwordConfirmation>" in related textboxes 
 #Then The user should be redirected to Home Page of DS Algo with message New Account Created. You are logged in as <ID>
	#Examples:
	#|username|password|passwordConfirmation|
	#|Jack|Algo24|Algo24|
 
 @Tag11
 Scenario Outline: Verify that the user receives the error message for entering username less than 8 characters
 Given The user is on the registration page 
 When The user clicks Register button after entering username with less than eight characters with valid password and passwordConfirmation in related textboxes with inputs from "<sheetName>" and <rowNumber>
 Then The user should get an error saying password should contain atleast eight characters
 Examples:
 |sheetName|rowNumber|
 |Register|10|
 
 @Tag12
 Scenario Outline: Verify that the user receives the error message for entering password less than 8 characters 
 Given The user is on the registration page 
 When The user clicks on Register button after entering valid username, password and passwordConfirmation with less than eight characters with inputs from "<sheetName>" and <rowNumber>
 Then The user should get an error saying password should contain atleast eight characters
 Examples: 
 |sheetName|rowNumber|
 |Register|11|
 
 