package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import static junit.framework.Assert.assertEquals;

public class loginsfa2 {

    @Test
    public void testgenih  (){

        WebDriver chromeDriver = getWebDriver("chrome");
        performAutomation(chromeDriver);
        chromeDriver.quit();

        WebDriver edgeDriver = getWebDriver("edge");
        performAutomation(edgeDriver);
        edgeDriver.quit();
    }

    public static WebDriver getWebDriver(String browser) {
        WebDriver driver;

        switch (browser.toLowerCase()) {
            case "chrome":
//                WebDriver chrome = new ChromeDriver();
//                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-gpu");
                options.setPageLoadStrategy(PageLoadStrategy.NONE);
                driver = new ChromeDriver();
                break;

            case "edge":
//                WebDriver edge = new EdgeDriver();
//                WebDriverManager.edgedriver().setup();
                EdgeOptions options1 = new EdgeOptions();
                options1.setPageLoadStrategy(PageLoadStrategy.NONE);
                options1.addArguments("--disable-gpu");
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Unsupported browser: " + browser);
        }

        return driver;
    }

    public static void performAutomation(WebDriver driver) {

        // Your automation code goes here
        driver.get("https://sfa.cimory.com/");
        driver.manage().window().maximize();
        // Perform actions and assertions as needed
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("admin");
        try {
            Thread.sleep(1000); // Wait for 3 seconds (adjust as needed)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("eskalink123");
        try {
            Thread.sleep(2000); // Wait for 3 seconds (adjust as needed)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement signin = driver.findElement(By.xpath("//button[@class='btn btn-block btn-hero-primary']"));
        signin.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000); // Wait for 3 seconds (adjust as needed)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement assertDashboard = driver.findElement(By.xpath("//h1[@class='font-size-h2 mb-1']"));
        assertDashboard.isDisplayed();
        String text = assertDashboard.getText();

        assertEquals(text, "Dashboard");
        WebElement webdashboard = driver.findElement(By.id("app"));
        webdashboard.isDisplayed();
        try {
            Thread.sleep(3000); // Wait for 3 seconds (adjust as needed)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }


    }




