package Popups_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup3JS {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alt.getText());
        alt.sendKeys("welcome");
        Thread.sleep(2000);
        alt.accept();
        alt.dismiss();
        
   

	}

}
