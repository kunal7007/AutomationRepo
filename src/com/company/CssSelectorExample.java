package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class CssSelectorExample {

    public static void main(String[] args) throws InterruptedException, IOException{
        System.setProperty("webdriver.edge.driver","C:/Users/kraut/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("kraut8680@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[id=pass]")).sendKeys("7378770855");
        Thread.sleep(3000);
        driver.close();
    }
}
