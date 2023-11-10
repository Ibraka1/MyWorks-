package com.automationExercise;

import com.utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends TestBase {
    @Test
    public void loginTest() {

        //Go to given URL   -- https://www.automationexercise.com/
        driver.get("https://www.automationexercise.com/");
        //Click on the Signup/Login button
        driver.findElement(By.xpath("//i[@class ='fa fa-lock']")).click();
        //Confirm that Login page has opened  --https://www.automationexercise.com/login

        //Write your Email Address in section Login to your account  --  ibraka48@gmail.com
        WebElement email = driver.findElement(By.xpath("(//*[@placeHolder = 'Email Address'])[1]"));
        email.sendKeys("ibraka48@gmail.com");
        //Write your Password  --Selenium1234
        WebElement password = driver.findElement(By.xpath("(//*[@placeHolder = 'Password'])[1]"));
        password.sendKeys("Selenium1234");
        //Click on Login button
        driver.findElement(By.xpath("(//button[@type ='submit'])[1]")).click();
        //Confirm that home page opened
        String logedUser = driver.findElement(By.xpath("//a[@href ='/logout']")).getText();
        Assert.assertEquals("Logout", logedUser);






    }
}
