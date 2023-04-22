package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Name locator we use when in DOM structure there is Attribute name is as "NAME" then only we can use Name locator.
//Syntax:    //By.name("NameValue"); 
//ex.        driver.findElement(By.name("login")).click();  

//where driver:Rf var 
//findElement():Method
//By: class
//name:method (static)


public class Name {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	driver.findElement(By.name("email")).sendKeys("vishal@122345");
	driver.findElement(By.name("pass")).sendKeys("vishal4567");
	driver.findElement(By.name("login")).click();
}
}
