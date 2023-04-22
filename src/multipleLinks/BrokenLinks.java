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

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/"); 
		Thread.sleep(2000);
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("total links on the webPage is :"+totalLinks.size());
		
		  int brokenlinks = 0;
		// BY USING href ATTRRIBUTE WE CAN GET THE URL OF REQUIRED LINK
		for(WebElement links :totalLinks) {
			String url = links.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				System.out.println("the url is empty");
				continue;
			}
		
		//  To CONVERT STRING URL INTO ACTUAL URL
		//  CREATE CONNECTION USING URL OBJECT	   
			    URL link = new URL(url);
			    HttpURLConnection httpcode = (HttpURLConnection) link.openConnection(); 
		//  ESTABLISH CONNECTION	   
			    httpcode.connect();
		//  getResponseCode() RETURNS RESPONSE CODE OF THE URL	    
			if(httpcode.getResponseCode()>=400)   {
				System.out.println(httpcode.getResponseCode()+"  "+url+"----->"+"is broken links");
				brokenlinks++;
			}
			else
				System.out.println(httpcode.getResponseCode()+"  "+url+"----->"+"is valid links");
			
		}
		
		System.out.println("no of broken Links :"+brokenlinks);
		

	}

}
