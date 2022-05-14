package com.techcenture;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationWithWebDriverManager {
    public static void main(String[] args) throws InterruptedException {


        // This line will take care of downloading the driver with the necessary version
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
//        driver.get("https://google.com");
//        driver.get("http://automationpractice.com");

//        driver.navigate().back();
        driver.navigate().forward();


   //     driver.navigate().to("https://amazon.com");

        Thread.sleep(5000);


     //   driver.close();





    }
}
