package com.techtorial.TestS.ActionPackage;


import com.techtorial.util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeAction {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("chrome");
    }

    @Test
    public void radioButton() {
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement radioButton = driver.findElement(By.id("bmwradio"));
        radioButton.click();
    }

    @Test
    public void selectClass() {
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement selects = driver.findElement(By.id("carselect"));
        Select selectone = new Select(selects);
        selectone.selectByVisibleText("BMW");
    }


    @Test
    public void multipleselect() throws InterruptedException {
        driver.get("https://learn.letskodeit.com/p/practice");
        Select multipleDropDpwn = new Select(driver.findElement(By.id("multiple-select-example")));
        multipleDropDpwn.selectByVisibleText("Apple");
        Thread.sleep(3000);
        multipleDropDpwn.selectByVisibleText("Orange");
        Thread.sleep(3000);
        multipleDropDpwn.selectByVisibleText("Peach");
        multipleDropDpwn.deselectByVisibleText("Orange");

    }

    @Test
    public void checkbox() {
        driver.get("https://learn.letskodeit.com/p/practice");
//        WebElement checkbox = driver.findElement(By.id("benzcheck"));
//        checkbox.click();
        WebElement practice=driver.findElement(By.xpath("//h1"));
        Assert.assertEquals("Practice Page",practice.getText());
    }

//    @Test
//    public void newWindow() {
//        driver.get("https://learn.letskodeit.com/p/practice");
//        WebElement newwindowbutton = driver.findElement(By.id("openwindow"));
//        String firstWindowtitle = driver.getTitle();
//        System.out.println("First windiw title is: +f" + firstWindowtitle);
//        String fistwindowHandle = driver.getWindowHandle();
//        newwindowbutton.click();
//        String secondWindowtitle = "";
//
//        for (String handle : driver.getWindowHandles()) {
//            if (!handle.equalsIgnoreCase(fistwindowHandle)) {
//                secondWindowtitle = handle;
//
//            }
//        }
//        driver.switchTo().window(secondWindowtitle);
//        String secondwindowTitle=driver.getTitle();
//
//        Assert.assertFalse(firstWindowtitle.equalsIgnoreCase(secondWindowtitle));
//
//    }
}