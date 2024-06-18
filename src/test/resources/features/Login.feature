@Regression
Feature: Test Authentication Functionality
  As a user, I want to Login.

  Background:
    Given User on home Page SFA system

  @TS001 @TC001
  Scenario: Verify that users can successfully log in with valid credentials.
    When User input username "your_username", the password "your_password" and clicks on the login button
    Then Get result login resource