#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
@HomePage
Feature: Launch Start page and Test Home Page

  Scenario: launch the home page of dsalgo portal
 
  Given Launch the home page of dsalgo portal
  When User clicks on "Get Started" button
  Then User redirected to HomePage
  
  Scenario Outline: User is on HomePage and clicks on any dropDown <value> without signing in
  
   Given User is on HomePage
   When The user select any dropdown menu "<value>" without sigining in
   Then User not signed in alert message displyed "You are not logged in"
   
   Examples:
   | value       |
   | Arrays      |
   | Linked List |
   | Queue       |
   | Tree        |
   | Graph       |
   | Stack       |
   
   Scenario Outline: User is on Home Page and clicks on any getStarted link "<value>" without sign in
   
    Given User is on HomePage
    When The user click any of the Get started link before signin "<value>" in home page
    Then It should Alert the user with the message "You are not logged in"

    Examples:
      | value                        |
      | Data Structures-Introduction |
      | Arrays                       |
      | Linked List                  |
      | Stack                        |
      | Queue                        |
      | Tree                         |
      | Graph                        |
   
    Scenario: User is on Home page and Clicks on Signin
    Given User is on HomePage
    When user clicks on SignIn link
    Then user redirected to login page

  Scenario: User is on Home page and Clicks on Register
    Given User is on HomePage
    When user clicks on Register link
    Then user redirected to register page