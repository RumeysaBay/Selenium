package com.techtorial.HeadlessDriver;

import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class HeadlessDriver {

    @Test
    public void setHtmlUnitDriver(){

        //PhantomJsDriverManager.chromedriver().setup();
         WebDriver driver=new HtmlUnitDriver();
        // Navigate to Google
        driver.get("https://www.amazon.com/");
        System.out.println( driver.getTitle());
    }

    @Test
    public void setPhantomJSDriver(){
        WebDriverManager.phantomjs().setup();
        WebDriver driver=new PhantomJSDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }

    // Create 2 classes
    // 1 for PhantomJs driver
    // 1 for HtmlUnitDriver
    // Navigate to amazon.com
    // verify title
    // verify url
    // search for iphone
    // print out all the links from result page
    // Count and print those the links
    // Take Screenshots after every step(after every method get screenshot)
    // add Assertions





}
