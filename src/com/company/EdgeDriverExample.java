package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class EdgeDriverExample {

    public static void main(String[] args) throws InterruptedException,IOException{
        System.setProperty("webdriver.edge.driver","C:/Users/kraut/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("kraut8680@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("7378770855");
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(7000)
        driver.close();

    }
}


