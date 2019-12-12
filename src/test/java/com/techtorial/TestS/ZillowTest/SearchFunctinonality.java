package com.techtorial.TestS.ZillowTest;

import com.techtorial.util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class SearchFunctinonality {


    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("chrome");
    }

    @Test
    public void searchbutton() {
        driver.get("https://www.google.com");
        WebElement searhfield = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searhfield.click();

        Assert.assertTrue(searhfield.isDisplayed());
    }


    @Test
    public void locateKeyWord(){
        driver.get("https://www.google.com");
        WebElement searhfield = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searhfield.click();
        searhfield.sendKeys("Zillow");

        Assert.assertTrue(searhfield.isDisplayed());
    }
        @Test
        public void link() {
            driver.get("https://www.google.com");
            WebElement searhfield = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
            searhfield.click();
            searhfield.sendKeys("Zillow");
            WebElement search = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]"));
            search.click();
            String originalWindowHandle = driver.getWindowHandle();
            Actions actions = new Actions(driver);
            actions.keyDown(Keys.COMMAND).perform();
            WebElement clickonlink = driver.findElement(By.xpath("//*[@id='vn1s0p1c0']/h3"));
            clickonlink.click();

            String secondWindowHandle="";
            Set<String> setfowindowhandeles=driver.getWindowHandles();
            for(String datahandle:setfowindowhandeles){
                if(!datahandle.equalsIgnoreCase(originalWindowHandle)){
                    secondWindowHandle=datahandle;
                }
            }

            driver.switchTo().window(secondWindowHandle);
            Assert.assertTrue(!originalWindowHandle.equalsIgnoreCase(secondWindowHandle));
        }



   @Test
   public void typeUserText() throws InterruptedException {
       driver.get("https://www.google.com");
       WebElement searhfield = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
       searhfield.click();
       searhfield.sendKeys("Zillow");
       WebElement search = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]"));
       search.click();
       String originalWindowHandle = driver.getWindowHandle();
       Actions actions = new Actions(driver);
       actions.keyDown(Keys.COMMAND).perform();
       WebElement clickonlink = driver.findElement(By.xpath("//*[@id='vn1s0p1c0']/h3"));
       clickonlink.click();

       String secondWindowHandle="";
       Set<String> setfowindowhandeles=driver.getWindowHandles();
       for(String datahandle:setfowindowhandeles){
           if(!datahandle.equalsIgnoreCase(originalWindowHandle)){
               secondWindowHandle=datahandle;
           }
       }

       driver.switchTo().window(secondWindowHandle);

       WebElement clickfield=driver.findElement(By.id("search-box-input"));
       clickfield.click();
       Thread.sleep(2000);
        WebElement userText=driver.findElement(By.xpath("//span[.='Current Location']"));
        userText.click();
        userText.sendKeys("Bartlett, IL");
//       Select select=new Select(userText);
//       Thread.sleep(3000);
//       select.selectByVisibleText("Current Location");

   }


   @Test
    public void negativeTestSepecialChar(){
        driver.get("https://www.zillow.com/");
       WebElement clickonlink = driver.findElement(By.xpath("//input[@id='search-box-input']"));
       clickonlink.click();
       clickonlink.sendKeys("@#$%%^&*()");

//       Assert.assertTrue(clickonlink.isDisplayed());
   }


//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }

}





