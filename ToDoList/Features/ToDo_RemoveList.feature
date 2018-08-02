@Rlist
Feature: RemoveList

In order to add remove list from the page
As a user 
I want select list name and hit remove button

Scenario: Positive

Given  NSS-TODO HomePage

When User select list name from list field 

And User hit remove button 

Then User should see the item removed from the list