package com.techtorial.CookiesIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Cookies1 {

    @Test
    public void getCookies1(){

        Cookie cookies=new Cookie("session-id","139-1972738-5987328");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().addCookie(cookies);

    }
}
