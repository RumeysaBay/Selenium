package com.techtorial.util.Homework;

import com.techtorial.util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class FindElements {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("chrome");
    }


    @Test
    public void findElements() throws InterruptedException {
        driver.get("https://www.google.com");
        WebElement searhfield = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searhfield.click();
        searhfield.sendKeys("des plaines library");
        WebElement seacrh = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]"));
        seacrh.click();

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).perform();
        WebElement clickonlink = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div[1]/a"));
        clickonlink.click();
        String originalWindowHandle = driver.getWindowHandle();
        String secondWindowHandle = "";
        Set<String> setfowindowhandeles = driver.getWindowHandles();
        for (String datahandle : setfowindowhandeles) {
            if (!datahandle.equalsIgnoreCase(originalWindowHandle)) {
                secondWindowHandle = datahandle;
            }
        }

        driver.switchTo().window(secondWindowHandle);


        WebElement header=driver.findElement(By.xpath("//a[@title='Des Plaines Public Library']"));
        header.click();

        WebElement ebooksandmore=driver.findElement(By.xpath("//a[@href='/ebooks-more']"));
    }


//
//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }


}





