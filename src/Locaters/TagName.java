package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//if there is no of matches elements are there it takes first one only
//in this program there are so many same tagname as input are there but it takes only first one tagname thats what TagName do.

public class TagName {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("http://demo.automationtesting.in/Register.html");

	driver.findElement(By.tagName("input")).sendKeys("vishal");
	driver.findElement(By.tagName("textarea")).sendKeys("bhsbgasg");
	driver.findElement(By.tagName("input")).sendKeys("vgygff");
	
}
}
