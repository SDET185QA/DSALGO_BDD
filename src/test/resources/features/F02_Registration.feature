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
 	Scenario: Verify that user received error message for empty username field
 	Given The user is on the registration page
 	When The user clicks Register button after entering password and password confirmation and leaves username field empty
 	Then The error Please fill out this field appears below Username textbox
 	
@Tag5
 	Scenario: Verify that user receives error message for empty Password field during registration
 	Given The user is on the registration page
 	When The user clicks Register button after entering Username with other fields empty
 	Then The error message Please fill out this field appears below Password textbox
 	
@Tag6 
 	Scenario: Verify that user receives error message for empty Password Confirmation field during registration
 	Given The user is on the registration page 
 	When The user clicks Register button after entering Username and Password with password confirmation field empty  
 	Then The error message Please fill out this field appears below Password Confirmation textbox    
 
@Tag7
 Scenario: Verify that user receives error message for invalid username field during registration
 	Given The user is on the registration page 
 	When The user clicks Register button after entering a username with special characters other than digits 
 	Then The user is able to see error msg after entering invalid data Password mismatch The two password fields did not match
 	
@Tag8
 Scenario: Verify that user receives error message for invalid password field during registration
 Given The user is on the registration page
 When The user clicks Register button after entering a password with numeric data and valid username
 Then The user is able to see error msg after entering invalid data Password mismatch The two password fields did not match
 
 @Tag9
 Scenario: Verify that user receives error message for mismatched Password and Password Confirmation field during registration
 Given The user is on the registration page 
 When The user clicks Register button after entering different passwords in Password and Password Confirmation fields 
 Then The user is able to see error msg after entering invalid data Password mismatch The two password fields did not match
 
 #@Tag10
 #Scenario: Verify that user is able to land on Homepage after registration with valid fields
 #Given The user is on the registration page 
 #When The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes 
 #Then The user should be redirected to Home Page of DS Algo with message New Account Created. You are logged in as <ID>
 #
 
 @Tag11
 Scenario: Verify that the user receives the error message for entering username less than 8 characters
 Given The user is on the registration page 
 When The user clicks Register button after entering  with  username with less than eight characters with valid password and password confirmation in related textboxes 
 Then The user should get an error saying password should contain atleast eight characters
 
 @Tag12
 Scenario: Verify that the user receives the error message for entering password less than 8 characters
 Given The user is on the registration page 
 When The user clicks on Register button after entering valid username and password with less than eight characters
 Then The user should get an error saying password should contain atleast eight characters
 
 
 