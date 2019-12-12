package com.techtorial.TestS.Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio {

    @Test
    public void radioButton(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-form/");

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Meysa");
        WebElement lastname=driver.findElement(By.id("lastname"));
        lastname.sendKeys("Bay");
        WebElement sex=driver.findElement(By.xpath("//input[@id='sex-1']"));
        sex.click();
    }
}
