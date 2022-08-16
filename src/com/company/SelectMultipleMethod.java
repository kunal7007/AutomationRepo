package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class SelectMultipleMethod {

    public static void main(String[] args) throws InterruptedException, IOException{
        System.setProperty("webdriver.edge.driver","C:/Users/kraut/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement multipleDropDown = driver.findElement(By.name("multiple-select-example"));

       //JavascriptExecutor js = (JavascriptExecutor)driver;
      //  js.executeScript("arguments[0].scrollIntoview();",multipleDropDown);

        Select select = new Select(multipleDropDown);

        select.selectByValue("orange");
        Thread.sleep(3000);

        select.selectByVisibleText("Peach");
        Thread.sleep(3000);

        select.deselectByValue("orange");
        Thread.sleep(3000);

        select.deselectAll();
    }
    }

