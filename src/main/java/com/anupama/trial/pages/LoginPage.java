package com.anupama.trial.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
    WebDriver driver;
    @FindBy(id = "user-name")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginbutton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String UsrNme) {
        username.sendKeys(UsrNme);
    }

    public void setPassword(String Pswd) {
        password.sendKeys(Pswd);
    }

    public void  LoginButton() {
        loginbutton.click();

    }
}