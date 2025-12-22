Feature: Faculty Module

  Scenario: Add faculty
    Given faculty payload from "faculty"
    When user calls "FACULTY" api using "POST"
    Then response status should be 201
    And response schema should be "facultySchema.json"
