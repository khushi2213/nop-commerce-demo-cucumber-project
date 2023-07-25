package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }
    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }


    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("Text is not Display","Welcome, Please Sign In!",new LoginPage().getWelcomeText());
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);


    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals("Message not displayed",errorMessage,new LoginPage().getErrorMessage());
    }

    @Then("I should see logout link is display")
    public void iShouldSeeLogoutLinkIsDisplay() {
        Assert.assertTrue("Link is not display",new HomePage().isLogOutLinkDisplay());
    }

    @Then("I should see logIn link is display")
    public void iShouldSeeLogInLinkIsDisplay() {
        Assert.assertTrue("Link is not display",new HomePage().isLogInLinkDisplay());
    }


}
