package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Redbus {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Mumbai");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//li[@class=\"selected\"]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Pune");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//li[@class=\"selected\"]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
	driver.findElement(By.xpath("//td[@class=\"wd day\"and text()='30']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
}
}
