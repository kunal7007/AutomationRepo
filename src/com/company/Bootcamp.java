package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Bootcamp {

    public static void main(String[] args) throws InterruptedException, IOException{
        System.setProperty("webdriver.edge.driver","C:/Users/kraut/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://demo.boomauto.co.in/index.php/contact/");

        WebElement multipleDropDown = driver.findElement(By.name("choices wpforms-field-row wpforms-field-medium"));

        Select select = new Select(multipleDropDown);


        select.selectByValue("C Programming");
        select.selectByValue("C++ Programming");
        Thread.sleep(3000);


    }

}
