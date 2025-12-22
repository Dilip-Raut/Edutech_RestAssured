Feature: Fees Module

  Scenario: Create fee record
    Given fees payload from "fees"
    When user calls "FEES" api using "POST"
    Then response status should be 201
    And response schema should be "feesSchema.json"
