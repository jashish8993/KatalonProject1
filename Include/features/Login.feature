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

Feature: Title of your feature
#  I want to use this template for my feature file

 
  Scenario Outline: Login into the application
    Given user is on login page
    When when user enter username and password
    And click on login button
    Then Then user is redirected to dashboard page

   # Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
      #| name2 |     7 | Fail    |
