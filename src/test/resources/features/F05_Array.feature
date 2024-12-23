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
    Then The user lands in the arrays Datastructure page with title "Array"

  @TestScenario02_array
  Scenario: Verify that user is able to navigate to "Arrays in Python" page
    Given The user is in the "Array" page after Sign in
    When The user clicks "Arrays in Python" button
    Then The user should be redirected to "Arrays in Python" page

  @TestScenario03_array
  Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks "Try Here" button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test and page title "Assessment"

  @TestScenario04_array
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks Practice Questions button
    Then The user should be redirected to "Practice Questions" page

  @TestScenario05_array
  Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks the "Search the array" link
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons and page title "Assessment"

  @TestScenario06_array
  Scenario: Verify that user is able to navigate to "Maximum Consecutive ones" Page from Practice question page of "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks the Maximum Consecutive ones link
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons and page title "Assessment"

  @TestScenario07_array
  Scenario: Verify that user is able to navigate to "Find Numbers with Even Number digits" Page from Practice question page of "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks the Find Numbers with Even Number digits link
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons and page title "Assessment"

  @TestScenario08_array
  Scenario: Verify that user is able to navigate to "Squares of a Sorted array" Page from Practice question page of "Arrays in Python" page
    Given The user is on the "Arrays in Python" page
    When The user clicks the Squares of a Sorted array link
    Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons and page title "Assessment"

  @TestScenario09_array
  Scenario: Verify that user is able to navigate to "Arrays Using List" page
    Given The user is in the "Array" page after Sign in
    When The user clicks Arrays Using List button
    Then The user should be redirected to "Arrays Using List" page

  @TestScenario10_array
  Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays Using List" page
    Given The user is on the "Arrays Using List" page
    When The user clicks "Try Here" button in Arrays Using List page
    Then The user should be redirected to a page having an try Editor with a Run button to test and page title "Assessment"

  @TestScenario11_array
  Scenario: Verify that user is able to navigate to "Basic Operations in Lists" page
    Given The user is in the "Array" page after Sign in
    When The user clicks Basic Operations in Lists button
    Then The user should be redirected to "Basic Operations in Lists" page

  @TestScenario12_array
  Scenario: Verify that user is able to navigate to "try Editor" page for "Basic Operations in Lists" page
    Given The user is on the Basic Operations in Lists page
    When The user clicks "Try Here" button in Arrays Using List page
    Then The user should be redirected to a page having an try Editor with a Run button to test and page title "Assessment"

  @TestScenario13_array
  Scenario Outline: Validation of valid python code in TryEditor page
    Given User is on "Try Editor Page" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see the output

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |

  @TestScenario14_array
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on "Try Editor Page" after logged in
    When User enters invalid Python code from sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |

  @TestScenario15_array
  Scenario Outline: Validation of valid python code in Practice Questions page for Search for Array link
    Given User is on "Question" page of "Search the array" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Run button
    Then User should be able to see the Result

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         2 |

  @TestScenario16_array
  Scenario Outline: Validation of Submit button in Practice Questions page for Search for Array link
    Given User is on "Question" page of "Search the array" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Submit button
    Then User should get success submission message  from sheet "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         3 |

  @TestScenario17_array
  Scenario Outline: Validation of valid python code in Practice Questions page for Max Consecutive Ones link
    Given User is on "Question" page of "Max Consecutive Ones" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Run button
    Then User should be able to see the Result

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         4 |

  @TestScenario18_array
  Scenario Outline: Validation of Submit button in Practice Questions page for Max Consecutive Ones link
    Given User is on "Question" page of "Max Consecutive Ones" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Submit button
    Then User should get success submission message  from sheet "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         5 |

  @TestScenario19_array
  Scenario: Validation of Find Numbers with Even Number of Digits link
    Given User is on "Practice page" after logged in
    When User clicks on Find Numbers with Even Number of Digits link
    Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons

  @TestScenario20_array
  Scenario Outline: Validation of valid python code in Practice Questions page for Find Numbers with Even Numbers of Digits link
    Given User is on "Question" page of "FindNumberswithEvenNumberofDigits" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Run button
    Then User should be able to see the Result

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         6 |

  @TestScenario21_array
  Scenario Outline: Validation of Submit button in Practice Questions page for Find Numbers with Even Numbers of Digits link
    Given User is on "Question" page of "FindNumberswithEvenNumberofDigits" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Submit button
    Then User should get success submission message  from sheet "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         7 |

  @TestScenario22_array
  Scenario: Validation of Squares of a Sorted Array link
    Given User is on "Practice page" after logged in
    When User clicks on Squares of a Sorted Array link
    Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons

  @TestScenario23_array
  Scenario Outline: Validation of valid python code in Practice Questions page for Find Numbers with Even Numbers of Digits link
    Given User is on "Question" page of "Squares of a Sorted Array" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Run button
    Then User should be able to see the Result

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         8 |

  @TestScenario24_array
  Scenario Outline: Validation of Submit button in Practice Questions page for Find Numbers with Even Numbers of Digits link
    Given User is on "Question" page of "Squares of a Sorted Array" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Submit button
    Then User should get success submission message  from sheet "<SheetName>" and <RowNumber>

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         9 |
