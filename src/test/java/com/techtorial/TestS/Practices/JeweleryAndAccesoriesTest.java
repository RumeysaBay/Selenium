package com.techtorial.TestS.Practices;


import com.techtorial.POMPages.EtsyHomePage;
import com.techtorial.POMPages.JeweleryAndAccesories;
import com.techtorial.util.DriverUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.function.Function;

public class JeweleryAndAccesoriesTest {

    WebDriver driver;
    /*
    1.Navigate to etsy.com home page
    2.Verify you are on etsy home page
    3.Navigate to "Jewelery and Accessories" page
    4.Verify you are on "Jewelery and Accessories" page
    5.Select a price range "Over100"
    6.Select a shipping country as Germany
     */


    @BeforeClass
    public void Setup(){
        driver=DriverUtil.driverSetup("chrome");
    }

    @Test
    public void test() throws InterruptedException, MalformedURLException {
        //1 Navigetion the web page
        driver.get("https://www.etsy.com");

        URL url=new URL("https://google.com");
       //  driver.getPageSource();  => don't know what it is gives
        driver.navigate().to(url);

        driver.navigate().to("https://google.com");
        driver.navigate().refresh(); // refresh the page
        driver.navigate().back();  // go back
        driver.navigate().forward();  // go forward


        String expectedHomePageTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualHopePageTitle=driver.getTitle();
        Assert.assertEquals(expectedHomePageTitle,actualHopePageTitle);
        Thread.sleep(3000);

        //2
        EtsyHomePage etsyHomePage=new EtsyHomePage(driver);


        //expicity wait
        WebDriverWait wait=new WebDriverWait(driver,4);
        wait.until(ExpectedConditions.elementToBeClickable(etsyHomePage.jeweleyAndAccessoriesLink));
        System.out.println(ExpectedConditions.elementToBeClickable(etsyHomePage.jeweleyAndAccessoriesLink).toString());

        etsyHomePage.jeweleyAndAccessoriesLink.click();


        JeweleryAndAccesories jla=new JeweleryAndAccesories(driver);
        jla.over100.click();


        //FluentWait

        Wait<WebDriver> fluentWait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(25)) // max wait time
                .pollingEvery(Duration.ofSeconds(3)) // frequency
                .ignoring(NoSuchElementException.class); // which exception to ignore


        fluentWait.until(new Function<WebDriver, Object>() {
            public WebElement apply(WebDriver driver){
               return driver.findElement(By.xpath(""));
            }
        });

//        Select shipping=new Select(jla.shipTo);
//        shipping.selectByVisibleText("Germany");
//        String verifyCountry=shipping.getFirstSelectedOption().getText();
//        Assert.assertTrue(verifyCountry.contains("Germany"));

    }


    @AfterTest
    public void tearDown(ITestResult result) throws IOException {

        if(result.getStatus()==ITestResult.FAILURE){

            long timestamp=System.currentTimeMillis();
            File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


            FileUtils.copyFile(srcfile,new File("src/test/screenshots" +timestamp +".jpg"));
        }


        driver.close();
    }




}
