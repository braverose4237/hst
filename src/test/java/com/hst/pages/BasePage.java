package com.hst.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasePage {

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

}
