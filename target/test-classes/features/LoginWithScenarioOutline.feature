@wip2
Feature: Fleet Login Fuctionality with Scenario Outline

  Background:  The users of driver, sales manager and store manager login function
  test with valid and invalid credentials.

    Given User on the fleet login page

  Scenario Outline: Login with valid credentials as
    When "<userType>" enters "<username>" and "<password>"
    Then User on the "<expectedText>" page
Examples:
  | userType     | username        | password    | expectedText    |
  | Driver       | user1           | UserUser123 | Quick Launchpad |
  | SalesManager | salesmanager101 | UserUser123 | Dashboard       |
  | StoreManager | storemanager85  | UserUser123 | Dashboard       |




