
@array
Feature: User is in DS-ALGO application page and test the Array page


  Background: The user is logged in DS Algo portal
  	Given The user is on DS-ALGO application sign in page
  	When The user enter valid credentials "SDET185" and password as "@SDET!*%"
  	Then The user should land in homepage 
 

  @TestScenario01_array
  Scenario: The user is able to navigate to array page in Datasturcture
  
    Given The user is on the home page of DS-ALGO application
    When The user select the drop down option and select the array option
    Then The user lands in the arrays Datastructure page
    
 @TestScenario02_array
 
  Scenario: Verify that user is able to navigate to "Arrays in Python" page
  
    Given The user is in the "Array" page after Sign in
    When The user clicks "Arrays in Python" button
    Then The user should be redirected to "Arrays in Python" page
    
 @TestScenario03_array
 
  Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays in Python" page
  
    Given The user is on the "Arrays in Python" page
    When The user clicks "Try Here" button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test
      
 @TestScenario04_array
 
  Scenario: Verify that user receives error when click on Run button without entering code for "Arrays in Python" page
  
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window
    
 @TestScenario05_array
 
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Arrays in Python" page
  
    Given The user is on the "Arrays in Python" page
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page 
    
 
 @TestScenario06_array
 
  Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Arrays in Python" page
  
    Given The user is on the "Arrays in Python" page
    When The user clicks the "Search the array" link
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons
    
 @TestScenario07_array
 
  Scenario: Verify that user is able to navigate to "Maximum Consecutive ones" Page from Practice question page of "Arrays in Python" page
  
    Given The user is on the "Arrays in Python" page
    When The user clicks the "Maximum Consecutive ones" link
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons 
      
    
 @TestScenario08_array
 
  Scenario: Verify that user is able to navigate to "Find Numbers with Even Number digits" Page from Practice question page of "Arrays in Python" page
  
    Given The user is on the "Arrays in Python" page
    When The user clicks the "Find Numbers with Even Number digits" link
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons 
    
 
 @TestScenario09_array
 
  Scenario: Verify that user is able to navigate to "Squares of a Sorted array" Page from Practice question page of "Arrays in Python" page
  
    Given The user is on the "Arrays in Python" page
    When The user clicks the "Squares of a Sorted array" link
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons
    
 @TestScenario10_array
 
  Scenario: Verify that user is able to navigate to "Arrays Using List" page
  
    Given The user is in the "Array" page after Sign in
    When The user clicks "Arrays Using List" button
    Then The user should be redirected to "Arrays Using List" page 
    
    
    
    
    
  @TestScenario11_array
 
  Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays Using List" page
  
    Given The user is on the "Arrays Using List" page
    When The user clicks "Try Here" button in Arrays Using List page
    Then The user should be redirected to a page having an try Editor with a Run button to test 
    
 
 @TestScenario12_array
 
  Scenario: Verify that user receives error when click on Run button without entering code for "Arrays Using List" page
  
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window
    
 @TestScenario13_array
 
  Scenario: Verify that user is able to navigate to "Basic Operations in Lists" page
  
    Given The user is in the "Array" page after Sign in
    When The user clicks "Basic Operations in Lists" button
    Then The user should be redirected to "Basic Operations in Lists" page 
    
  @TestScenario14_array
 
  Scenario: Verify that user is able to navigate to "try Editor" page for "Basic Operations in Lists" page
  
    Given The user is on the "Basic Operations in Lists" page
    When The user clicks "Try Here" button in Arrays Using List page
    Then The user should be redirected to a page having an try Editor with a Run button to test 
    
 
 @TestScenario15_array
 
  Scenario: Verify that user receives error when click on Run button without entering code for "Basic Operations in Lists" page
  
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window
    
 @TestScenario16_array
 
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Basic Operations in Lists" page
  
    Given The user is in the Array page after Sign in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page  
    
    
    
    
   @TestScenario17_array
 
  Scenario: Verify that user is able to navigate to "Applications of Array" page
  
    Given The user is in the "Array" page after Sign in
    When The user clicks "Applications of Array" button
    Then The user should be redirected to "Applications of Array" page 
    
 
 @TestScenario18_array
 
  Scenario: Verify that user is able to navigate to "try Editor" page for "Applications of Array" page
  
    Given The user is on the "Applications of Array" page
    When The user clicks "Try Here" button in Arrays Using List page
    Then The user should be redirected to a page having an try Editor with a Run button to test
    
 @TestScenario19_array
 
  Scenario: Verify that user receives error when click on Run button without entering code for "Applications of Array" page
  
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor
    Then The user should able to see an error message in alert window  
    
   
  #@TestScenario20_array
  #Scenario Outline: The user is able to submit code in tryEditor for Search the array link
    #Given The user is on "Question" page of "Search the array" after logged in
    #When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
    #And The user clicks on Submit button
    #Then The user should be presented with successful submission message
#
    #Examples: 
      #| Sheetname  | RowNumber |
      #| pythonCode |         1 |
#
   #@TestScenario21_array
  #Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Search the array link
    #Given The user is on "Question" page of "Search the array" after logged in
    #When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    #And The user clicks on run button
    #Then The user should be presented with error message as "SyntaxError: bad input on line 1"
#
    #Examples: 
      #| Sheetname  | RowNumber |
      #| pythonCode |         2 |
