package com.techtorial.util;

import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

public class DriverUtil {

    public static  WebDriver driver;

    public static WebDriver driverSetup(String browser){

        if(driver !=null){
            return driver;
        }

        switch (browser.toLowerCase()){
            case"chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            break;
            case "ff":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
            break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
            break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver=new OperaDriver();
            break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return driver;
    }



    public static void closeDriver(){
        if(driver !=null){
            driver.quit();
            driver=null;
        }
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
