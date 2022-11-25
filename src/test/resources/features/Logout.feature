@NVF-707
Feature: Fleet Logout Functionality

  Background:  The users of driver, sales manager and store manager logout.

    Given User on the fleet homepage
@NVF-706
  Scenario: Logout from homepage
    When user click dropdown menu
    And user logout from page
    Then User on the fleet login page

# Scenario: Logout and step back
#    When user click dropdown menu
#    And user logout from page
#    And User on the fleet login page
#    Then User click step back after logout
#
#    Scenario: Close the tab/tabs to log out
#    When user close the tab and quit the tabs
#    Then user logout from page

