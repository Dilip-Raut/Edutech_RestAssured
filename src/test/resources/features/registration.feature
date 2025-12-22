Feature: Registration Module

  Scenario Outline: New user registration
    Given registration payload with "<name>" "<email>" "<password>"
    When user calls "REGISTER" api using "POST"
    Then response status should be 201
    And response schema should be "registrationSchema.json"

    Examples:
      | name     | email              | password |
      | John Doe | john@test.com      | test123  |
