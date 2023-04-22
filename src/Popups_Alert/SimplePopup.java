package Popups_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
               
// THIS IS THE SIMPLE POPUP WE CAN HANDLE THIS POPUP USING XPATH WITHOUT USING ALERT INTERFACE.

public class SimplePopup {
    public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\" and @type=\"text\"]")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("abx");
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
        

	}

}
