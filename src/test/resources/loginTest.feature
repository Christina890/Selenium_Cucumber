Feature: Login Feature
  Scenario: User should be able to login with valid credentials
    Given The user is on the landing page
    When The user enters valid credentials
    And Hits Submit
    Then Then the user is logged in successfully

