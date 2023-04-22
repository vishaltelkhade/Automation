package WindowHandle_S;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) {
		
		// TO GET AN ID OF A SINGLE OPENED WINDOW FROM THE BROWSER OR ANY SITE WE USE THIS METHOD
		
		// RETURN TYPE OF THIS METHOD IS STRING
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String Id = driver.getWindowHandle();
		
		System.out.println(Id);

	}

}
