Feature: Search for a product

  Scenario: Search for product in amazon website
    When I launch the test URL successfully
    Then I verify user is redirected to the website successfully
    When I click on "Login" button in Home Page
    Then I verify user is redirected to Login page successfully
    When I enter "krishhsubash@gmail.com" as username in login page successfully
    When I click on Continue Button in login page successfully
    When I enter "!24Subash" as password in login page successfully
    And I click on Login button in Login page successfully
    Then I verify user is logged in successfully
    When I enter the product as "cars" in home page
    Then I verify user is displayed with the search results

  Scenario: Verify search results pagination
    When I launch the test URL successfully
    Then I verify user is redirected to the website successfully
    When I click on "Login" button in Home Page
    Then I verify user is redirected to Login page successfully
    When I enter "krishhsubash@gmail.com" as username in login page successfully
    When I click on Continue Button in login page successfully
    When I enter "!24Subash" as password in login page successfully
    And I click on Login button in Login page successfully
    Then I verify user is logged in successfully
    When I enter the product as "cars" in home page
    Then I verify user is displayed with the search results
    Then I verify pagination for the search results