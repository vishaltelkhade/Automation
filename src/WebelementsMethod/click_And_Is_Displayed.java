package WebelementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_And_Is_Displayed {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.id("email")).sendKeys("vishal@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.id("pass")).sendKeys("sgdesh");
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	
	boolean b = driver.findElement(By.xpath("//button[@name=\"login\"]")).isDisplayed();
	System.out.println(b);
			
	
}
}
