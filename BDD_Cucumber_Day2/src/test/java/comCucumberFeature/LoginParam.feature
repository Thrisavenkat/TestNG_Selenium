  @tag
	Feature: User Login Update Status
  @tag6
  Scenario Outline: Title of your scenario outline
    Given The user is in Login form
    When The user enters "<username>" in username field
    And The user enters "<password>" in password field
    * The user clicks on Login button
    Then The user get the "<status>" message as status 

    Examples: 
      | username | password | status |
      | Trisha | trisha123 | pass|   
      | Naga |  agan1 | fail |
      | Swetha |  Swetha123  | pass |
