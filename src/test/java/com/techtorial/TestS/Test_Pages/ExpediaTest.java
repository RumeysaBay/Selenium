package com.techtorial.TestS.Test_Pages;

import com.techtorial.POMPages.ExpediaPage;
import com.techtorial.util.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExpediaTest {
    WebDriver driver;

    @BeforeClass
    public void Setup(){

        driver=DriverUtil.driverSetup("chrome");
    }


    @Test
    public void test(){
        driver.manage().window().maximize();
        driver.get("http://www.expedia.com/");
        String title=driver.getTitle();
        Assert.assertTrue(title.contains("Expedia"));

        ExpediaPage expediaPage=new ExpediaPage(driver);
        expediaPage.hotelTab.click();
        expediaPage.flightTab.click();
        expediaPage.flyingFrom.sendKeys("Chicago");
        expediaPage.flyingTo.sendKeys("Istanbul");
        expediaPage.returning.sendKeys("03/20/2020");
        expediaPage.departing.sendKeys("02/04/2020");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
