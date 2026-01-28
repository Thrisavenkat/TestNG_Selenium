Feature: To perform SignUp

Background:
    Given the user must be in chrome browser
 
  @tag1
  Scenario Outline: Validate signup
  
    Given The user in the signup page
    When The user enter "<name>"
    * The user enter the "<phoneno>"
    * The user click on i am not a robot
    And The user click on continue
    Then the user will enter in the website
    
 
 
    Examples:
      | name  | phoneno |   
      | trishavenkat |6381703487|
      | name2 |89000347678 |