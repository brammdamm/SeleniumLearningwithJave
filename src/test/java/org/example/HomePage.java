package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class HomePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/birendrabishwakarma/Desktop/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);

        String homePageTitleName = driver.getTitle();
        System.out.println("home page is" + homePageTitleName);
        Assert.assertEquals("Amazon.com. Spend less. Smile more.", homePageTitleName);
        }
}








