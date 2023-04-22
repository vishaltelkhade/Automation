package syncronization;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
	WebElement Fname = driver.findElement(By.name("firstname"));
	WebElement Lname =driver.findElement(By.name("lastname"));
	WebElement Mo_no =driver.findElement(By.name("reg_email__"));
	WebElement Pass =driver.findElement(By.name("reg_passwd__"));
	WebElement Alreadyacc = driver.findElement(By.linkText("Already have an account?"));
	
	     sendkeys(driver, Fname,  3, "vishal");
	     sendkeys(driver, Lname, 5, "telkhade");
	     sendkeys(driver, Mo_no, 10, "8390965600");
	     sendkeys(driver, Pass, 9, "test@123");
	     clickOn(driver, Alreadyacc, 8);
		
		}
	public static void sendkeys(WebDriver driver, WebElement element, int i, String value) {
	    new WebDriverWait(driver,Duration.ofSeconds(i))
	    .until(ExpectedConditions.visibilityOf(element));
	    element.sendKeys(value);
		
	}
	
	public static void clickOn(WebDriver driver, WebElement element, int i) {
		 new WebDriverWait(driver,Duration.ofSeconds(i))
		 .until(ExpectedConditions.elementToBeClickable(element));
		 element.click();
	}

}

