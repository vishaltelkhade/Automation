package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  //defination of Xpath: Xpath is nothing but to find the any element on the webpage or web application using  webpage html DOM structure .
  // DOM:Data Object Module

  //XPath: 1) XPath by attribute name.
  // in this program we used XPath by attribute name
  // syntax of XPath by attribute name :                 //tagname[@attribute name= "attribute value"] 
  //here we use Attribute name : 'id'  //input[@id=\"email\"]
  //we can find Xpath by various attribute name like : type, class, name, id,  
   
  

public class XpathByAttribute2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("mayur@123");
	driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("abcd");
	driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	

}
}
