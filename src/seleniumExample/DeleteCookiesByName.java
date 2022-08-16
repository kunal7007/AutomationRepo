package seleniumExample;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class DeleteCookiesByName {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazone.com");
        driver.manage().window().maximize();

        Cookie cookie = new Cookie("kunal", "Raut");
        driver.manage().addCookie(cookie);

        driver.manage().deleteCookieNamed("kunal");
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie c : cookies) {
            System.out.println(c);
        }
        driver.quit();
    }
}
