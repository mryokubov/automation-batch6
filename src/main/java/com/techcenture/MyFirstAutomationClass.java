package com.techcenture;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.security.Key;
import java.util.Scanner;

public class MyFirstAutomationClass {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Which browser would you like to launch? ");
        String browser = scanner.nextLine();


        WebDriver driver = null;
        switch (browser){

            case "chrome":
                System.setProperty("webdriver.chrome.driver","/Users/omonjonyokubov/Downloads/chromedriver");
                driver = new ChromeDriver();
            break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver","/Users/omonjonyokubov/Downloads/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser");
        }


        // navigates to google.com
        driver.get("https://amazon.com");


        //enters Unicorn in search input and clicks ENTER
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("unicorns");

        driver.findElement(By.xpath("//input[@value='Go']")).click();

        driver.close();

    }
}
