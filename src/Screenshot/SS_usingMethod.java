package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;
// WHEN WE WANT MULTIPLE TIMES SS 0F SAME PAGE THEN WE USE METHOD
public class SS_usingMethod {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");

		takeSS("aaa");
		takeSS("bbKivines");
		driver.quit();
	}
	public static void takeSS(String Filename) throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		File dest = new File(".\\"+Filename+" "+random+".jpg ");
		FileHandler.copy(source,dest);

	}


}
