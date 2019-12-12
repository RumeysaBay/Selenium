package com.techtorial.TestS.TestNgParameterPractice;


import com.techtorial.util.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;

@Parameters("driverName")
public class OrangeHRMPage {

    // without PageFactory.initElements method, you elements will not be initialized.
    // it means you can not use your elements
    public OrangeHRMPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    //driver.findElement(By.ByCssSelector(".nav-search-scope.nav-sprite"))
    @FindBy(css=".nav-search-scope.nav-sprite")
     public WebElement anyElement;

    // want to store my elements
    @FindBy(id = "txtUsername")
   public WebElement username;

    @FindBy(id = "txtPassword")
   public WebElement password;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(className = "page-title")
    public WebElement pageTitle;

    @FindBy(id="user-dropdown")
    public WebElement dropDownButton;

    @FindBy(id="logoutLink")
    public WebElement LogOutButton;

    @FindBy(className = " dashboardCard-title-for-card")
    public  WebElement retryText;

    @FindBy(id = "user_menu")
    public WebElement rightClick;

}
