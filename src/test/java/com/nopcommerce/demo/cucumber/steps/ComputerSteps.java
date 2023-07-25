package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComputerSteps {
    @When("I click on Computers tab")
    public void iClickOnComputersTab() {
        new HomePage().clickOnMenuTab("Computers");
    }

    @Then("I should be navigate to computer page")
    public void iShouldBeNavigateToComputerPage() {
        Assert.assertEquals("Text is not displayed", "Computers", new ComputerPage().getPageTitleText());
    }

    @And("I click on desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnSubMenu("Desktops");
    }

    @Then("I should be navigate to desktop page successfully")
    public void iShouldBeNavigateToDesktopPageSuccessfully() {
        Assert.assertEquals("Text is not displayed", "Desktops", new DesktopsPage().getPageTitleText());
    }

    @And("I select build your own computer")
    public void iSelectBuildYourOwnComputer() {
        new DesktopsPage().selectProduct("Build your own computer");
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I select Ram {string}")
    public void iSelectRam(String Ram) {
        new BuildYourOwnComputerPage().selectRam(Ram);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String HDD) {
        new BuildYourOwnComputerPage().selectHDD(HDD);
    }

    @And("I select OS {string}")
    public void iSelectOS(String OS) {
        new BuildYourOwnComputerPage().selectOS(OS);
    }

    @And("I selectSoftware {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I can see add to cart message \"The product has been added to your shopping cart")
    public void iCanSeeAddToCartMessageTheProductHasBeenAddedToYourShoppingCart() {
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals("The cart is empty", expectedMessage, new BuildYourOwnComputerPage().getProductAddedMessage());
    }

    @When("I click on Computer tab")
    public void iClickOnComputerTab() {

    }
}
