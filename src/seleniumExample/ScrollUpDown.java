package seleniumExample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class ScrollUpDown {
    public static void main(String[] args) throws InterruptedException, IOException{

            System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.snapchat.com");
            driver.manage().window().maximize();

            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,300)");
            Thread.sleep(5000);
            js.executeScript("window.scrollBy(0,-300)");
            Thread.sleep(5000);
            driver.quit();

        }
    }


