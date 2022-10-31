Feature: Fleet Logout Functionality

  Background:  The users of driver, sales manager and store manager logout.


  Scenario: Logout from homepage
    Given User on the fleet homepage
    When user click dropdown menu
    And user logout from page
    Then User on the fleet login page
