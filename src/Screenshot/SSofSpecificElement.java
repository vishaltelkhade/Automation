package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SSofSpecificElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        Thread.sleep(2000);
       WebElement ss = driver.findElement(By.xpath("//h1[@class=\"image-text main-header-family\"]"));
       File source = ((TakesScreenshot)ss).getScreenshotAs(OutputType.FILE);
       String Random = RandomString.make(4);
       String Filename = "redbusFRONT";
      
       // एकच folder asel tevhach he (.\\ ) use karach .
       
       File Dest = new File(".\\"+Filename+" "+Random+" .jpg");
       FileHandler.copy(source, Dest);
       driver.quit();
       
	}

	
}

