package com.techtorial.TestS.Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrstSelenHomeWork {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.zara.com/us/");
        WebElement title=driver.findElement(By.xpath("//a[@id='logo']"));
        driver.getTitle();

                             

    }
}
