import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImplicitAndExplicitWait {


        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.jiomart.com/");
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            WebElement element = driver.findElement(By.xpath("//a[text()='Privacy policy']"));
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].ScrollIntoView();",element);

            Thread.sleep(4000);
            driver.quit();



        }
    }


