package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//whatapp web ,click on download functionality.

public class XpathByAttribute3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.whatsapp.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//h5[@style=\"color:#FFFFFF;\"]")).click();
}
}
