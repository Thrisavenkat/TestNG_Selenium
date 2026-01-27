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
	Feature: cucumber.io home page testing
	
  Background:
  Given the user must be in chrome browser
  
  @tag1
  Scenario: Verify the Documentation 
    Given The user is in cucumber.io home page
    When The user clicks on Documentation link
    Then The user can view the page content with what is cucumber
    