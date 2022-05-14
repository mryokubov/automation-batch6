package com.techcenture;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeLoginScenario {

    final static String URL = "http://automationpractice.com";
    final static String EMAIL_ADDRESS = "kevinlee1234@gmail.com";
    final static String PASSWORD = "Kevin123";

    public static void main(String[] args) throws InterruptedException {


        //this will set up the chrome driver before it is launched
        WebDriverManager.chromedriver().setup();

        //  this will create an instance of a Chrome Browser
        WebDriver driver = new ChromeDriver();

        //visit the page with the URL passed
        driver.get(URL);

        WebElement signInLink =  driver.findElement(By.className("login"));

        signInLink.click();

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys(EMAIL_ADDRESS);

        WebElement passwdInput = driver.findElement(By.id("passwd"));

        passwdInput.sendKeys(PASSWORD);

        WebElement signInBtn = driver.findElement(By.id("SubmitLogin"));

        signInBtn.click();

        WebElement logoutLink = driver.findElement(By.className("logout"));
        logoutLink.click();

        Thread.sleep(3000);

        driver.close();
    }
}
