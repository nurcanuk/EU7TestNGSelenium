package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork {
    @Test
    public void test4() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        //2. Login with-----Username: Tester, password: test
        WebElement usernameInputBox = driver.findElement(By.name("ctl00$MainContent$username"));
        usernameInputBox.sendKeys("Tester");

        WebElement passwordInputBox = driver.findElement(By.name("ctl00$MainContent$password"));
        passwordInputBox.sendKeys("test");


        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        Thread.sleep(2000);


        // Click on check all button verify all the checkboxes are checked
        WebElement checkAllButton = driver.findElement(By.id("ctl00_MainContent_btnCheckAll"));
        checkAllButton.click();

        for (int i = 2; i <= 9; i++) {
            String id = "ctl00_MainContent_orderGrid_ctl0" + i + "_OrderSelector";
            WebElement checkBox = driver.findElement(By.id(id));
            Assert.assertTrue(checkBox.isSelected(), "verify that checkbox" + (i - 1) + " is selected");

        }

        WebElement unCheckallButton = driver.findElement(By.id("ctl00_MainContent_btnUncheckAll"));
        unCheckallButton.click();

        for (int i = 2; i <= 9; i++) {
            String id = "ctl00_MainContent_orderGrid_ctl0" + i + "_OrderSelector";
            WebElement checkBox = driver.findElement(By.id(id));
            Assert.assertFalse(checkBox.isSelected(), "verify that checkbox" + (i - 1) + " is not selected");

        }

        //5. Select one of the checkbox and delete one person
        WebElement checkBox2 = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
        checkBox2.click();

        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();



        Thread.sleep(3000);
        driver.quit();
    }
}

