package Popups_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_PopupValidation {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("xyz");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();
        Alert alt = driver.switchTo().alert();
        System.out.println(alt.getText());
        if(alt.getText().equals("Please enter a valid user name")) {
        	System.out.println("Alert Pop up showing Valid message");
        }
        else {
        	System.out.println("invalid massege");
        }
        alt.accept();
      }

}
