Feature: My validation on mercury tours
Scenario: Login for registered user

Given application url is working
When user enters username
And user enters password
Then he clicks on submit button
And verifies the login process
Then he choose to close the application 