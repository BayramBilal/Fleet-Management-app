@NVF-697
Feature: Fleet Login Fuctionality with Scenario Outline

  Background:  The users of driver, sales manager and store manager login function
  test with valid and invalid credentials.

    Given User on the fleet login page
@NVF-696
  Scenario Outline: Login with valid credentials
    When "<userType>" enters "<username>" and "<password>"
    Then User on the "<expectedText>" page
Examples:
  | userType     | username        | password    | expectedText    |
  | Driver       | user1           | UserUser123 | Quick Launchpad |
  | SalesManager | salesmanager101 | UserUser123 | Dashboard       |
  | StoreManager | storemanager85  | UserUser123 | Dashboard       |


    Scenario Outline: Login with invalid credentials as
      When "<userType>" enters "<username>" and "<password>"
      Then the user sees the warning message on the page

    Examples:
      | userType     | username        | password      |
      | Driver       | user1223445     | UserUser123   |
      | Driver       | user1           | UserUser1234  |
      | SalesManager | sales111        | UserUser123   |
      | SalesManager | salesmanager101 | UserUser1234  |
      | StoreManager | storemanager856 | UserUser123   |
      | StoreManager | storemanager85  | UserUser12345 |

  @wip
  Scenario Outline: Login with valid and blank input credentials as
    When "<userType>" enters "<username>" and "<password>"
   Then User sees the validation message

 Examples:
   | userType     | username        | password    |
   | Driver       |                 |             |
   | Driver       | user1           |             |
   | Driver       |                 | UserUser123 |
   | SalesManager | salesmanager101 |             |
   | SalesManager |                 | UserUser123 |
   | StoreManager | storemanager85  |             |
   | StoreManager |                 | UserUser123 |
