Feature: Search

  @test
  Scenario: Result is returned
    Given I login
    When I search for an item
    Then At least one is returned

