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
Feature: Sign in 
  

  @tag1
  Scenario: Checking functionality of Sign in with valid credentials 
    
    Given User should be on homepage after entering url "https://www.amazon.ca/"
    
   
    
    When User clicks on Sign in button and enter valid credentials 
     
    
    Then User should be signed in and navigated to homepage
   

