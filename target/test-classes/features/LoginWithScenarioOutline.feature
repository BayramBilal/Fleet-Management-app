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


    Scenario Outline: Login with invalid credentials as
      When "<userType>" enters "<username>" and "<password>"
      Then User on the "<expectedText>" page
    Examples:
      | userType     | username        | password      | expectedText    |
      | Driver       | user12          | UserUser123   | Quick Launchpad |
      | Driver       | user1           | UserUser1234  | Quick Launchpad |
      | SalesManager | salesmanager111 | UserUser123   | Dashboard       |
      | SalesManager | salesmanager101 | UserUser1234  | Dashboard       |
      | StoreManager | storemanager856 | UserUser123   | Dashboard       |
      | StoreManager | storemanager85  | UserUser12345 | Dashboard       |



  Scenario Outline: Login with valid and blank input credentials as
   When "<userType>" enters "<username>" and "<password>"
   Then User on the "<expectedText>" page
 Examples:
   | userType     | username        | password    | expectedText    |
   | Driver       |                 |             | Quick Launchpad |
   | Driver       | user1           |             | Quick Launchpad |
   | Driver       |                 | UserUser123 | Quick Launchpad |
   | SalesManager | salesmanager101 |             | Dashboard       |
   | SalesManager |                 | UserUser123 | Dashboard       |
   | StoreManager | storemanager85  |             | Dashboard       |
   | StoreManager |                 | UserUser123 | Dashboard       |
