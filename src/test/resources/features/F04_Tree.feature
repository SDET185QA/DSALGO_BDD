@Tree_Page
Feature: Validate Tree Page

 Background: The user is logged in DS Algo portal
  	Given The user is on DS-ALGO application sign in page
  	When The user enter valid credentials "SDET185" and password as "@SDET!*%"
  	Then The user should land in homepage

 @TestScenario_tree_01
  Scenario: To validate the Tree link
    Given The user is on the Tree page
    When User click on the Tree Get Started button
    Then User is on Tree page and verify tittle as "Tree"
    
 @TestScenario_tree_02
   Scenario: The user navigate to "Overview of Trees" page
    Given The user is on the Tree page
    When The user clicks on the Overview of Trees link
    Then The user is redirected to the "Overview of Trees"  Page

 @TestScenario_tree_03
  Scenario: The user navigate to a page having an tryEditor 
     Given The user is on the Overview of Trees page
    When The user clicks tryhere button on Overview of Trees page
    Then The user is redirected to tryEditor page with Run button
    
@TestScenario_tree_04
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Overview of Trees page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_05
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Overview of Trees page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
      

@TestScenario_tree_06
  Scenario: The user navigate to "Terminologies" Page
    Given The user is on the Tree page
    When The user clicks on the Terminologies link
    Then The user is redirected to the "Terminologies"  Page
    
@TestScenario_tree_07
  Scenario: The user navigate to Terminologies page having an tryEditor
    Given The user is on the Terminologies of Tree page
    When The user clicks tryhere button on Terminologies page
    Then The user is redirected to tryEditor page with Run button

@TestScenario_tree_08
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Terminologies page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_09
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Terminologies page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
    
 @TestScenario_tree_10
  Scenario: The user navigate to "Types of Trees" Page
    Given The user is on the Tree page
    When The user clicks on the Types of Trees link
    Then The user is redirected to the "Types of Trees"  Page
    
 @TestScenario_tree_11
  Scenario: The user navigate to Types of Trees page having an tryEditor
    Given The user is on the Types of Trees of Tree page
    When The user clicks tryhere button on Types of Trees page
    Then The user is redirected to tryEditor page with Run button
 
 @TestScenario_tree_12
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Types of Trees page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_13
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Types of Trees page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
       
@TestScenario_tree_14
  Scenario: The user navigate to "Tree Traversals"  Page
    Given The user is on the Tree page
    When The user clicks on the Tree Traversals link
    Then The user is redirected to the "Tree Traversals"  Page
    
@TestScenario_tree_15
  Scenario: The user navigate to Tree Traversals page having an tryEditor
    Given The user is on the Tree Traversals of Tree page
    When The user clicks tryhere button on Tree Traversals page
    Then The user is redirected to tryEditor page with Run button

 @TestScenario_tree_16
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Tree Traversals page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_17
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Tree Traversals page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
       
@TestScenario_tree_18
  Scenario: The user navigate to "Traversals illustration" Page
    Given The user is on the Tree page
    When The user clicks on the Traversal illustration link
    Then The user is redirected to the "Traversals-Illustration"  Page
    
@TestScenario_tree_19
  Scenario: The user navigate to Tree Traversals page having an tryEditor
    Given The user is on the Traversals-Illustration of Tree page
    When The user clicks tryhere button on Tree traversal illustration page
    Then The user is redirected to tryEditor page with Run button
    
  @TestScenario_tree_20
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Traversals-Illustration page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_21
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Traversals-Illustration page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
      
 @TestScenario_tree_22     
    Scenario: The user navigate to "Binary Trees" Page
    Given The user is on the Tree page
    When The user clicks on the Binary Trees link
    Then The user is redirected to the "Binary Trees"  Page

 @TestScenario_tree_23
   Scenario: The user navigate to Tree Traversals page having an tryEditor
   Given The user is on the Binary Trees of Tree page
   When The user clicks tryhere button on Binary Trees  page
   Then The user is redirected to tryEditor page with Run button
   
 @TestScenario_tree_24
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Binary Trees page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_25
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Binary Trees page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |

  @TestScenario_tree_26     
    Scenario: The user navigate to "Types of Binary trees" Page
    Given The user is on the Tree page
    When The user clicks on theTypes of Binary trees link
    Then The user is redirected to the "Types of Binary Trees"  Page
    
 @TestScenario_tree_27
   Scenario: The user navigate to Types of Binary trees page having an tryEditor
   Given The user is on the Types of Binary trees of Tree page
   When The user clicks tryhere button on Types of Binary trees page
   Then The user is redirected to tryEditor page with Run button

@TestScenario_tree_28
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Types of Binary trees page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_29
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Types of Binary trees page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
      

 @TestScenario_tree_30     
    Scenario: The user navigate to "Implementation in Python" Page
    Given The user is on the Tree page
    When The user clicks on the Implementation in Python link
    Then The user is redirected to the "Implementation in Python"  Page
    
 @TestScenario_tree_31
   Scenario: The user navigate to Implementation in Python page having an tryEditor
   Given The user is on the Implementation in Python of Tree page
   When The user clicks tryhere button on Implementation in Python page
   Then The user is redirected to tryEditor page with Run button

@TestScenario_tree_32
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Implementation in Python page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_33
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Implementation in Python page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
      

 @TestScenario_tree_34    
    Scenario: The user navigate to "Binary Tree Traversals" Page
    Given The user is on the Tree page
    When The user clicks on the Binary Tree Traversals link
    Then The user is redirected to the "Binary Tree Traversals"  Page
    
 @TestScenario_tree_35
   Scenario: The user navigate to Binary Tree Traversals page having an tryEditor
   Given The user is on the Binary Tree Traversals of Tree page
   When The user clicks tryhere button on Binary Tree Traversals page
   Then The user is redirected to tryEditor page with Run button

@TestScenario_tree_36
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Binary Tree Traversals  page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_37
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Binary Tree Traversals  page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
   
    @TestScenario_tree_38    
    Scenario: The user navigate to "Implementation of Binary Trees" Page
    Given The user is on the Tree page
    When The user clicks on the Implementation of Binary Trees link
    Then The user is redirected to the "Implementation of Binary Trees"  Page
    
 @TestScenario_tree_39
   Scenario: The user navigate to Implementation of Binary Trees page having an tryEditor
   Given The user is on the Implementation of Binary Trees of Tree page
   When The user clicks tryhere button on Implementation of Binary Trees page
   Then The user is redirected to tryEditor page with Run button

@TestScenario_tree_40
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Implementation of Binary Trees  page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_41
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Implementation of Binary Trees  page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
      
    
  @TestScenario_tree_42    
    Scenario: The user navigate to "Applications of Binary Trees" Page
    Given The user is on the Tree page
    When The user clicks on the Applications of Binary Trees link
    Then The user is redirected to the "Applications of Binary trees"  Page
    
 @TestScenario_tree_43
   Scenario: The user navigate to Applications of Binary Trees page having an tryEditor
   Given The user is on the Applications of Binary Trees of Tree page
   When The user clicks tryhere button on Applications of Binary Trees page
   Then The user is redirected to tryEditor page with Run button

@TestScenario_tree_44
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Applications of Binary Trees  page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_45
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Applications of Binary Trees  page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
      #
  
 @TestScenario_tree_46    
    Scenario: The user navigate to "Binary Search Trees" Page
    Given The user is on the Tree page
    When The user clicks on the Binary Search Trees link
    Then The user is redirected to the "Binary Search Trees"  Page
    
 @TestScenario_tree_47
   Scenario: The user navigate to Binary Search Trees page having an tryEditor
   Given The user is on the Binary Search Trees of Tree page
   When The user clicks tryhere button on Binary Search Trees page
   Then The user is redirected to tryEditor page with Run button

@TestScenario_tree_48
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Binary Search Trees  page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_49
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Binary Search Trees  page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
      


 @TestScenario_tree_50   
    Scenario: The user navigate to "Implementation of BST" Page
    Given The user is on the Tree page
    When The user clicks on the Implementation of BST link
    Then The user is redirected to the "Implementation Of BST"  Page
    
 @TestScenario_tree_51
   Scenario: The user navigate to Implementation of BST page having an tryEditor
   Given The user is on the Implementation of BST of Tree page
   When The user clicks tryhere button on Implementation of BST page
   Then The user is redirected to tryEditor page with Run button

@TestScenario_tree_52
  Scenario Outline: Validating valid python code in TryEditor page
    Given User is on the "Try Editor Page" of Implementation of BST  page
    When User enters valid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on the Run button
    Then User should be able to see the valid output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |
      
      
  @TestScenario_tree_53
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on the "Try Editor Page" of Implementation of BST  page
    When User enters invalid Python code from the sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |
      


    
    
