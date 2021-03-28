Feature: Login Feature

  Scenario: Login with valid credentials
    Given user navigate to login page2
    When user enter nama and pwa
    And user click login button2
    Then user navigate to homepage2