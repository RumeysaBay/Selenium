package com.techtorial.TestS.WindowHandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class MultiWindowHandle {

    @Test
    public void windowIntro(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        // click on window link
        WebElement windowlink=driver.findElement(By.xpath("//a[@href='/windows']"));
        windowlink.click();

        // get the original window handle
        String originalWindowHandle=driver.getWindowHandle();

        // click on new page
        WebElement newWindow=driver.findElement(By.xpath("//a[@href='/windows/new']"));
        newWindow.click();

        // with set we got all windowhandles
        String secondWindowHandle="";
        Set<String> setfowindowhandeles=driver.getWindowHandles();
        for(String datahandle:setfowindowhandeles){
            if(!datahandle.equalsIgnoreCase(originalWindowHandle)){
                secondWindowHandle=datahandle;
            }
        }

        driver.switchTo().window(secondWindowHandle);

        /////////////////////

        WebElement newWindowText=driver.findElement(By.xpath("//h3[.='New Window']"));
        System.out.println("New Window text is: "+newWindowText.getText());

        // create the third page
        driver.switchTo().window(originalWindowHandle);
        newWindow.click();

        Set<String> thirdwindowHandles=driver.getWindowHandles();
        String thirddatahandle="";
        for(String datahandle: thirdwindowHandles){
            if(!datahandle.equalsIgnoreCase(originalWindowHandle) && !datahandle.equalsIgnoreCase(secondWindowHandle));
            thirddatahandle=datahandle;
        }
       driver.switchTo().window(thirddatahandle);



    }
}
