@NVF-666
Feature: Fleet Login Functionality

  Background:  The users of driver, sales manager and store manager login function
  test with valid credentials.

    Given User on the fleet login page
@NVF-655
    Scenario: Login as a driver
     When user enters driver username
      And user enters driver password
      Then User on the Quick Launchpad page
@NVF-656
  Scenario: Login as sales manager
    When user enters sales manager username
    And user enters sales manager password
    Then User on the Dashboard page
  @NVF-657
  Scenario: Login as store manager
    When user enters store manager username
    And user enters store manager password
    Then User on the Dashboard page
