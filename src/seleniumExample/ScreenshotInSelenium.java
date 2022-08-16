package seleniumExample;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotInSelenium {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapchat .com");
        driver.manage().window().maximize();

        File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f,new File("C:\\Users\\kraut\\Pictures\\kunal raut\\mahadev.jpg"));

        Thread.sleep(4000);

        driver.quit();
    }
}
