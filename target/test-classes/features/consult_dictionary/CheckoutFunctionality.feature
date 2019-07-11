Feature: Checkout Functionality

  Scenario: Verify Checkout functionality for the product added
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
    When I select the product to be added in cart in search results page
    Then I verify user is able to select the quantity in the dropdown
    And I click on Add to Cart button
    When I click on "Proceed to Buy" button Cart Page
    Then I verify user is redirected to Checkout Page

  Scenario: verify user is able to select the address in checkout page
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
    When I select the product to be added in cart in search results page
    Then I verify user is able to select the quantity in the dropdown
    And I click on Add to Cart button
    When I click on "Proceed to Buy" button Cart Page
    Then I verify user is redirected to Checkout Page