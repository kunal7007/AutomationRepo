package actionsclassInselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class Actionjava2 {
    public static void main(String[] args) throws InterruptedException, IOException{
            System.setProperty("webdriver.chrome.driver","C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement rightClickElement = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions = new Actions(driver);

        actions.contextClick(rightClickElement).perform();
        Thread.sleep(4000);

        driver.close();
}
}
