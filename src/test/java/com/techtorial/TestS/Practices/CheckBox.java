package com.techtorial.TestS.Practices;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBox {

    @Test
    public void checkBox(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        WebElement checkboxLink=driver.findElement(By.xpath("//a[@href='/checkboxes']"));
        checkboxLink.click();
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkboxes'])[1]"));
        checkBox1.click();
        Assert.assertTrue(checkBox1.isSelected());

    }


    @Test
    public void BothCheckBoxes(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        WebElement checkboxLink=driver.findElement(By.xpath("//a[@href='/checkboxes']"));
        checkboxLink.click();

        List<WebElement> listofElements=driver.findElements(By.xpath("//input[@type='checkbox']"));

        for(WebElement checkbox :listofElements){
            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }
    }
}
