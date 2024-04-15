package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LoginPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/birendrabishwakarma/Desktop/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);

        WebElement SignInButton = driver.findElement(By.cssSelector("a#nav-link-accountList.nav-a.nav-a-2.nav-progressive-attribute"));
        Thread.sleep(5000);
        SignInButton.click();
        String title2 = driver.getTitle();
        // System.out.println(title2);
        Assert.assertEquals("Amazon Sign-In", title2);
        driver.quit();


    }
}
