package com.techtorial.TestS.ActionPackage;

import com.techtorial.util.DriverUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseActions {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver= DriverUtil.driverSetup("chrome");
    }
    //driver first time initialized in this line

    @Test
    public void test1(){
        driver=DriverUtil.driverSetup("CHROME");
        // since we initialize it before it will not initialize in this line because of Singleton Pattern
        driver=DriverUtil.driverSetup("ff");  // this line not will be initialize
    }

    @Test
    public void mouseActionsIntro() {

        Actions actions = new Actions(driver);
        WebElement webElement = driver.findElement(By.id(""));

        // double click
        actions.doubleClick(webElement).perform();
        // right click is contextClick();
        actions.contextClick(webElement).perform();
        //hover over
        actions.moveToElement(webElement).perform();
    }
        @Test
        public void mouse() {
            // drag and drop
            Actions actions = new Actions(driver);
            driver.get("http://the-internet.herokuapp.com/");
            WebElement webElement = driver.findElement(By.xpath("//a[@href='/drag_and_drop']"));
            webElement.click();
            WebElement sourceElement = driver.findElement(By.id("column-a")); //  //div[@id='column-a']
            WebElement targetElement = driver.findElement(By.id("column-b"));
            actions.dragAndDrop(sourceElement, targetElement).perform();
        }




    }

