package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuite {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	String title=driver.getTitle();
	System.out.println(title);
	Thread.sleep(4000);
	driver.get("http://demo.automationtesting.in/Windows.html");
	
	
	
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();  //  "//button[@class=\"btn btn-info\" this is nothing 
	                                                     // but xpath of the "click" button
	                                                     // click() this method is used  to click the method . 
	Thread.sleep(4000);
	driver.close();           //close method close the previous opened tab or page .
	Thread.sleep(4000);
	driver.quit();             //quit method is slightly different that close ...thismethod close all the opened tab

	
	

	}

}
