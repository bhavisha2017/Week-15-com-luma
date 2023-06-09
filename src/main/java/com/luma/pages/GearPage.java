package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class GearPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    public GearPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement clickOnBag;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffle;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyOverNightDuffle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartMessage;

    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement verifyQty3;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col subtotal']//span[@class='price']")
    WebElement productPrice$135;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]")
    WebElement changeQty5to3;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$225.00')]")
    WebElement productPrice$225;


    // Click on Bags
    public void clickOnBags() {
        Reporter.log("Click on Bags" + "<br>");
        clickOnElement(clickOnBag);
        log.info("Click on Bags" + "<br>");
    }

    // Click on Product Name ‘Overnight Duffle’
    public void productNameOvernightDuffle() {
        Reporter.log("Click on Product Name ‘Overnight Duffle’" + "<br>");
        clickOnElement(overnightDuffle);
        log.info("Click on Product Name ‘Overnight Duffle’" + "<br>");
    }

    // Verify the text ‘Overnight Duffle’
    public void verifyTextOvernightDuffle() {
        Reporter.log("Verify the text ‘Overnight Duffle’" + "<br>");
        String expectedMessage = "Overnight Duffle";
        String actualMessage = getTextFromElement(verifyOverNightDuffle);
        Assert.assertEquals(expectedMessage, actualMessage);
        log.info("Verify the text ‘Overnight Duffle’" + "<br>");
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement clearQty;

    // Change Qty 3
    public void changeQty3() {
        Reporter.log("Change Qty 3" + changeQty.toString() + "<br>");
        clearQty(clearQty);
        sendTextToElement(changeQty, "3");
        log.info("Change Qty 3 :" + changeQty.toString() + "<br>");
    }

    //Click on ‘Add to Cart’ Button.
    public void addToCart() {
        Reporter.log("Click on ‘Add to Cart’ Button." + "<br>");
        clickOnElement(addToCartButton);
        log.info("Click on ‘Add to Cart’ Button." + "<br>");
    }

    // Verify the text ‘You added Overnight Duffle to your shopping cart.’
    public void verifyTextShoppingCart() {
        Reporter.log("Verify the text ‘You added Overnight Duffle to your shopping cart.’ : " + verifyShoppingCart.toString() + "<br>");
        String expectedMessage = "You added Overnight Duffle to your shopping cart.";
        String actualMessage = getTextFromElement(verifyShoppingCart);
        Assert.assertEquals(expectedMessage, actualMessage);
        log.info("Verify the text ‘You added Overnight Duffle to your shopping cart.’ : " + verifyShoppingCart.toString() + "<br>");
    }

    //Click on ‘shopping cart’ Link into message
    public void shoppingCartLinkMessage() {
        Reporter.log("Click on ‘shopping cart’ Link into message" + "<br>");
        clickOnElement(shoppingCartMessage);
        log.info("Click on ‘shopping cart’ Link into message" + "<br>");
    }

    //Verify the Qty is ‘3’
    public void verifyQty3() {
        Reporter.log("Verify the Qty is ‘3’ : " + verifyQty3.toString() + "<br>");
        String expectedMessage = "3";
        String actualMessage = getTextFromElement(verifyQty3);
        Assert.assertEquals(expectedMessage, actualMessage);
        log.info("Verify the Qty is ‘3’ : " + verifyQty3.toString() + "<br>");
    }

    // Verify the product price ‘$135.00’
    public void productPrice$135() {
        Reporter.log("Verify the product price ‘$135.00’: " + productPrice$135.toString() + "<br>");
        String expectedMessage = "$135.00";
        String actualMessage = getTextFromElement(productPrice$135);
        Assert.assertEquals(expectedMessage, actualMessage);
        log.info("Verify the product price ‘$135.00’: " + productPrice$135.toString() + "<br>");
    }

    //Change Qty to ‘5’
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]")
    WebElement qty;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]")
    WebElement click;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]")
    WebElement clean;

    public void changeQty5() {
        Reporter.log("Change Qty to ‘5’ :" + changeQty5to3.toString() + "<br>");
        mouseHoverToElement1(qty);
        clickOnElement(click);
        clearQty(clean);
        sendTextToElement(changeQty5to3, "5");
        log.info("Change Qty to ‘5’ : " + changeQty5to3.toString() + "<br>");
    }

    //Click on ‘Update Shopping Cart’ button
    public void updateShoppingCartButton() {
        Reporter.log("Click on ‘Update Shopping Cart’ button" + "<br>");
        clickOnElement(updateShoppingCart);
        log.info("Click on ‘Update Shopping Cart’ button" + "<br>");
    }

    //Verify the product price ‘$225.00’
    public void productPrice$225() {
        Reporter.log("Verify the product price ‘$225.00’ : " + productPrice$225.toString() + "<br>");
        String expectedMessage = "$225.00";
        String actualMessage = getTextFromElement(productPrice$225);
        Assert.assertEquals(expectedMessage, actualMessage);
        log.info("Verify the product price ‘$225.00’ : " + productPrice$225.toString() + "<br>");
    }
}
