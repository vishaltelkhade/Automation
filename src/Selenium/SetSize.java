package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	Dimension size = new Dimension(200,500); //setSize is the method to adjust the window size of the page to use this method we have to 
	                                         
	driver.manage().window().setSize(size);  // create a object of "Dimension" class and pass the Argument in Pixel size for ex (200,500) like this
	Thread.sleep(4000);
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(4000);
	Dimension size1 = new Dimension(500,200);
	driver.manage().window().setSize(size1);
	
	// to know the standard size of the page is we have to use GetSize method like below
	
	driver.get("https://web.whatsapp.com/");
	driver.manage().window().maximize();
	System.out.println(driver.manage().window().getSize());
	Thread.sleep(4000);
	driver.close();
	
	
	

}
}
