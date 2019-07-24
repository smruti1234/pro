Feature: Test Me parameterisation
Scenario Outline: Test Me login for multiple users


Given I am launching the testme application in chrome
And I click on SignIn link
When I provide username "<Uname>"
And I provide password "<Pswrd>"
Then I click on login and  verify the login status

Examples:
|Uname   |Pswrd       |
|Lalitha |password123 |
|kilam10 |kilam10     |
|elina   |elina69     |
