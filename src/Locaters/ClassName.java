package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.className("inputtext")).sendKeys("cbhascg");
	
	//line no 17 shows InvalidSelectorException because it do not support space in line no 16 there is space you can see here "inputtext _55r1 _6luy"
	//without space it perfectly gives output
	
	//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("cbhascg");
}
}
