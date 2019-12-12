package com.techtorial.TestS.ActionPackage;

import com.techtorial.util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KeyDown {
    static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("ff");
    }

    @Test
    public void search() {
        driver.get("https://www.google.com");
        WebElement searchfield = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchfield.click();
        searchfield.sendKeys("Selenium");
        WebElement search = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
        search.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).perform();//perform execuition part
        WebElement clickcommand = driver.findElement(By.xpath("//a[@href='https://www.seleniumhq.org/']"));
        clickcommand.click();

    }

    @Test
    public void selectall() throws InterruptedException {
        driver.get("https://www.google.com");
        WebElement searchfield = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchfield.click();
        searchfield.sendKeys("Selenium"+Keys.ENTER);
        Thread.sleep(3000);
        //            WebElement search = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
        //            search.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).sendKeys("a").perform();


    }

}
