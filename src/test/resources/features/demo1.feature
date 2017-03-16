Feature: verify login page
  @demo
  Scenario: verify login for valid user
    When PTC sevlistic page is open
    And login with valid usename
    Then User should be login

  @demo
  Scenario Outline: verify with invalid credentials
    When PTC sevlistic page is open
    And username <username> entered
    And password <password> entered
    Then error message should be verified

    Examples: 
      | username |  | password |  
      | nalini   |  |  1234567 |  