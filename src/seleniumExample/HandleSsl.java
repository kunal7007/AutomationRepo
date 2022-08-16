package seleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.io.IOException;
import java.time.Duration;

public class HandleSsl {

    public static void main(String[] args) throws InterruptedException, IOException {
       ChromeOptions options =new ChromeOptions();
      // FirefoxDriver options1 = new FirefoxDriver();
      //  InternetExplorerOptions options3 = new InternetExplorerOptions();

        options.setAcceptInsecureCerts(true);

        System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(3000);
        driver.quit();
    }
}
