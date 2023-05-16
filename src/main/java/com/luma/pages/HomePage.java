package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    //---------------Homepage action takes to WomanPage------------------

    //Mouse Hover on Women Menu
    @CacheLookup
    @FindBy(css = "a[id='ui-id-4'] span:nth-child(2)")
    WebElement mouseHoverWomenMenu;
    public void mouseHoverWomenMenu() {
        log.info("Mouse hover Women menu : " + mouseHoverWomenMenu.toString());
        mouseHoverToElement(mouseHoverWomenMenu);

    }
    // Mouse Hover on Tops
    @CacheLookup
    @FindBy(css = "#ui-id-9")
    WebElement mouseHoverTop;
    public void mouseHoverOnTop() {
        log.info("Mouse hover on tops : " + mouseHoverTop.toString());
        mouseHoverToElement(mouseHoverTop);
    }
    @CacheLookup
    @FindBy(css = "a[id='ui-id-5'] span:nth-child(2)")
    WebElement mouseHoverOnMenMenu;
    //Mouse Hover on Men Menu
    public void mouseHoverOnMenMenu() {
        log.info("Mouse hover on Men menu : " + mouseHoverOnMenMenu.toString());
        mouseHoverToElement(mouseHoverOnMenMenu);
        //By mouseHoverOnMenMenu = By.xpath("//span[normalize-space()='Men']");
    }
    @CacheLookup
    @FindBy(css = "#ui-id-18")
    WebElement mouseHoverOnBottom;
    //Mouse Hover On Bottom
    public void mouseHoverOnBottom() {
        log.info("Mouse hover on bottom : " + mouseHoverOnBottom.toString());
        mouseHoverToElement(mouseHoverOnBottom);

    }

    @CacheLookup
    @FindBy(css = "a[id='ui-id-6'] span:nth-child(2)")
    WebElement mouseHoverGearMenu;
    // Mouse Hover on Gear Menu
    public void mouseHoveOnGearMenu() {
        log.info("Mouse hover on gearmenu : " + mouseHoverGearMenu.toString());
        mouseHoverToElement(mouseHoverGearMenu);
        //By mouseHoverGearMenu = By.xpath("//span[normalize-space()='Gear']");
    }
}
