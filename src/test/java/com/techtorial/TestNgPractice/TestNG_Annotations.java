package com.techtorial.TestNgPractice;

import org.testng.annotations.*;

public class TestNG_Annotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This will execute before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This will be execute after suite ");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute before test");
    }

    @AfterTest
    public void Aftertest(){
        System.out.println("This will execute After test");
    }

    @Test(priority = 1)
    public void test2(){
        System.out.println("This is test1");
    }

    @Test(priority = 2,alwaysRun = true)
    public void test1(){
        System.out.println("This is test2");
    }

    @Test(priority = 3,enabled = true)
    public void test3(){
        System.out.println("This is test3");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is Before Method");
    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("This is After Method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is After Class");
    }



}
