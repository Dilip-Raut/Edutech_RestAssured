Feature: Login Module

  Scenario Outline: User logs in with valid credentials
    Given login payload with "<email>" and "<password>"
    When user calls "LOGIN" api using "POST"
    Then response status should be 200
    And response schema should be "loginSchema.json"

    Examples:
      | email                 | password  |
      | admin@openeducat.com  | admin123  |
