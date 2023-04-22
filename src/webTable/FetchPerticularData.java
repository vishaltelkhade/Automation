package webTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchPerticularData {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
        
        // TO RETRIEVE PERTICULAR ELEMENT FROM TABLE
        
        String city = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[2]")).getText();
        System.out.println(city);
        
        String city1 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[5]/td[2]")).getText();
        System.out.println(city1);
        
	}

}
