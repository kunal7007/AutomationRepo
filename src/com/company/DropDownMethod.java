package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class DropDownMethod {

    public static void main(String[] args) throws InterruptedException, IOException{
        System.setProperty("webdriver.edge.driver","C:/Users/kraut/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        driver.findElement(By.id("hondaradio")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("hondacheck")).click();
        Thread.sleep(4000);
        driver.close();


    }
}
