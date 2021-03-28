Feature: Login Feature

  Scenario Outline: Login with valid credentials
    Given user navigate to login page
    When user enter <username> and <password>
    And user click login button
    Then user navigate to homepage

    Examples: 
      | username | password |
      | ASD      |      123 |
      | ZXC      |      456 |
