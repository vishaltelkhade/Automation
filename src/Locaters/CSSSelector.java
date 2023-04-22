package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/");
		Thread.sleep(4000);
		
		//1 when id is present
		
//		driver.findElement(By.cssSelector("#username")).sendKeys("vishal1123@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("fsfsfsrshdaddg");
//		driver.findElement(By.cssSelector("#loginBtn")).click();
		
		//2 when id present
//	    driver.findElement(By.cssSelector("input#username")).sendKeys("vishal1123@gmail.com");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("fsfsfsrshdaddg");
//		driver.findElement(By.className("UICheckbox__PrivateCheckboxIconInnerSVG-p67e4e-3")).click();
//    	driver.findElement(By.cssSelector("button#loginBtn")).click();
    	
    	//3 when class is present then by cssSelector
		//add tag name right after tag name add dot "." then remove space from class value and add dot in place of space.
		
	    driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("amitbadhan123@gmail.com");
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-password.m-bottom-3")).sendKeys("sfsdgargtzddfgdf");
		driver.findElement(By.cssSelector("span.UICheckbox__PrivateCheckboxIcon-p67e4e-4.fQGnYw.private-checkbox__dash")).click();
    	
		driver.findElement(By.cssSelector("#loginBtn")).click(); // by id
}
}
