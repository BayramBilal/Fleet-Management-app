@NVF-707
Feature: Fleet Logout Functionality

  Background:  The users of driver, sales manager and store manager logout.

    Given User on the fleet homepage
@NVF-706
  Scenario: Logout from homepage

    When user click dropdown menu
    And user logout from page
    Then User on the fleet login page
