@regression
Feature: Computer Test
  As user I want to login into nop commerce website

  Scenario: verifyUserShouldNavigateToComputerPageSuccessfully
    Given I am on homepage
    When I click on Computers tab
    Then I should be navigate to computer page

  @sanity
  Scenario: verify User Should Navigate to Desktops Page Successfully
    Given I am on homepage
    When  I click on Computer tab
    And I click on desktops link
    Then I should be navigate to desktop page successfully


  Scenario Outline: user ShouldBuildYourOwnComputerAndAddToCartSuccessfully
    Given I am on homepage
    When I click on Computers tab
    And I click on desktops link
    And I select build your own computer
    And I select processor "<processor>"
    And I select Ram "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I selectSoftware "<software>"
    And I click on add to cart button
    Then I can see add to cart message "The product has been added to your shopping cart
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista  Home [+$50.00]   | Total Commander [+$5.00]   |
