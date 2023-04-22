package IframeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
        Thread.sleep(5000);
       
        // TO SWITCH MAIN PAGE TO IFRAME USE THIS METHOD switchTo().frame("int index")
        driver.switchTo().frame("iframeResult");
        Thread.sleep(2000);
        driver.findElement(By.xpath(" //button[contains(text(),'Click me to display Date and Time')]")).click();
        
        
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id=\"menuButton\"]")).click();
	}

}
