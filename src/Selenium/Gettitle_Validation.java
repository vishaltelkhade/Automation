package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle_Validation {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	String title=driver.getTitle();
	System.out.println(title);
	Thread.sleep(4000);
	driver.close();
	
	
	
	String ExpectedTitle="Instagram";    //from line no 20 to 26 is just a validation part ,its just basic idea that how we can perform the Automation.
	if(title.equals(ExpectedTitle)) {
		System.out.println("correct title");
	}
	else {
		System.out.println("wrong title");
	}
	
}
}
