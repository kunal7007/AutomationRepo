package actionsclassInselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class Action3 {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");

        WebElement doubleclick1 = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));
        Actions actions = new Actions(driver);

        actions.doubleClick(doubleclick1).perform();
        Thread.sleep(5000);

        driver.close();
    }
}


