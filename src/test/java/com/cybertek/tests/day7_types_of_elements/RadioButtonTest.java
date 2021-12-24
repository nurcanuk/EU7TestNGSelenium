package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void test1() throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locating radio buttons

        WebElement blueRadioButton = driver.findElement(By.cssSelector("#blue"));
        WebElement redRadioButton = driver.findElement(By.id("red"));

        System.out.println("blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        System.out.println("redRadioButton.isSelected() = " + redRadioButton.isSelected());

        // verify blue is selected red is not selected

        // blue
        Assert.assertTrue(blueRadioButton.isSelected(),"verify that blue is selected");
        //red
        Assert.assertFalse(redRadioButton.isSelected(),"verify that red is NOT selected");

        //how to click radio button?
        //clicking red radio button
        redRadioButton.click();

        // blue --> false
        Assert.assertFalse(blueRadioButton.isSelected(),"verify that blue is NOT selected");
        // red --> TRUE
        Assert.assertTrue(redRadioButton.isSelected(),"verify that red is selected");


        Thread.sleep(3000);
        driver.quit();
    }
}
