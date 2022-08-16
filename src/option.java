import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class option {

        public static void main(String[] args) throws InterruptedException, IOException {
            System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
            WebDriver test1 = new ChromeDriver();
            test1.get("http://demo.boomauto.co.in/index.php/contact/");     //webside URL

            System.out.println(test1.getTitle());

            test1.findElement(By.partialLinkText("About")).click();        //partial link text
            Thread.sleep(4000);

            test1.findElement(By.partialLinkText("Contact")).click();
            Thread.sleep(4000);

            test1.findElement(By.id("wpforms-666-field_0")).sendKeys("vaishali");    //locators
            Thread.sleep(4000);


            test1.findElement(By.id("wpforms-666-field_5")).sendKeys("9689989483");
            Thread.sleep(4000);


          WebElement singleDropDown = test1.findElement(By.className("choices__inner"));
          Select select1=new Select(singleDropDown);
          select1.selectByValue("C Programming");
             Thread.sleep(4000);

            test1.findElement(By.id("wpforms-666-field_2")).sendKeys("detail please");
            Thread.sleep(4000);

            test1.findElement(By.id("wpforms-submit-666")).click();
            Thread.sleep(4000);

            test1.close();

        }
    }
