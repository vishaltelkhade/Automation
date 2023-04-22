package Screenshot;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SS1 {

	/* THIS PROGRAM CAN SAVE ONE SS BECAUSE THE NAME OF THE SS IS SAME AND SO THAT IT CAN NOT STORE MORE THAN ONE ONE TIME WITH SAME NAME
	 WITH THE SAME FOLDER */

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		//Take Screenshot And copy into Object
		
		  driver.get("https://www.facebook.com/");
	      File  source1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      System.out.println(source1);
	      File destination1 = new File("C:\\Users\\vtelk\\OneDrive\\Desktop\\screenshot1.png");
	      FileHandler.copy(source1, destination1);
	      
	}

}
