package multipleLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/"); 
		Thread.sleep(2000);
		// TO RETRIVE THE HYPERLINKS ON THE WEBPAGE
		List<WebElement> links = driver.findElements(By.tagName("a"));
        // TO KNOW THE NUMBER OF BROKEN LINKS ON THE WEBPAGE
		int brokenlinks = 0;
		// TO RETRIVE THE ACTUAL LINK USING ATTRIBUTE NAME 
		for(WebElement url:links) {
			String Actualurl = url.getAttribute("href");
		// TO VALIDATE THE THE ATTRIBUTE VALUE IS NULL OR EMPTY
			if(Actualurl==null || Actualurl.isEmpty()) {
				System.out.println("This is empty url");
				continue;
			}
		// TO ACHIEVE THE RESPONSE CODE, CREATE CONNECTION AND OPEN THE CONNECTION 
			URL link = new URL(Actualurl);
			HttpURLConnection httpcode=(HttpURLConnection)link.openConnection();
		// TO CONNECT TO THE CONNECTION BETWEEN THE SERVER AND HITED URL
			httpcode.connect();
			
	    // TO VALIDATE THE THE URL IS BROKEN OR NOT
			if(httpcode.getResponseCode()>=400) {
				System.out.println(httpcode.getResponseCode()+" "+Actualurl+" "+"------>"+"is a broken link ");
				brokenlinks++;
			}
			else {
				System.out.println(httpcode.getResponseCode()+" "+Actualurl+" "+"------>"+"is valid");
			}
		}
		 //TO KNOW THE NUMBER OF BROKEN LINKS ON THE WEBPAGE
		 System.out.println("no of broken links on the webpage is :"+brokenlinks);
		 driver.close();
	}

	
}
