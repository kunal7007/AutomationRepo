package seleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.time.Duration;

public class HandleSsl2 {

    public static void main(String[] args) throws InterruptedException, IOException {

        ChromeOptions options =new ChromeOptions();
        // FirefoxDriver options1 = new FirefoxDriver();
        //  InternetExplorerOptions options3 = new InternetExplorerOptions();

        options.setAcceptInsecureCerts(true);
        options.setHeadless(true);

        System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.close();
    }
}
