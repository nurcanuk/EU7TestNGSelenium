package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {

        // we have to enter this line every time we want to open chrome
        // hey webdrivermanager, can you make chrome ready for me for automation
        WebDriverManager.chromedriver().setup();

        // WebDriver represent the browser
        // We are creating driver for chrome browser
        // new ChromeDriver () --> this part will open Chrome Browser
        WebDriver driver = new ChromeDriver();

        //.get(url) method used for navigation to page
        driver.get("https://cybertekschool.com");



    }
}
