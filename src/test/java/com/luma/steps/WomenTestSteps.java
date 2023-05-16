package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WomenTestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I mouse hover on women menu$")
    public void iMouseHoverOnWomenMenu() {
        new HomePage().mouseHoverWomenMenu();
    }

    @And("^I mouse hover on tops$")
    public void iMouseHoverOnTops() {
        new HomePage().mouseHoverOnTop();
    }

    @And("^I click on jacket$")
    public void iClickOnJacket() {
        new WomenPage().clickOnJacket();
    }

    @And("^I select Sort By filter \"([^\"]*)\"$")
    public void iSelectSortByFilter(String productName)  {
          new WomenPage().selectProductName();
    }

    @Then("^I should verify the products name display in alphabetical order$")
    public void iShouldVerifyTheProductsNameDisplayInAlphabeticalOrder() {
        new WomenPage().sortByProductName();
    }

    @Then("^I should verify the products price display in low to high$")
    public void iShouldVerifyTheProductsPriceDisplayInLowToHigh() {
        new WomenPage().sortByPriceFilter();
    }
}
