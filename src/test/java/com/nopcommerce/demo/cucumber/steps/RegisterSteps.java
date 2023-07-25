package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.nopcommerce.demo.utility.Utility.getRandomString;

public class RegisterSteps {

    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see {string} text")
    public void iShouldSeeText(String arg0) {
        Assert.assertEquals("Register is not displayed", "Register", new RegisterPage().getRegisterText());

    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the error message \"([^\"]*)\" for fieldName {string}")
    public void iShouldSeeTheErrorMessageForFieldName(String fieldName, String errorMessage) {
        Assert.assertEquals("error message is not displayed", new RegisterPage().getValidationErrorMessageForField(fieldName), errorMessage);

    }

    @And("I select gender{string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("I enter firstname {string}")
    public void iEnterFirstname(String firstname) {
        new RegisterPage().enterFirstName(firstname);
    }


    @And("I enter lastname {string}")
    public void iEnterLastname(String lastname) {
        new RegisterPage().enterLastName(lastname);

    }

    @And("I select date of birth  {string}{string}{string}")
    public void iSelectDateOfBirth(String day, String month, String year) {
        new RegisterPage().selectDateOfBirth(day, month, year);
    }


    public static String email = getRandomString(5) + "@gmail.com";

    @And("I enter random email {string}")
    public void iEnterRandomEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String confirmpassword) {
        new RegisterPage().enterConfirmPassword(confirmpassword);

    }

    @Then("I should see registration confirmation message")
    public void iShouldSeeRegistrationConfirmationMessage() {
        Assert.assertEquals("Registration is not successful", "Your registration completed", new RegisterPage().getYourRegCompletedText());
    }


}
