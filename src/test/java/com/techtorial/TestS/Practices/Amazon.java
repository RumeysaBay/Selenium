package com.techtorial.TestS.Practices;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon {
    @Test
    public void iphoneSearch() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.amazon.com/");
        String url = "https://www.amazon.com/";
        driver.get(url);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       // WebElement searchTab = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
         WebElement searchTab=driver.findElement(By.id("twotabsearchtextbox")); // if it is uniq id we can like this
        searchTab.click();
        searchTab.sendKeys("Iphone" + Keys.ENTER); // you don't need button one
        WebElement search=driver.findElement(By.xpath("//input[@class='nav-input']"));
        search.click();
       WebElement navigate=driver.findElement(By.xpath("//input[@type='Submit']"));
       navigate.click();

//      WebElement select=driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div"));
//      select.click();

        WebElement text = driver.findElement(By.xpath(" //span[text()='Simple Mobile Prepaid - Apple iPhone 6s (32GB) - Space Gray']"));
        String productname = text.getText();
        //System.out.println(productname.toLowerCase().contains("iphone"));

        Assert.assertTrue(productname.toLowerCase().contains("iphone"));

        WebElement prime=driver.findElement(By.xpath("//*[@id='nav-link-prime']"));
        String primelogo=prime.getText();
        Assert.assertTrue(primelogo.toLowerCase().contains("prime"));


    }
        @Test
        public void getPrice(){

            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.amazon.com/");
            WebElement searchTab=driver.findElement(By.id("twotabsearchtextbox"));
            searchTab.click();
            searchTab.sendKeys("Iphone" + Keys.ENTER);
            WebElement search=driver.findElement(By.xpath("//input[@class='nav-input']"));
            search.click();

            //*[@type='Text'] //


        }



        }


