package com.techtorial.util.Homework;

import com.techtorial.util.DriverUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;

public class MultipleWindow {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver= DriverUtil.driverSetup("chrome");
    }

    @Test
    public void multipleWindowOpen() throws InterruptedException {
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.findElement(By.id("openwindow")).click();
        String fistwindowHandle = driver.getWindowHandle();
        String firstTitle=driver.getTitle();

         for(String secondWindow:driver.getWindowHandles()){
             driver.switchTo().window(secondWindow);
         }
         String secondTitle=driver.getTitle();
         WebElement thirdwindow=driver.findElement(By.xpath("//div[@data-course-id='56739']"));
         thirdwindow.click();

         String thirdwindowhandle=driver.getWindowHandle();
         driver.switchTo().window(thirdwindowhandle);

        String thirdTitle=driver.getTitle();

       Assert.assertFalse(!firstTitle.equalsIgnoreCase(secondTitle) && !secondTitle.equalsIgnoreCase(thirdTitle));
        Assert.assertFalse(firstTitle.equalsIgnoreCase(secondTitle));
        Assert.assertEquals("https://letskodeit.teachable.com/courses",driver.getCurrentUrl());


    }
}
