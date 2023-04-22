package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// if the value is too big we can use PartialLinkText instead of LinkText

public class PartialLinkText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.partialLinkText("Forgotten")).click(); //here we use forgotten instead of forgotten password
}
}
