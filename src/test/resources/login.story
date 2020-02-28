Login

Meta:
@login

Narrative:
  In order to access application
  As a regular user
  I want to be able to log in via e-mail

Scenario: Should be successfully loged in
Given I open Landing page
When I log in with username 'user' and password 'password'
Then I should see Home page
