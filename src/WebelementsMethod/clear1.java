package WebelementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	WebElement mail =driver.findElement(By.xpath("//input[@id=\"email\"]"));
	mail.sendKeys("vishal@gamil.com");
	Thread.sleep(2000);
	mail.clear();
	WebElement pass =driver.findElement(By.xpath("//input[@id=\"pass\"]"));

	pass.sendKeys("gsdugu");
	Thread.sleep(2000);
	pass.clear();
	
	System.out.println("validation completed");
	
	
	
}
}
