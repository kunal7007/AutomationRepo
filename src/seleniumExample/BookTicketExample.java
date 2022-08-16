package seleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BookTicketExample {

         public static WebDriver driver;

             public static void selectSourceAndDestination(String city, String sourceOrDestination) {
                 List<WebElement> listOfCities = null;
                 if (sourceOrDestination.equals("source")) {
                     driver.findElement(By.id("source")).sendKeys("city");
                     listOfCities = driver.findElements(By.xpath("//ul[@id='ui-id-1']//child::li"));

                 } else if (sourceOrDestination.equals("destination")) ;
                 driver.findElement(By.id("destination")).sendKeys("city");
                 listOfCities = driver.findElements(By.xpath("//ul[@id='ui-id-2']//child::li"));

             }
              public static void selectMonth (String Month) {
                 List<WebElement> listOfMonth = driver.findElements(By.xpath("//span.[@ui-datapicker-month']"));
                  for (WebElement element : listOfMonth) {
                      if (element.getText().equals(Month)){
                          element.click();
                      }
                  }
              }
             public static void selectYear (String Year) {
                 List<WebElement> listOfYear = driver.findElements(By.xpath("//span.[@ui-datapicker-year']"));
                 for (WebElement element : listOfYear) {
                     if (element.getText().equals(Year)){
                         element.click();
                     }
                 }
             }
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        selectSourceAndDestination("pune","source");
        selectSourceAndDestination("mumbai","Detstination");

        String selDate = "29";
        String selMonth = "July";
        String selYear = "2022";

        driver.findElement(By.id("datapicker1")).click();

        selectMonth(selMonth);
        selectYear(selYear);

        List<WebElement> dates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calender']//child::today/tr/td"));
        for(WebElement element : dates){
            if (element.getText().equals(selDate)) {
                element.click();
                break;

            }
            Thread.sleep(4000);
            driver.quit();
        }
    }
}

































































