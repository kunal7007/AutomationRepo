package seleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BookExample2 {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.abhibus.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("source")).sendKeys("Mumbai");
        List<WebElement> listofCities = driver.findElements(By.xpath("//ul[@id='ui-id-1']//child::li"));
        for (WebElement element : listofCities) {
            if (element.equals("Mumbai")) {
                element.click();
                break;
            }
        }
        Thread.sleep(3000);
        driver.quit();
    }
}

