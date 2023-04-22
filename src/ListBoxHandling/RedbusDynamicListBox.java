package ListBoxHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusDynamicListBox {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("src")).sendKeys("pune");
		Thread.sleep(3000);
		
		List<WebElement> city = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
        System.out.println("size :"+city.size());
        for(int i=0; i<=city.size(); i++) {
        	String cityName = city.get(i).getText();
        	if(cityName.equals("Railway Station, Pune")) {
        	city.get(i).click();
        	break;
        	}
        }
	}

}
