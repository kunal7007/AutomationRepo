package actionsclassInselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class Action4 {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");

        WebElement dragElement1 = driver.findElement(By.id("draggable"));
        WebElement dropElement2 = driver.findElement(By.id("droppable"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", dragElement1);
        Thread.sleep(6000);

        Actions actions = new Actions(driver);

        actions.dragAndDrop(dragElement1,dropElement2).perform();
        Thread.sleep(6000);

        driver.close();

    }
}
