Feature: Course Module

  Scenario: Create course
    Given course payload from "courses"
    When user calls "COURSES" api using "POST"
    Then response status should be 201
    And response schema should be "courseSchema.json"

  Scenario: Get all courses
    When user calls "COURSES" api using "GET"
    Then response status should be 200
