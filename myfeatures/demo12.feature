Feature: My standard Chartred bank account

Background: Launching of the bank Landing page
Given Smruti is done with browser configuration
Then she launches the application in her favourite chrome browser

Scenario: Sign in for srinivas
Given She clicks on sign in link
Then She enters the valid creds
And He clicks on submit button


Scenario: Signup for the guest user
Given Guest user clicks on signup link
When She provides all the mandatory data
Then She clicks on sbmt and id generated

Scenario: Smruti wanted to reset his password 
Given She clicks on forgot password
Then She enters the mobile number
And She receives otp and the same he provides
