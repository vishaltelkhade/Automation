package Popups_Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupPermission {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver(option);
        Thread.sleep(2000);
        driver.get("https://www.hdfcbank.com/");

	}

}
