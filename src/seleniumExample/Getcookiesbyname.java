package seleniumExample;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Getcookiesbyname {
        public static void main(String[] args) throws InterruptedException, IOException {
            System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazone.com");
            driver.manage().window().maximize();

            Cookie cookie = new Cookie("kunal", "Raut");
            driver.manage().addCookie(cookie);

            System.out.println(driver.manage().getCookieNamed("kunal"));
            driver.quit();
        }




        }

