Feature: Causal Forecast Scenario page verification

Background: 
When PTC sevlistic page is open
And login with valid usename
Then User should be login

Scenario: Verify add button on the given page
Given causal forcast sceanario page open
When we click on add button 
And entered required info 
Then scenario should be created
 