package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameWorkWithoutDataDriven {
       // WITHOUT DATA DRIVEN.....WE PASS HARDCORE VALUES HERE
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://kite.zerodha.com/");
        // TO DISABLE CHROME BROWSER NOTIFICATIONS
        ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
        Thread.sleep(2000);
        // ENTER ID
        driver.findElement(By.id("userid")).sendKeys("GP8097");
        Thread.sleep(2000);
        //ENTER PASS
        driver.findElement(By.id("password")).sendKeys("gms@0110");
        Thread.sleep(2000);
        // TO CLICK
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(2000);
        //ENTER PIN
        driver.findElement(By.id("pin")).sendKeys("111000");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Continue ')]")).click();
        Thread.sleep(2000);
        // TO VALIDATE THE ID
        String ExpectedId = "GP8097";
        String ActualId = driver.findElement(By.xpath("//span[text()='GP8097']")).getText();
        if(ActualId.equals(ExpectedId)) {
        	System.out.println("Pass");
        }
        else {
        	System.out.println("fail");
        }
	}

}
