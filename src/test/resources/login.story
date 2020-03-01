Login

Meta:
@login

Narrative:
  In order to access application
  As a regular user
  I want to be able to log in via e-mail

Scenario: Should be successfully loged in

Given I open Landing page
When I log in with username '<userEmail>' and password '<userPassword>'
Then I should see Home page

Examples:
|userEmail|userPassword|
|petrenkovira19890206@gmail.com|love19890206love2|
|petrenkoVira19890206@gmail.com|love19890206love2|
