package com.techtorial.POMPages;

import com.techtorial.util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JeweleryAndAccesories {

   //  WebDriver driver;

    public JeweleryAndAccesories(WebDriver driver) {
       // driver = DriverUtil.driverSetup("chrome");
       // this.driver=driver;
        PageFactory.initElements(driver, this);
        // initElements means initialize the variables on the page  // this we calling the instans of current class
    }

    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=&max=&price_bucket=1']")
    WebElement anyprice;

    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=25&max=50&price_bucket=1']")
   WebElement lessthan25;

    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=25&max=50&price_bucket=1']")
   WebElement between25_50;

    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=50&max=100&price_bucket=1']")
    WebElement between50_100;

    @FindBy(xpath = "//a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=100&max=&price_bucket=1']")
    public WebElement over100;

//    @FindBy(id = "id='price-input-custom")
//    WebElement custom;

    @FindBy(id= "ship_to_select")
    public WebElement shipTo;


}


