Feature: Lookup Feature

  Scenario: Looking up the definition of 'pear'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'pear'
    Then they should see the definition 'An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.'
