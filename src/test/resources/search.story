Search

Meta:
@search
@smoke

Narrative:
  In order to find content in the application
  As a regular user
  I want to be able to search by search term


Lifecycle:
Before:
Scope: Scenario
Given I open Landing page
When I log in with username petrenkovira19890206@gmail.com and password love19890206love2
Then I should see Home page

Scenario: Search by search term

Given I am on Home Page

When I type hr in searchField
Then I should receive hr in each search result
Then I should see expected search term in each search result



