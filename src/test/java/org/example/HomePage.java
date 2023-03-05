package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/birendrabishwakarma/desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        Thread.sleep(5000);

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]"));
        ele.click();
        //  System.out.println(ele.getText());

        // int i;
        for(int j=1; j<5; j++){
            driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
        }



    }
    // driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
}

