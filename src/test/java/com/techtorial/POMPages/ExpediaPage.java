package com.techtorial.POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaPage {

    public ExpediaPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath="//button[@id='tab-hotel-tab-hp']")
    public WebElement hotelTab;

    @FindBy(xpath="//button[@id='tab-car-tab-hp']")
    public WebElement carTab;

    @FindBy(xpath="//button[@id='tab-flight-tab-hp']")
    public WebElement flightTab;

    @FindBy(xpath="//input[@id='flight-origin-hp-flight']")
    public WebElement flyingFrom;

    @FindBy(xpath="//input[@id='flight-destination-hp-flight']")
    public WebElement flyingTo;

    @FindBy(xpath="//input[@id='flight-returning-hp-flight']")
    public WebElement returning;

    @FindBy(xpath="//input[@id='flight-departing-hp-flight']")
    public WebElement departing;




}
