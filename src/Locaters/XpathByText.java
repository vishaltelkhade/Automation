package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {
	
	//syntax of xpath by text: //tagname[text()="text value"]
	//xpath by text is used when there is no attribute name and attribute value is present only text is present then only we can use xpath by text

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);

	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("vishal123");
	driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("12345vt");
	
	driver.findElement(By.xpath("//button[text()=\"Log In\"]")).click();  //this is xpath by text:     
		

	}

}
