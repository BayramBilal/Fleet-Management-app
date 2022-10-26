Feature: Fleet Login Fuctionality

  Background:  The users of driver, sales manager and store manager login function
  test with valid credentials.


  @wip2
  Scenario: Login as a driver
    Given User on the fleet login page
    When user enters driver username as "user1"
    And user enters driver password as "UserUser123"
    Then User on the Quick Launchpad page

  @wip2
  Scenario: Login as sales manager
    Given User on the fleet login page
    When user enters sales manager username as "salesmanager101"
    And user enters sales manager password as "UserUser123"
    Then User on the Dashboard page


  Scenario: Login as store manager
    Given User on the fleet login page
    When user enters store manager username as "storemanager85"
    And user enters store manager password as "UserUser123"
    Then User on the Dashboard page

