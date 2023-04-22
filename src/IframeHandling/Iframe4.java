package IframeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("welcome");
		Thread.sleep(3000);
		
		// we have to shift focus of webdriver to iframe 
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		Select courseDD = new Select(driver.findElement(By.id("course")));
		courseDD.selectByVisibleText("Java");
		Thread.sleep(3000);
		
		// now the focus of webdriver is on frame1. so to shift the focus the main page we have to use 
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("HEllo world");
		

	}

}
