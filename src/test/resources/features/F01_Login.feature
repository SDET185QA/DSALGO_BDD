@login
Feature: Login to DS-ALGO Application and validate login page with different scenarios
 
  #@TestScenario_login_01  
#	Scenario: To Verify that user is able to land on Login Page
    #Given The user is on the DS Algo Home Page
    #When The user should click the Sign in link
    #Then The user should be redirected to Sign in page
     
  @TestScenario_login_02  
	Scenario: To verify SignIn with Empty fields
    Given The user is on the DS Algo Login Page
    When User clicks on login button with all empty field
    Then User verify the message at username as "Please fill out this field."
  
  @TestScenario_login_03
  Scenario: To verify SignIn with username only
    Given The user is on the DS Algo Login Page
    When User clicks on login button with username as "SDET185"
    Then User verify the message at password as "Please fill out this field."
    
    #
  #@TestScenario_login_04
  #Scenario: To verify SignIn with password only
    #Given The user is on the DS Algo Login Page
    #When User clicks on login button with password as "@SDET!*%"
    #Then User verify the message at username as "Please fill out this field."
  #
  @TestScenario_login_05
  Scenario: Verify that user is able to land on Login Page
    Given The user is on the DS Algo Login Page 
    When User enters email as "SDET185" and password as "@SDET!*%"
    Then The user should land in Data Structure Home Page with message "You are logged in"
  #@TestScenario_login_06  
  #Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and <RowNumber>
    #Given The user is on signin page
    #When The user enter sheet "<Sheetname>" and <RowNumber>
    #Then click login button
#
    #Examples: 
      #| Sheetname | RowNumber |
      #| Sheet1    |         0 |
      #| Sheet1    |         1 |
      #| Sheet1    |         2 |
      #| Sheet1    |         3 |
    #
  #@TestScenario_login_07
  #Scenario: Verify that user able to sign out successfully being in "DataStructures Page"
    #Given The user is in the DataStructures page 
    #When The user clicks on signout button
    #Then Verify the logout message "Logged out successfully"
    #
  #@TestScenario_login_08
  #Scenario: Verify that user able to sign out successfully being in "Array page"
    #Given The user is in the DataStructures page 
    #When The user clicks on signout button
    #Then Verify the logout message "Logged out successfully"
    #
  #@TestScenario_login_09
  #Scenario: Verify that user able to sign out successfully being in "Linked List page"
    #Given The user is in the DataStructures page 
    #When The user clicks on signout button
    #Then Verify the logout message "Logged out successfully"
    #
  #@TestScenario_login_10
  #Scenario: Verify that user able to sign out successfully being in "Stack page"
    #Given The user is in the DataStructures page 
    #When The user clicks on signout button
    #Then Verify the logout message "Logged out successfully"
    #
  #@TestScenario_login_11
  #Scenario: Verify that user able to sign out successfully being in "Queue page"
    #Given The user is in the DataStructures page 
    #When The user clicks on signout button
    #Then Verify the logout message "Logged out successfully"
    #
  #@TestScenario_login_12
  #Scenario: Verify that user able to sign out successfully being in "Tree page"
    #Given The user is in the DataStructures page 
    #When The user clicks on signout button
    #Then Verify the logout message "Logged out successfully"
    #
  #@TestScenario_login_13
  #Scenario: Verify that user able to sign out successfully being in "Graph page"
    #Given The user is in the DataStructures page 
    #When The user clicks on signout button
    #Then Verify the logout message "Logged out successfully"
    #
#
  @TestScenario_login_14
  Scenario: Verify signout from DS-Algo page
     Given The user is in home page and enters  email as "SDET185" and password as "@SDET!*%"
     When The user clicks on signout button
     Then Verify the logout message "Logged out successfully"
     
     
  