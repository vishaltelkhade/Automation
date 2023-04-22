package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class ListBox {
	
	
	//THIS IS NORMAL WAY TO HANDLE LIST BOX 
	//BUT WE AVOID THIS METHOD BECAUSE IT IS SO DIFFICULT TO HANDLE DIFFERNT INFORMATION AT DIFFERNT TIME SO WE USE LIST BOX HANDLING
	//IF I WANT DIFFERNT DATE VALIDATION SO IHAVE TO WRITE THIS CODE AGIAIN AND ALSO I HAVE TO FIND EVERY DATE ELEMENT BY XPATH WHIS IS PRACTICALLY
	//SO INCOVINIENT SO WE USE LIST BOX HANDLING IN NEXT PROGRAM

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/"); //this method is used to open the url or web application from the  chrome browser
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("vishal");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("telkhade");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("vishal@gmail.com");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("vishal@gmail.com");
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id=\"day\"]")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value=\"4\" and contains(text(),'4')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@title=\"Day\"]")).click();
		
		driver.findElement(By.xpath("//select[@name=\"birthday_month\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"3\" and contains(text(),'Mar')]")).click();
		
		driver.findElement(By.xpath("//select[@name=\"birthday_year\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"2016\"]")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"radio\" and @name=\"sex\"])[1]")).click();
		
	}

}
