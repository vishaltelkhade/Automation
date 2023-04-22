package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//unable to run in face book login and sign up page due to Dynamic Xpath handling concept
//in this program id changes during run time 
//so here we can use xpath by attribute here

public class Id_1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	driver.findElement(By.id("email")).sendKeys("vishal@123");
	driver.findElement(By.id("pass")).sendKeys("ghfsugfuesfg");
	driver.findElement(By.id("u_0_c_2p")).click();
	
	driver.findElement(By.id("u_0_d_3F")).click();
    
	
	//what is dynamic id method handling; if have to find element only  by id we have use ID locator cocept
	//but when we use by.id methodology  during run time the id changes again and again somtimes. so to overcome this problem we use dynamicid concept 
	
	
	
}
}
