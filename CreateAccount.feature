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
Feature: Create Account 
  
  @tag1
  Scenario: Verify the behavior of the registration page when submitting the form with already registered account
    
    Given User should be on Creat account Page after entering Url "https://www.amazon.ca/" 
    
    When Click on verify after entering the valid Name, email or mobile number, password and Again Password 
    
    And  Click on verify email
   
    Then Message should be dispalyed that user is alreay registered 
   

