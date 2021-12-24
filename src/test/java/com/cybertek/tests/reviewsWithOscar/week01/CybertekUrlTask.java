package com.cybertek.tests.reviewsWithOscar.week01;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class CybertekUrlTask {
    /*
    Use WebDriverFactory
    * go to http://practice.cybertekschool.com/ website
    * verify if the URL contains "cybertekschool"
    * Verify the title as well  "Practice"
     */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // go to the page
        driver.get("http://practice.cybertekschool.com/");



        String expectedUrlText = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        System.out.println("verify if the URL contains \"cybertekschool\" : "+actualUrl.contains(expectedUrlText));

        System.out.println("Title verify : "+ driver.getTitle().equalsIgnoreCase("Practice"));

        driver.close();

    }

}
