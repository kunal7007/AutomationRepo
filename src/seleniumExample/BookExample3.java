package seleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.IOException;
import java.time.Duration;
import java.time.Month;
import java.time.Year;
import java.util.List;

public class BookExample3 {
    public static WebDriver driver;

    public static void selectSourceAndDestination(String city, String sourceOrDestination) {
        List<WebElement> listofCities = null;
        if (sourceOrDestination.equals("source")) {
            driver.findElement(By.id("source")).sendKeys("Kolkata");
            listofCities = driver.findElements(By.xpath("//ul[@id='ui-id-1']//child::li"));
        } else if (sourceOrDestination.equals("destination")) {
            driver.findElement(By.id("destination")).sendKeys("Pune");
            listofCities = driver.findElements(By.xpath("//ul[@id='ui-id-2']//child::li"));
        } else {
            System.out.println("Please select the Proper source & destination");
        }
        for (WebElement element : listofCities) {
            if (element.equals(city)) {
                element.click();
                break;
            }
        }

    }

    public static void selectMonth(String Month){
        List<WebElement>listofMonth = driver.findElements(By.xpath("//span[@class='ui-datepicker-month']"));
        for(WebElement element:listofMonth){
            if ((element.getText().equals("month"))){
                element.click();
            }
        }
        }
    public static void selectYear(String Year){
        List<WebElement>listofYear = driver.findElements(By.xpath("//span[@class='ui-datepicker-year']"));
        for(WebElement element:listofYear){
            if ((element.getText().equals("Year"))){
                element.click();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/kraut/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.abhibus.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        selectSourceAndDestination("Pune", "source");
        selectSourceAndDestination("Mumbai", "destination");


        String selDate = "29";
        String selMonth = "August";
        String selYear = "2022";

        driver.findElement(By.id("datepicker1")).click();
        selectMonth(selMonth);
        selectYear(selYear);

        List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::tbody/tr/td"));
        for (WebElement element :dates){
            if (element.getText().equals(selDate)){
                element.click();
                break;
            }
        }

        String selDate2 = "15";
        String selMonth2 = "September";
        String selYear2 = "2022";

        driver.findElement(By.id("datepicker2")).click();
        selectMonth(selMonth2);
        selectYear(selYear2);

        List<WebElement>date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::tbody/tr/td"));
        for (WebElement element :date){
            if (element.getText().equals(selDate2)){
                element.click();
                break;
            }
        }
        Thread.sleep(3000);
        driver.quit();
    }
}


