package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class RandomSS {

	    // TO SAVE SAME SS WITH DIFFERENT NAME IN SAME FOLDER
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String random = RandomString.make(4);
        String Filename= "Facbook";
        File destination = new File("C:\\Users\\vtelk\\OneDrive\\Desktop\\screenshot\\"+Filename+" "+random+".jpg");
        FileHandler.copy(source,destination);
        driver.quit();
	}

}
