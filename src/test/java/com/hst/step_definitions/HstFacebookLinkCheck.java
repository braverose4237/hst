package com.hst.step_definitions;

import com.hst.pages.BasePage;
import com.hst.utilities.BrowserUtils;
import com.hst.utilities.ConfigurationReader;
import com.hst.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HstFacebookLinkCheck {
    BasePage basePage=new BasePage();
    @When("user is on the hst Page")
    public void user_is_on_the_hst_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(1);
    }

    @When("user write the Plz and Enter")
    public void user_write_the_plz_and_enter() {
        basePage.plz.sendKeys("63263");
        //Driver.getDriver().findElement(By.xpath("//input[@id='search-query']")).sendKeys("63263");
        basePage.search.click();
       //Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-info form-control-sm']")).click();
        BrowserUtils.sleep(3);
    }

    @And("user deny to Cookies")
    public void userDenyToCookies() {
        System.out.println("user deny to Cookies");
        basePage.CookiesDeny.click();
        //Driver.getDriver().findElement(By.xpath("//button[@class='cmplz-btn cmplz-deny']")).click();
    }

    @Then("check user on the facebook WebSite")
    public void checkUserOnTheFacebookWebSite() {
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("HST Systemtechnik"));
        BrowserUtils.sleep(3);
    }

    @And("user click Facebook Link")
    public void userClickFacebookLink() {
        basePage.facebook.click();
        //Driver.getDriver().findElement(By.xpath("//a[@href='https://de-de.facebook.com/hst.systemtechnik']")).click();
        BrowserUtils.sleep(2);

    }
}
