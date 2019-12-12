package com.techtorial.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

    public AmazonPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="twotabsearchtextbox")
     public WebElement searchTab;

    @FindBy(xpath=" //span[text()='Simple Mobile Prepaid - Apple iPhone 6s (32GB) - Space Gray")
    public WebElement text;

}
