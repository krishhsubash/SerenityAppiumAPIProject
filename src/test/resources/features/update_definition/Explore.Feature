Feature: Explore

Scenario: Looking up the definition of 'apple'
  When I launch the test URL successfully
Given the user is on the Wikionary home page
When the user looks up the definition of the word 'apple'
Then they should see the definition 'A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.'
