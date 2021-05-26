package com.anupama.trial.test.sanity;
import java.io.IOException;
import com.anupama.trial.pages.CartPage;
import com.anupama.trial.pages.HomePage;
import com.anupama.trial.pages.LoginPage;
import com.anupama.trial.test.BaseTester;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Sanity2 extends BaseTester{
    @Test
    public void verifyPurchase() throws InterruptedException, IOException {

        //VERIFY LOGIN

        LoginPage loginpage=new LoginPage(driver);

        loginpage.setUsername("standard_user");
        loginpage.setPassword("secret_sauce");
        loginpage.LoginButton();
        Thread.sleep(5000);

        //VERIFY THE SELECTED PRODUCT

        HomePage homepage=new HomePage(driver);
        homepage.productVerify();

        boolean textFound = false;
        try {
            driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Backpack')]"));
            textFound = true;
        } catch (Exception e) {
            textFound = false;
        }
        if(textFound) {
            System.out.println("Product verification successful");
        }
        else {
            System.out.println("Product verification failed");
        }
        Thread.sleep(5000);


        //VERIFY ADD TO CART BUTTON

        CartPage cartpage=new CartPage(driver);
        cartpage.addbuttonVerify();

        boolean add_pdt = false;
        try {
            driver.findElement(By.xpath("//span[contains(text(),'1')]"));
            add_pdt = true;
        } catch (Exception e) {
            textFound = false;
        }
        if(add_pdt) {
            System.out.println("'ADD TO CART' button verification successful");
        }
        else {
            System.out.println("'ADD TO CART' button verification failed");
        }

        Thread.sleep(5000);

        //VERIFY WHETHER PRODUCT IS ADDED TO CART

        cartpage.cartbuttonVerify();
        boolean cart_pdt = false;
        try {
            driver.findElement(By.xpath("//span[contains(text(),'Your Cart')]"));
            cart_pdt = true;
        } catch (Exception e) {
            textFound = false;
        }
        if(cart_pdt==true) {
            System.out.println("CART verification successful");
        }
        else {
            System.out.println("CART verification failed");
        }

        Thread.sleep(5000);

        //VERIFY CHECK OUT BUTTON
        cartpage.checkoutVerify();
        Thread.sleep(5000);

        //INFORMATION INPUT
        cartpage.information_Verify();

        //CONTINUE BUTTON
        Thread.sleep(5000);
        cartpage.continueVerify();

        //ORDER PLACED
        Thread.sleep(5000);
        cartpage.finishVerify();





    }


}


