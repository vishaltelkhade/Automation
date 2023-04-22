package Selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://web.whatsapp.com/");
	Thread.sleep(4000);
   
	
	Point p= new Point(300,400);               //setPosition() is the method which is use to move the position of window or we can say
	                                           //to drag the window anywhere with in the open page   
    driver.manage().window().setPosition(p);   //to use setPosition method we have create object of Point class and then we have to pass the co-ordinates in that method.
	
}
}
