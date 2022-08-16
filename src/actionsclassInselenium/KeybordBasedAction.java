package actionsclassInselenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class KeybordBasedAction {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/index.htm");

        WebElement searchId = driver.findElement(By.id("search-strings"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", searchId);
        Thread.sleep(6000);

        Actions actions = new Actions(driver);

        actions.moveToElement(searchId).click().
        keyDown(Keys.SHIFT).sendKeys("coding").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(6000);

        driver.close();

    }
}
