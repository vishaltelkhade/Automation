package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("vishal@123");
		driver.findElement(By.id("pass")).sendKeys("ghfsugfuesfg");
		
		//up to line no 12 it excute properly but for login button id changes during run time so we use
		
	    //1) DynamicId: button	and Xpath_by_contains cocept
		//driver.findElement(By.xpath("//button[contains(@id,'u_0_d')]")).click();
		
		//2) DynamicId: Starts with
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d_')]")).click();//when starting attribute values remains same like here u_0_d_ same use start with
		
		//3) DynamicId: ends with
		driver.findElement(By.xpath("//button[end-with(@id,'_k1')]")).click(); //when ending's attribute values remains same like here _k1 same use ends with
		
		
		
	}
}
