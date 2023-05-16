package com.luma.steps;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GearTestSteps {
//    @Given("^I am on homepage$")
//    public void iAmOnHomepage() {
//    }

    @When("^I mouse hover on gear menu$")
    public void iMouseHoverOnGearMenu() {
        new HomePage().mouseHoveOnGearMenu();
    }

    @And("^I click on bags$")
    public void iClickOnBags() {
        new GearPage().clickOnBags();
    }

    @And("^I click on product name Overnight Duffle$")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().productNameOvernightDuffle();
    }

    @And("^I verify the text overnight Duffle$")
    public void iVerifyTheTextOvernightDuffle() {
        new GearPage().verifyTextOvernightDuffle();
    }

    @And("^I change qty (\\d+)$")
    public void iChangeQty(int arg0) {
        new GearPage().changeQty3();
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new GearPage().addToCart();
    }

    @Then("^I verify text You added Overnight Duffle to your shopping cart$")
    public void iVerifyTextYouAddedOvernightDuffleToYourShoppingCart() {
        new GearPage().verifyTextShoppingCart();
    }

    @And("^I click and shopping cart message$")
    public void iClickAndShoppingCartMessage() {
        new GearPage().shoppingCartLinkMessage();
    }

    @Then("^I verify product price \\$(\\d+)\\.(\\d+)$")
    public void iVerifyProductPrice$(int arg0, int arg1) {
        new GearPage().productPrice$135();

    }

    @And("^I change Qty to (\\d+)$")
    public void iChangeQtyTo(int arg0) {
        new GearPage().changeQty5();
    }

    @And("^I click on update shopping cart button$")
    public void iClickOnUpdateShoppingCartButton() {
        new GearPage().updateShoppingCartButton();
    }

    @Then("^I verify the product price \\$(\\d+)\\.(\\d+)$")
    public void iVerifyTheProductPrice$(int arg0, int arg1) {
        new GearPage().productPrice$225();
    }
}
