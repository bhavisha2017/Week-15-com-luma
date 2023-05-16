package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MenPage extends Utility {
    private static final Logger log = LogManager.getLogger(MenPage.class.getName());

    public MenPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "#ui-id-23")
    WebElement clickOnPants;
    //Click on Pants
    public void clickPants() {
        log.info("Clicking on pants: " + clickOnPants.toString());
        clickOnElement(clickOnPants);
    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
    public void mouseHoverOnCronusYogaPant() {
        mouseHoverToElement(cronusYogaPant);
        log.info("Mouse hover on cronus yoga pant : " + cronusYogaPant.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    WebElement cronusYogaPantClickOnSize32;
    //Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    public void productNameCronusYogaPantCLickOnSize32() {
        //mouseHoverToElement(cronusYogaPant);
        mouseHoverToElementAndClick(cronusYogaPantClickOnSize32);
        log.info("Click on size 32: " + cronusYogaPantClickOnSize32.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement cronusYogaPantClickColourBlack;
    //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
    public void productNameCronusYogaPantClickOnColourBlack() {
        log.info("Click on black colour: " + cronusYogaPantClickColourBlack.toString());
        mouseHoverToElementAndClick(cronusYogaPantClickColourBlack);

    }
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]")
    WebElement clickOnAddToCart;
    //Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    public void cronusYogaPantClickAddToCartButton() {
        log.info("Click on add to cart button : " + clickOnAddToCart.toString());
        mouseHoverToElementAndClick(clickOnAddToCart);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyText;
    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    public void verifyTextMessage() {
        log.info("Verify Text Message: " + verifyText.toString());
        String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualMessage = getTextFromElement(verifyText);
        Assert.assertEquals(expectedMessage, actualMessage);

    }
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement clickOnShoppingCart;
    // Click on ‘shopping cart’ Link into message
    public void shoppingCartLink() {
        log.info("Shopping cart link : " + clickOnShoppingCart.toString());
        clickOnElement(clickOnShoppingCart);

    }
    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping Cart']")
    WebElement verifyShoppingCart;
    // Verify the text Shopping Cart.
    public void verifyShoppingCart() {
        log.info("Verify shopping cart : " + verifyShoppingCart.toString());
        String expectedMessage = "Shopping Cart";
        String actualMessage = getTextFromElement(verifyShoppingCart);
        Assert.assertEquals(expectedMessage, actualMessage);


    }
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyCronusYogaPant;
    // Verify the product name ‘Cronus Yoga Pant’
    public void verifyProductNameCronusYogaPant() {
        log.info(" product name : " + verifyCronusYogaPant.toString());
        String expectedMessage = "Cronus Yoga Pant";
        String actualMessage = getTextFromElement(verifyCronusYogaPant);
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifyProductSize32;
    // Verify the product size ‘32’
    public void verifyProductSize32() {
        log.info("verify size 32 : " + verifyProductSize32.toString());
        String expectedMessage = "32";
        String actualMessage = getTextFromElement(verifyProductSize32);
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyProductColourBlack;
    // Verify the product colour ‘Black’
    public void verifyProductColourBlack() {
        log.info("Verify colour black : " + verifyProductColourBlack.toString());
        String expectedMessage = "Black";
        String actualMessage = getTextFromElement(verifyProductColourBlack);
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
