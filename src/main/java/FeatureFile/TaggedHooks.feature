@TaggedHooks
  Feature: Test tagged hooks
    @First
    Scenario: This is first scenario
      Given this is the first step
      When this is the second step
      Then this is the third step

    @Second
    Scenario: This is the second scenario
      Given this is the first step
      When this is the second step
      Then this is the third step