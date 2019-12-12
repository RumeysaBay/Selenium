package com.techtorial.TestS.Test_Pages;

import com.techtorial.POMPages.AmazonPage;
import com.techtorial.util.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTestPage {

    WebDriver driver;

    @BeforeClass
    public void Setup(){
        driver= DriverUtil.driverSetup("chrome");
    }

    @Test
    public void test(){
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        String pageTitle=driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Amazon"));

        AmazonPage amazonPage=new AmazonPage(driver);
        amazonPage.searchTab.click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
