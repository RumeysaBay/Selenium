package com.techtorial.IFrameIntro;

import com.techtorial.util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class IFrame1 {

    WebDriver driver;
   @BeforeClass
   public void setuo(){
       driver= DriverUtil.driverSetup("chrome");
   }


    @Test
    public void navigate() throws InterruptedException {
        driver.get("https://www.amazon.com");

        // switch to using Webelement
         WebElement navigate=driver.findElement(By.id("ape_Gateway_desktop-ad-center-1_desktop_iframe"));
        driver.switchTo().frame(navigate);
        navigate.click();

        // switch to using index
       // driver.switchTo().frame(0);

        // switch to frame using id
        //driver.switchTo().frame("mce_0_ifr");

        // going out of the frame (only 1 step out)
        driver.switchTo().parentFrame();

        // this wil bring to very first frame it doesn't matter how far you go
        driver.switchTo().defaultContent();

        String secondWindowHandle="";
        String originalWindowHandle=driver.getWindowHandle();

        Set<String> setfowindowhandeles=driver.getWindowHandles();
        for(String datahandle:setfowindowhandeles){
            if(!datahandle.equalsIgnoreCase(originalWindowHandle)){
                secondWindowHandle=datahandle;
            }
        }


        driver.switchTo().window(secondWindowHandle);
        Thread.sleep(2000);
        driver.close();

    }


}
