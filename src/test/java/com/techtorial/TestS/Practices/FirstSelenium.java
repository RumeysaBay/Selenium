package com.techtorial.TestS.Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

    public static void main(String[] args) {


        // System.setProperty("webdriver.chrome.driver","src/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();//left size regular class right side instantiation
        // driver.get("http://www.google.com");
        driver.get("http://www.expedia.com");
        ////button[@id='tab-flight-tab-hp']
        WebElement hotelTab = driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']"));
        hotelTab.click();
        WebElement carTab = driver.findElement(By.xpath("//button[@id='tab-car-tab-hp']"));
        carTab.click();
        WebElement flightTab = driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']"));
        flightTab.click();
        WebElement flyingFrom = driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));
        flyingFrom.sendKeys("Chicago");
        WebElement flyingTo = driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
        flyingTo.sendKeys("Istanbul");
        WebElement returning = driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));
        returning.sendKeys("03/20/2020");
        returning.click();
        WebElement departing = driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
        departing.sendKeys("02/04/2020");
    }
}