Feature: Fleet Login Fuctionality

  Background:  The users of driver, sales manager and store manager login function
  test with valid credentials.


  @wip
    Scenario: Login as a driver
      Given User on the fleet login page
      When user enters driver username
      And user enters driver password
      Then User on the Quick Launchpad page

  @wip
  Scenario: Login as sales manager
    Given User on the fleet login page
    When user enters sales manager username
    And user enters sales manager password
    Then User on the Dashboard page
  @wip
  Scenario: Login as store manager
    Given User on the fleet login page
   When user enters store manager username
    And user enters store manager password
    Then User on the Dashboard page
