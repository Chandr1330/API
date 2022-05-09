Feature: Enter email without password 
@Test
  Scenario: Validate response Without enter password with Email
    Given Provide URI
    When Enter email but not enter password
    Then Validate Response

 