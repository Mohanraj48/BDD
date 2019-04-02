Feature: Test tagged hooks

@First
Scenario: This is the first test
Given This is first step
When This is second step
Then This is third step


@Second
Scenario: This is the second test
Given This is first step
When This is second step
Then This is third step

@Third
Scenario: This is the third test
Given This is first step
When This is second step
Then This is third step