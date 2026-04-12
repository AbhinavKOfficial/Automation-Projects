Feature: Invalid login attempt handling

  Scenario: System should reject login with wrong credentials

    Given user opens the web browser

    And user navigates to the login page
    
    When user provides invalid username and password

    And user submits the login form
    
    Then system should display an authentication error message