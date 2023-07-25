@regression
Feature: Login Test
  As user I want to login into nop commerce website

  @smoke
  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    Then I should see "Register" text


  @sanity
  Scenario Outline: Verify that firstname lastname email password and confirm password fields are mandatory
    Given I am on homepage
    When I click on register link
    And I click on register button
    Then I should see the error message "<errorMessage>" for fieldName "<fieldName>"
    Examples:

      | fieldName       | errorMessage            |
      | FirstName       | First name is required. |
      | LastName        | Last name is required.  |
      | Email           | Email is required.      |
      | Password        | Password is required.   |
      | ConfirmPassword | Password is required.   |


  Scenario Outline: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I select gender"<gender>"
    And I enter firstname "<firstName>"
    And I enter lastname "<lastName>"
    And I select date of birth  "<day>""<month>""<year>"
    And I enter random email "<email>"
    And I enter password "<password>"
    And I enter confirm password "<confirmPassword>"
    And I click on register button
    Then I should see registration confirmation message
    Examples:
      | gender | firstName | lastName   | day | month   | year | password | confirmPassword |
      | Male   | Champ     | Pankhaniya | 22  | January | 1980 | Twenty   | twenty          |
