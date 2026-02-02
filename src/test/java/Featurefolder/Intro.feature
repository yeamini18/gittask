Feature: Insta Website Testing

  @1
  Scenario: Verify the invalid data in login page
    Given User enter the URL
    When enter the username and password
    And click the password show icon btn
    Then click the login Btn
    Then verify the error msg

  @2
  Scenario Outline: Verify and create a new user account in instagram
    Given User enter the URL
    When enter the username and password "<Username>" "<password>"
    Then Click signupbtn in loginpage
    Then enter All details "<mobileno>" "<password>" "<fullName>" "<userName>"
    And Click signup button in Signuppage

    Examples:
      | mobileno   | password | fullName | userName    | Username |
      | 9080908080 | Tyuio0   | yeklilk  | yeamini1809 | yeamu    |
      | 9080908090 | Tyuio1   | yeklilk  | priya1809   | pri      |
      | 9080908070 | Tyuio2   | yeklilk  | dhanshu1809 | dhansh   |
      | 9080908060 | Tyuio3   | yeklilk  | sridhar1809 | sri      |

