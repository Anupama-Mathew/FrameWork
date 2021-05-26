package com.anupama.trial.test.sanity;
import java.util.concurrent.TimeUnit;

import com.anupama.trial.test.BaseTester;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
public class Sanity1 extends BaseTester {
    @Test
    public void pageValidate(){
        String title=driver.getTitle();
        Assert.assertEquals("Swag Labs",title);
        System.out.println("Title of the page is:"+title);

    }

}



