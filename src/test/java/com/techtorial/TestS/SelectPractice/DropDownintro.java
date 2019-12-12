package com.techtorial.TestS.SelectPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownintro {

    @Test
    public void dropDown() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement hDropDownBox = driver.findElement(By.id("searchDropdownBox"));
        Select amazonselect = new Select(hDropDownBox); // you can not select dropeddown this without Select class thats why we create

        // amazonselect.selectByVisibleText("Electronics");
//        Thread.sleep(3000);
//        amazonselect.deselectByVisibleText("Electronics");

        // amazonselect.selectByIndex(3);
        // amazonselect.selectByValue("search-alias=gift-cards");


        List<WebElement> list = amazonselect.getOptions();

        for (WebElement lists : list) {
            int a = 0;
            System.out.println(++a + "." + lists.getText());
        }
        driver.close();


    }

        @Test
        public void selectOption2() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
            WebElement dropLink=driver.findElement(By.xpath("//a[@href='/dropdown']"));
            dropLink.click();
            WebElement drop = driver.findElement(By.id("dropdown"));
            Select droplist = new Select(drop);
           // droplist.selectByVisibleText("Option 2");
           // droplist.selectByIndex(2);
           // droplist.deselectByValue("2");
            droplist.getAllSelectedOptions();

    }


    @Test
    public void slider(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("http://the-internet.herokuapp.com/horizontal_slider");
        WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));
        actions.clickAndHold(slider).moveByOffset(30,0).perform();
       // actions.dragAndDropBy(slider,40,0).perform();
    }




}