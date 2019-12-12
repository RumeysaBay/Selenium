package com.techtorial.util.Homework;

import com.techtorial.util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HoverOver2 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("chrome");
    }


    @Test
    public void avatars() throws InterruptedException {

        Actions actions = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/");
        WebElement hoverbutton=driver.findElement(By.xpath("//a[@href='/hovers']"));
        hoverbutton.click();

        WebElement user1=driver.findElement(By.xpath("//a[@href='/users/1']"));
        WebElement avatar1=driver.findElement(By.xpath("//a[@href='/users/1']/../../img"));
        WebElement user2=driver.findElement(By.xpath("//a[@href='/users/2']"));
        WebElement avatar2=driver.findElement(By.xpath("//a[@href='/users/2']/../../img"));
        WebElement user3=driver.findElement(By.xpath("//a[@href='/users/3']"));
        WebElement avatar3=driver.findElement(By.xpath("//a[@href='/users/3']/../../img"));
        Thread.sleep(2000);
        Assert.assertFalse(user1.isDisplayed());
        Assert.assertFalse(user2.isDisplayed());
        Assert.assertFalse(user3.isDisplayed());
        Thread.sleep(2000);
        actions.moveToElement(avatar1).build().perform();
        Assert.assertTrue(user1.isDisplayed());
        Assert.assertFalse(user2.isDisplayed());
        Assert.assertFalse(user3.isDisplayed());



    }

}
