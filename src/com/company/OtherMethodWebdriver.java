package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class OtherMethodWebdriver {

    public static void main(String[] args) throws InterruptedException, IOException{
        System.setProperty("webdriver.edge.driver","C:/Users/kraut/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//u[text()='Forget Password')]")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.close();

    }
}
