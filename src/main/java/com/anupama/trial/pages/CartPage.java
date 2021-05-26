
package com.anupama.trial.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CartPage {
    WebDriver driver;
    @FindBy(id= "add-to-cart-sauce-labs-backpack")
    WebElement tocart;
    @FindBy(id = "shopping_cart_container")
    WebElement cart_bttn;
    @FindBy(id="checkout")
    WebElement checkbttn;
    @FindBy(id="first-name")
    WebElement fname;
    @FindBy(id="last-name")
    WebElement lname;
    @FindBy(id="postal-code")
    WebElement postal_code;
    @FindBy(id="finish")
    WebElement finish;
    @FindBy(id="continue")
    WebElement continue_bttn;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void  addbuttonVerify() {
        tocart.click();
    }
    public void cartbuttonVerify(){
        cart_bttn.click();
    }
    public void checkoutVerify(){
        checkbttn.click();
    }
    public void information_Verify() throws InterruptedException {
        fname.sendKeys("Anupama");
        Thread.sleep(5000);
        lname.sendKeys("Mathew");
        Thread.sleep(5000);
        postal_code.sendKeys("695582");
    }
    public void continueVerify(){
        continue_bttn.click();
    }
    public void finishVerify(){
        finish.click();
    }

}