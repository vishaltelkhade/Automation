package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String Page1=driver.getTitle();
			System.out.println(Page1);
	Thread.sleep(4000);
	driver.navigate().to("https://www.google.com/");//naviagte also the alternate method to get url method which is navigate by "driver.navigate().to("url)"
	driver.manage().window().maximize();
	String Page2=driver.getTitle();
	System.out.println(Page2);
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward(); //navigate is the method used forward ,backward and refresh the page.
	Thread.sleep(4000);
	driver.navigate().refresh();
	driver.close();

}
}
