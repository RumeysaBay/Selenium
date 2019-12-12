package com.techtorial.TestS.TestNgParameterPractice;

import com.techtorial.TestS.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMDataProvider extends TestBase {

    @DataProvider(name = "Credentials")
    public static Object [] [] credential (){
        return new Object [] []{{"admin","admin123"},{"textUserName","TesxtPassword"},
                {"admin","testPassword"},{"testUsername","admin123"}};
    }

    @Test(dataProvider = "Credentials")
    public void loginPageTest(String orangeUserName, String orangePassword){

        OrangeHRMPage orange=new OrangeHRMPage(driver);
       // driver.navigate().to();
        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
        orange.username.clear();
        orange.username.sendKeys(orangeUserName);

        orange.password.clear();
        orange.password.sendKeys(orangePassword);

        orange.loginButton.click();

        if(orangeUserName.equals("admin")& orangePassword.equals("admin123")){

            String actual = orange.pageTitle.getText();
            String expected = "Dashboard";
            // Expected values is coming from the requirement

            Assert.assertEquals(expected, actual);

            orange.dropDownButton.click();
            orange.LogOutButton.click();
        }else{

            String actual=orange.retryText.getText();
            String expected="Retry Login";
            Assert.assertEquals(expected,actual);

            driver.navigate().back();
        }


    }

}
