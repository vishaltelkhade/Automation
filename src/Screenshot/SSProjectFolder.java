package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SSProjectFolder {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String random = RandomString.make(4);
        String Filename= "Redbus";
        // File Destination = new File("C:\\Users\\vtelk\\Atomation\\src\\Screenshot\\Screenshot"+Filename+" "+random+".jpg");
        
            // .\\ IT REPRESENT THE  CURRENT PROJECT FOLDER DIRECTORY....
            // BOTH LINE NO 23 AND 27 ARE SAME 
       // File Destination = new File(".\\Screenshot1"+Filename+" "+random+".png"); 
        
        File Destination = new File(".\\"+Filename+" "+random+".png"); // IT GIVES SSname WITH FILENAME+RANDOM STRING
        
        FileHandler.copy(source, Destination);
        driver.quit();
	}

}
