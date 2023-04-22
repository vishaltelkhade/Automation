package Popups_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupUploadFile {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		// WE CAN USE THIS SIMPLE METHOD IF IN DOM STRUCTURE THERE IS type="file" 
		
		// OTHERWISE WE HAVE TO APPROACH IT WITH THE THE THIRD PARTY TOOL THAT IS AUTOIT
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\vtelk\\Downloads\\5_6294092929531118950.pdf");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
        
        

	}

}
