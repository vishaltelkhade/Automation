package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        
        driver.findElement(By.name("q")).sendKeys("cheese"+Keys.ENTER);
        WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Cheese - Wikipedia')]"));
        new WebDriverWait(driver,Duration.ofSeconds(10))
	    .until(ExpectedConditions.visibilityOf(element));
		element.click();
		
		
      
	}

}
