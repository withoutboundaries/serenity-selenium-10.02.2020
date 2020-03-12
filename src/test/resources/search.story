Search

Meta:
@search

Narrative:
  In order to find people in the application
  As a regular user
  I want to be able to search


Lifecycle:
Before: login.story
Scope: Scenario

Scenario: Should search for relevant results

Meta: @search01

GivenStories: login.story

Given I am on Home Page

When I type searchterm in searchField
Then I receive relevant results

Examples:
|searchTerm|
|hr        |

