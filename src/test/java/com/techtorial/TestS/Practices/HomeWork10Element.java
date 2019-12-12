package com.techtorial.TestS.Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomeWork10Element {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.target.com/");

        WebElement logo=driver.findElement(By.xpath("//a[contains(@id,'home')]"));
        logo.click();
        logo.sendKeys("home");

        WebElement deal=driver.findElement(By.xpath("//a[contains(@id,'secondary')]"));
        deal.click();
        deal.sendKeys("Deals");
        System.out.println(driver.getTitle());

        WebElement categories=driver.findElement(By.xpath("//span[.='Categories']"));
        categories.click();
        categories.sendKeys("Categories");
        System.out.println(driver.getTitle());

//        WebElement search=driver.findElement(By.xpath("//input[contains(@id,'search')]"));
//        search.click();
//        search.sendKeys("Search");
//        System.out.println(driver.getTitle());

        WebElement findPrime=driver.findElement(By.xpath("//*[@id='nav-link-prime']"));
        String prime=findPrime.getText();
        Assert.assertTrue(prime.toLowerCase().contains("prime"));


//        WebElement shopall=driver.findElement(By.xpath("//a[text()='Shop all']"));
//        shopall.click();
//        shopall.sendKeys("Shop all");
//        System.out.println(driver.getTitle());

//        WebElement account=driver.findElement(By.xpath("//a[@id='account']"));
//        account.click();
//        account.sendKeys("account");

         WebElement cart=driver.findElement(By.xpath("//a[@id='cart']"));
         cart.click();
         cart.sendKeys("cart");

    }
}
