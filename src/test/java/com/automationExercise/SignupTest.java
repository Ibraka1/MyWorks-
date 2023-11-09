package com.automationExercise;

import com.utulities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SignupTest extends TestBase {


    @Test
    public void test01() {
        //Go to given URL https://www.automationexercise.com/
        driver.get("https://www.automationexercise.com");
        //Click on the Signup/Login button
        driver.findElement(By.xpath("(//*[. =' Signup / Login'])[2]")).click();
        //Confirm that Login page has opened -- opened

        //Write your Name in section New User Signup! -- Ibrahim
        driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Ibrahim");
        //Write yor Email Address in section New User Signup! --ibraka48@gmail.com
        driver.findElement(By.xpath("(//input[@type = 'email'])[2]")).sendKeys("ibraka48@gmail.com");
        //Click on Signup button
        driver.findElement(By.xpath("(//*[@type = 'submit'])[2]")).click();
        //Click on Mr. for Title
        driver.findElement(By.id("id_gender1")).click();
        //Write value to Password section -- Selenium1234
        driver.findElement(By.id("password")).sendKeys("Selenium1234");
        //Write First name to box in ADDRESS INFORMATION section -- Ibrahim
        driver.findElement(By.id("first_name")).sendKeys("Ibrahim");
        //"Write Last name to box in ADDRESS INFORMATION section --  Akar
        driver.findElement(By.id("last_name")).sendKeys("Akar");
        //"Write Address to box in ADDRESS INFORMATION section -- Dulkadiroglu
        driver.findElement(By.id("address1")).sendKeys("Dulkadiroglu");
        //Select Country from dropdwon menü --Canada
        WebElement countries = driver.findElement(By.id("country"));
        Select select = new Select(countries);
        select.selectByIndex(2); //3rd Country at 2nd index must be Canada

        //Write State to box in ADDRESS INFORMATION section --Kahramanmaras
        driver.findElement(By.id("state")).sendKeys("Kahramanmaras");
        //Write City to box in ADDRESS INFORMATION section -- Kahramanmaras
        driver.findElement(By.id("city")).sendKeys("Kahramanmaras");
        //Write Zipcode to box in ADDRESS INFORMATION section -  46080
        driver.findElement(By.id("zipcode")).sendKeys("46080");
        //Write Mobile Number to box in ADDRESS INFORMATION section -- 5451234578
        driver.findElement(By.id("mobile_number")).sendKeys("5451234578");
        //Click on Create Account button
        driver.findElement(By.xpath("(//button[@type ='submit'])[1]")).click();
        //Confirm  created account -- We can run this code just one time
       // Assert.assertTrue(driver.findElement(By.className("title text-center")).getText().equals("ACCOUNT CREATED!"));
    }
}
