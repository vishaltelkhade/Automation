package multipleLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/"); 
		Thread.sleep(2000);
		driver.findElement(By.linkText("Fashion")).click();
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		System.out.println("no of links present on amazon page :"+Links.size()); //TO KNOW TOTAL NO OF LINKS
	
		for(int i=0; i<=Links.size(); i++) {        // TO KNOW LINKS NAME ON THE WEBPAGE
			System.out.println(Links.get(i).getText());
		}
		 
        for(int i=0; i<=Links.size(); i++) {  // TO PRINT ALL THE LINKS PRESENT ON THE WEBPAGE
        	System.out.println(Links.get(i).getAttribute("href"));
        	
        	// OR USING ADVANCE FOR LOOP
        	
        }
        for(WebElement link:Links) {   // TO PRINT ALL THE LINKS PRESENT ON THE WEBPAGE
        	System.out.println(link.getAttribute("href"));
        }
	}

}
