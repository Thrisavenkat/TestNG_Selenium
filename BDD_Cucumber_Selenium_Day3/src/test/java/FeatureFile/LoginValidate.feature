Feature: To perform SignUp
 
  Background:
    Given the user must be in chrome browser
 
  @tag1
  Scenario: Validate signup using Excel data
    Given The user in the signup page
    When The user enters signup details from excel
    And The user click on i am not a robot
    And The user click on continue
    Then the user will enter in the website