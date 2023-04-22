package WebelementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//webelement: it is an interface which contais methods
//1. sendkeys();
//2. click(); 3.clear();



public class clear {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.redbus.in/");
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mumbai");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class=\"selected\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"src\"]")).clear();
	
}
}

