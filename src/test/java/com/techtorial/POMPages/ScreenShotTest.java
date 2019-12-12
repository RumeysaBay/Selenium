package com.techtorial.POMPages;

import com.techtorial.util.DriverUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShotTest {
    WebDriver driver;
    @BeforeClass
    public void Setup() {
        driver = DriverUtil.driverSetup("chrome");
    }
    @Test
    public void screenshotTest(){
        driver.get("https://www.amazon.com/");
        WebElement element = driver.findElement(By.id("asdlfkadfj"));
    }
    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if(result.getStatus()== ITestResult.FAILURE){
            long timestamp = System.currentTimeMillis();
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile,new File("src/test/java/screenshots/" + timestamp + ".jpg"));
        }
        driver.close();
    }

}


