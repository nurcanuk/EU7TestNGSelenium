package com.cybertek.tests.reviewsWithOscar.week01;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class YahooPractice {
     /*
      open the webpage
      go to https://www.yahoo.com/
      verify the title
      expectedTitle= "Yahoo"
      actualTitle = webPage
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // go to the page
        driver.get("https://www.yahoo.com/");

        String expectedTitle = "Yahoo";

        String actualTitle = driver.getTitle();

        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.close();
    }

}
