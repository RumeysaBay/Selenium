package com.techtorial.TestS.Practices;

import com.techtorial.util.DriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Guru {

 WebDriver driver;

    @BeforeClass
    public void setup(){
        driver= DriverUtil.driverSetup("chrome");
    }

    @Test
    public void guru() throws InterruptedException {

        Actions actions = new Actions(driver);
         driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement source = driver.findElement(By.id("credit1"));
        WebElement target = driver.findElement(By.id("shoppingCart3"));
        Thread.sleep(4000);
        actions.dragAndDrop(source, target).perform();
        Thread.sleep(4000);

        WebElement source1=driver.findElement(By.xpath("//li[@id='fourth']"));
        WebElement target1=driver.findElement(By.xpath("//ol[@id='amt7']"));
        actions.dragAndDrop(source1,target1).perform();

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Thread.sleep(3000);
        actions.contextClick(rightclick).perform();
        WebElement doubleclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        actions.doubleClick(doubleclick).perform();
        Thread.sleep(3000);



    }

        @AfterClass
        public void tearDown(){
            driver.quit();
        }

}
