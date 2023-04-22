package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameWorkWithDataDriven {
 
	     // DATA DRIVEN FRAMEWORK
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://kite.zerodha.com/");
        // TO DISABLE CHROME BROWSER NOTIFICATIONS
        ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
        Thread.sleep(2000);
        FileInputStream file = new FileInputStream("C:\\Users\\vtelk\\OneDrive\\Desktop\\XlSheeet\\DataDrivenFramework.xlsx");
        String UserdefineId = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(UserdefineId);
        Thread.sleep(2000);
        driver.findElement(By.id("userid")).sendKeys(UserdefineId);
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
        
        String ActualId = driver.findElement(By.xpath("//span[text()='GP8097']")).getText();
        if(ActualId.equals(UserdefineId)) {
        	System.out.println("Pass");
        }
        else {
        	System.out.println("fail");
        }
        
	}

}
