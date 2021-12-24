package com.cybertek.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Open Browser");
    }

    @Test
    public void test1(){

        System.out.println("First Assertion");
        Assert.assertEquals("title","title");

        System.out.println("Second Assertion");
        Assert.assertEquals("url", "url");

    }
    @Test
    public void test2(){
        Assert.assertEquals("test2", "test2");
    }
    @Test
    public void test3(){
        String expectedTitle ="Cyt";
        String actualTitle = "Cybertek";

        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"Verify title starts with Cyb");
    }
    @Test
    public void test4(){
        // verify email contains @ sign
        String email ="mike@smith.com";
        Assert.assertTrue(email.contains("@"),"verify email contains @");
    }
    @Test
    public void test5(){
        Assert.assertFalse(0>1,"verify that 0 is not greater than 1");
    }
    @Test
    public void test6(){
        Assert.assertNotEquals("one","two");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Close Browser");
    }
}
