package com.techtorial.IFrameIntro;

import com.techtorial.util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClearAndReplase {

    WebDriver driver;
    @BeforeClass
    public void setuo(){
        driver= DriverUtil.driverSetup("chrome");
    }

    @Test
    public void handleIframe(){

        driver.get("http://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");      //it is comes from page html in=>  <iframe id="mce_0_ifr"

        WebElement textField=driver.findElement(By.id("tinymce"));
        String expectedText="Hello from Techtorial class!!";
        textField.clear();
        textField.sendKeys(expectedText);

        Assert.assertEquals(textField.getText(),expectedText);

        // if we want to see it when it failes
        // Assert.assertEquals("Failed to assert text in text box",textField.getText(),"Hello Google");

    }


}
