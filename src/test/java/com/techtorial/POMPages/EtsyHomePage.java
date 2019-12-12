package com.techtorial.POMPages;

import com.techtorial.util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class EtsyHomePage {

   static WebDriver driver;

    // initElements means initialize the variables on the page  // this we calling the instans of current class

    public EtsyHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }


    @FindBy(id= "global-enhancements-search-query")
    WebElement searchField;

    @FindBy(id= "register")
    WebElement register;

    @FindBy(xpath = "a[@href='https://www.etsy.com/cart?ref=hdr-cart']")
    WebElement cart;

    @FindBy(id = "catnav-primary-link-10855")
    public WebElement jeweleyAndAccessoriesLink;

    @FindBy(id = "a")
    public WebElement elementList;

    // What we did it on top it is explanation of the buttom part
//    @Test
//    public void getElements(){
//
//        WebElement searchField=driver.findElement(By.id("global-enhancements-search-query"));
//        WebElement register=driver.findElement(By.id("register"));
//        WebElement cart=driver.findElement(By.xpath("a[@href='https://www.etsy.com/cart?ref=hdr-cart']"));
//    }


}


