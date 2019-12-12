package com.techtorial.JavaScriptExecution;

import com.techtorial.TestS.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptIntro  {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }


    @Test
    public void jsTest(){
       // driver.get("https://www.google.com");
        // java script executor
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.location='https://www.google.com'");

       // driver.getTitle();
        String title=js.executeScript("return document.title").toString();
        System.out.println("My page's title is: " + title);


        // get url
        driver.getCurrentUrl();
        String url=js.executeScript("return document.URL").toString();
        System.out.println("My page's url is: " + url);

//        // Scroll down/up
//        driver.navigate().to("https://www.expedia.com");
//        js.executeScript("window.scrollBy(0,500");
//        js.executeScript("window.scrollBy(0.-1500)");

        // generate a custom alert
//        js.executeScript("alert('My custom alert')");
//
//        // click
//        WebElement button=driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']"));
//        js.executeScript("arguments[0].click()",button);  // button is your array


        // sendKeys alternative
        driver.navigate().to("https://www.amazon.com");
        js.executeScript("document.getElementById('twotabsearchtextbox').value='iphone';");
    }

}
