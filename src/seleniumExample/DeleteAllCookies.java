package seleniumExample;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class DeleteAllCookies {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazone.com");
        driver.manage().window().maximize();

        Cookie cookie = new Cookie("kunal", "Raut");
        driver.manage().addCookie(cookie);

        System.out.println("Fetch all cookie" + "**********************************");
        Set<Cookie> cookies1 = driver.manage().getCookies();
        for (Cookie c : cookies1) {
            System.out.println(c);
        }
        System.out.println("Delete Cookies By Cookie" + "*****************************");
        driver.manage().deleteCookie(cookie);

        Set<Cookie> cookies2 = driver.manage().getCookies();
        for (Cookie c : cookies2) {
            System.out.println(c);
        }
        System.out.println("Delete All Cookies" + "***************************");
        driver.manage().deleteAllCookies();
        Set<Cookie> cookies3 = driver.manage().getCookies();
        for (Cookie c : cookies3) {
            System.out.println(c);
        }
        driver.quit();
    }
}