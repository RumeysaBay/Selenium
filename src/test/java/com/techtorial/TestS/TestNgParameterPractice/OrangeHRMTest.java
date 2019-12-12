package com.techtorial.TestS.TestNgParameterPractice;

import com.techtorial.TestS.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends TestBase {


    @Test
    public void login() throws InterruptedException {
        OrangeHRMPage orange = new OrangeHRMPage(driver);
        // if you have more  class you need tocreate another objects

        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");

        orange.username.clear();
        orange.username.sendKeys("admin");
        orange.password.clear();
        orange.password.sendKeys("admin123");
        orange.loginButton.click();

        String actual = orange.pageTitle.getText();
        String expected = "Dashboard";
        // Expected values is coming from the requirement

        Assert.assertEquals(expected, actual);


    }

}
