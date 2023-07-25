@regression
Feature: Login Test
  As user I want to login into nop commerce website

  @smoke
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @sanity
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email                | password  | errorMessage                                                                                |
      | qwerty123@gmail.com  | qazwsx12  | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz890@gmail.com     | qazwsx    | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | qwerty@gmail.com     | qwerty123 | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |



  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "primeeight@gmail.com"
    And I enter password "abc123"
    And I click on login button
    Then I should see logout link is display

  Scenario: User should Out Successfully
    Given I am on homepage
    When I click on login link
    And I enter email "primeeight@gmail.com"
    And I enter password "abc123"
    And I click on login button
    Then I should see logIn link is display

