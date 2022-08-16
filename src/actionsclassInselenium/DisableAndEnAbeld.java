package actionsclassInselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class DisableAndEnAbeld {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement disableButton = driver.findElement(By.id("disabled-button"));
        WebElement enableButton = driver.findElement(By.id("enabled-button"));

        System.out.println(disableButton.isEnabled());
        System.out.println(enableButton.isEnabled());

        Thread.sleep(3000);
        driver.close();
    }
}