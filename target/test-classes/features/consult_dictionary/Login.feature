Feature: Lookup a definition
  In order to talk better
  As an English student
  I want to look up word definitions



  Scenario: Login functionality
    When I launch the test URL successfully
    Then I verify user is redirected to the website successfully
    When I click on "Login" button in Home Page
    Then I verify user is redirected to Login page successfully
    When I enter "krishhsubash@gmail.com" as username in login page successfully
    When I click on Continue Button in login page successfully
    When I enter "!24Subash" as password in login page successfully
    And I click on Login button in Login page successfully
    And I close the browser successfully