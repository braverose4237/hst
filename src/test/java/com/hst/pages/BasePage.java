package com.hst.pages;

import com.hst.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@id='search-query']")
    public WebElement plz;


    @FindBy(xpath = "//button[@class='btn btn-info form-control-sm']")
    public WebElement search;

    @FindBy(xpath = "//a[@href='https://hst.de/unternehmen/kontakt/technisches-buero-mitte-west/']")
    public WebElement checkAnsprechPartnerName;

    @FindBy(xpath = "//section[@id='search-result']/small")
    public WebElement checkStadt;

    @FindBy(xpath = "//button[@class='cmplz-btn cmplz-deny']")
    public WebElement CookiesDeny;

    @FindBy(xpath = "//a[@href='https://de-de.facebook.com/hst.systemtechnik']")
    public WebElement facebook;

}
