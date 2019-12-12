package com.techtorial.TestS.Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Instagram {

    @Test
    public void login() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com");
        Actions actions = new Actions(driver);

        WebElement login=driver.findElement(By.xpath("//a[@href='/accounts/login/?source=auth_switcher']"));
         login.click();
         WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
         username.sendKeys("artwork_news");
         Thread.sleep(3000);
//        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
//        password.sendKeys("Iso123news");


    }
}
