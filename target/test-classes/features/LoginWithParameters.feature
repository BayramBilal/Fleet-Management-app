Feature: Fleet Login Fuctionality

  Background:  The users of driver, sales manager and store manager login function
  test with valid credentials.



  Scenario: Login as a driver
    Given User on the fleet login page
    When user enters driver username as "user1"
    And user enters driver password as "UserUser123"
    Then User on the Quick Launchpad page


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


  Scenario: Login as a driver
    Given User on the fleet login page
    When user enters below valid credentials as a driver
      | username | user1       |
      | password | UserUser123 |

    Then User on the Quick Launchpad page

  Scenario: Login as sales manager
    Given User on the fleet login page
    When user enters below valid credentials as a sales manager
      | username | salesmanager101 |
      | password | UserUser123     |
    Then User on the Dashboard page


  Scenario: Login as store manager
    Given User on the fleet login page
    When user enters below valid credentials as a storemanager
      | username | storemanager85 |
      | password | UserUser123    |
    Then User on the Dashboard page


  Scenario: Login as a driver
    Given User on the fleet login page
    When user enters valid credentials as a driver
      | user1       |
      | UserUser123 |
    Then User on the Quick Launchpad page

  Scenario: Login as sales manager
    Given User on the fleet login page
    When user enters valid credentials as a sales manager
      | salesmanager101 |
      | UserUser123     |
    Then User on the Dashboard page


  Scenario: Login as store manager
    Given User on the fleet login page
    When user enters valid credentials as a storemanager
      | storemanager85 |
      | UserUser123    |
    Then User on the Dashboard page
