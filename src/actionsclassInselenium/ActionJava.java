package actionsclassInselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;

public class ActionJava {
    public static void main(String[] args) throws InterruptedException, IOException{
        System.setProperty("webdriver.chrome.driver","C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        WebElement elementK = driver.findElement(By.xpath("//li[text()='K']"));
        WebElement elementA = driver.findElement(By.xpath("//li[text()='A']"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",elementK);
        Thread.sleep(6000);

        Actions actions = new Actions(driver);

        actions.clickAndHold(elementK).moveToElement(elementA).build().perform();                   //clickAndHold
        Thread.sleep(6000);

        actions.release().build().perform();
        Thread.sleep(6000);

        driver.close();

    }
}
