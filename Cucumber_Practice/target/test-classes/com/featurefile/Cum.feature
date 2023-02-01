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

Feature: Facebook Application
Scenario Outline: Test login function
    Given User open the Browser and navigated
    When User enter "<username>" and "<password>"
    And Click the login button
    Then User navigated to FB home page
Examples: 
      | username |  | password |
      | asd      |  |      123 |
      | kiren    |  | k1234567 |
