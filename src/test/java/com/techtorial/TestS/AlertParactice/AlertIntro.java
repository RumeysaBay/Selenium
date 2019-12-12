package com.techtorial.TestS.AlertParactice;

import com.techtorial.util.DriverUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertIntro {

    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver= DriverUtil.driverSetup("chrome");
    }

    @Test
    public void alertIntro() throws InterruptedException {


        driver.get("http://the-internet.herokuapp.com");
        WebElement alertLink=driver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        alertLink.click();

//        WebElement alertButton=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
//        alertButton.click();
//        WebElement confirmButton=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
//        confirmButton.click();
        //driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();
        WebElement prompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        prompt.click();
       // Thread.sleep(4000);
        driver.switchTo().alert().sendKeys("Rumeysa");
        driver.switchTo().alert().accept();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
