package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightElement {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    hilightned();
}
 public static void hilightned() {
		
	 WebElement eamilBox = driver.findElement(By.id("email"));
	 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	 jsExecutor.executeScript("arguments[0].style.border='20px solid red'", eamilBox);
 }
 
}
