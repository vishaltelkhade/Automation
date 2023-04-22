package WebelementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	boolean b = driver.findElement(By.xpath("//input[@id=\"email\"]")).isEnabled();
	Thread.sleep(2000);
	System.out.println(b);
	
	
}
}
