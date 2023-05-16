package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenTestSteps {
    @When("^I mouse hover on men menu$")
    public void iMouseHoverOnMenMenu() {
        new HomePage().mouseHoverOnMenMenu();
    }

    @And("^I mouse hover on bottoms$")
    public void iMouseHoverOnBottoms() {
        new HomePage().mouseHoverOnBottom();
    }

    @And("^I click on pants$")
    public void iClickOnPants() {
        new MenPage().clickPants();
    }

    @And("^I mouse hover on cronus yoga pant$")
    public void iMouseHoverOnCronusYogaPant() {
        new MenPage().mouseHoverOnCronusYogaPant();
    }

    @And("^I click on size (\\d+)$")
    public void iClickOnSize(int arg0) {
        new MenPage().productNameCronusYogaPantCLickOnSize32();
    }

    @And("^I click on black colour$")
    public void iClickOnBlackColour() {
        new MenPage().productNameCronusYogaPantClickOnColourBlack();
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new MenPage().cronusYogaPantClickAddToCartButton();
    }

    @Then("^I verify text You added Cronus Yoga Pant to your shopping cart$")
    public void iVerifyTextYouAddedCronusYogaPantToYourShoppingCart() {
        new MenPage().verifyTextMessage();
    }

    @And("^I click on shopping cart link$")
    public void iClickOnShoppingCartLink() {
        new MenPage().shoppingCartLink();
    }

    @Then("^I verify text Shopping cart$")
    public void iVerifyTextShoppingCart() {
        new MenPage().verifyShoppingCart();
    }

    @Then("^I verify product name cronus yoga pant$")
    public void iVerifyProductNameCronusYogaPant() {
        new MenPage().verifyProductNameCronusYogaPant();
    }

//    @Then("^I verify Product size (\\d+)$")
//    public void iVerifyProductSize( ) {
//        new MenPage().verifyProductSize32();
//    }

    @Then("^I verify the product colour Black$")
    public void iVerifyTheProductColourBlack() {
        new MenPage().verifyProductColourBlack();
    }
}
