package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.util.List;

public class TagNameUse {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException{

        System.setProperty("webdriver.edge.driver", "C:/Users/kraut/Downloads/edgedriver_win64/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        List<WebElement> element = driver.findElements(By.tagName("a"));
        for(WebElement e : element){
            System.out.println(e);
        }


    }
}
