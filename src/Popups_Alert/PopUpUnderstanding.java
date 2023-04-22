package Popups_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpUnderstanding {
    public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//input[@class=\"signinbtn\"]")).click();
       
        Alert alt = driver.switchTo().alert();  // Alert is an interface not a class.
        System.out.println(alt.getText());
        Thread.sleep(2000);
       
        alt.accept();        // This is one of method to to accept the popup or alert
     
        //alt.dismiss();       // This is one of method to to close the popup or alert
        
        
	}

}
