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
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
	@tag
	Feature: User Login

  @tag7
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>"
    When I want to enter <id> id as idnum
    And I want to enter <salary> as salary

    Examples: 
      | name  | id | salary |
      | Trisha | 114 | 350000.53|   
      | Naga | 115 | 250000.55 |
      | Swetha | 116 | 68000.88 |
