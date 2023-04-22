package Popups_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupPermission2 {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		
		//THIS PROGRAM IS FOR TIME PASS DONT READ IT
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver(option);
        Thread.sleep(2000);
        
        driver.get("");
        driver.findElement(By.xpath("//button[@id=\"microphone\"]")).click();
        

	}

	
}
