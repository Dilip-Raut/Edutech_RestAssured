Feature: Student Module

  Scenario: Create a student
    Given student payload from "students"
    When user calls "STUDENTS" api using "POST"
    Then response status should be 201
    And response schema should be "studentSchema.json"

  Scenario: Get all students
    When user calls "STUDENTS" api using "GET"
    Then response status should be 200
