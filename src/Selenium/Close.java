package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/"); //this method is used to open the url or web application from the  chrome browser
	
	Thread.sleep(4000);
	
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(4000); //it is java method it is used to hold the output for particular time of period .usually we pass the argument 
	                    //in that method as millisecond like 1000 millisec = 1sec.
	driver.close();     //this method used to close the current window method present at browser
	
}
}
