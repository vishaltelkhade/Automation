package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooAll_locaters {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.yahoo.com/");
	Thread.sleep(4000);
	
	//1 xpath
	
//	driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("vishal12@yahoo.com");
//	Thread.sleep(4000);
//  driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    
    //2 Id
    
//    driver.findElement(By.id("login-username")).sendKeys("vishal122yahoo.com");
//    Thread.sleep(3000);
//    driver.findElement(By.id("login-signin")).click();
	
	//3 Name
	
//	driver.findElement(By.name("username")).sendKeys("waman12@yahoo.com");
//	Thread.sleep(4000);
//	driver.findElement(By.name("signin")).click();
	
	//4 CSS

//	driver.findElement(By.cssSelector("#login-username")).sendKeys("kunal12@yahoo.com");
//	Thread.sleep(4000);
//	driver.findElement(By.cssSelector("#login-signin")).click();
//	driver.findElement(By.cssSelector("input.pure-button.puree-button-primary.challenge-button")).click();
	
	//5 ClassName
	
//	driver.findElement(By.className("phone-no")).sendKeys("samay12@yahoo.com");
//	Thread.sleep(4000);
//	driver.findElement(By.className("pure-button")).click();
	
	//6 LinkText 
	
//	driver.findElement(By.linkText("Forgot username?")).click();
//	Thread.sleep(4000);

	
	//7 PartialLinkText
	Thread.sleep(4000);
	driver.findElement(By.partialLinkText("Forgot")).click();
	
	//8 TagName -is not much in use it is very rarely use
	
     //	driver.findElement(By.tagName("input")).sendKeys("vishal");
     //	driver.findElement(By.tagName("textarea")).sendKeys("bhsbgasg");
     //	driver.findElement(By.tagName("input")).sendKeys("vgygff");
	
	
}
}
