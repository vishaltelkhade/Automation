package Popups_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp1 {
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        
        Thread.sleep(2000);
        Alert altr = driver.switchTo().alert();
        System.out.println(altr.getText());
        altr.accept();
       String text= driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
       System.out.println("result after accept the popup :"+text);
        
        
        
        
	}

}
