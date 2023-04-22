package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
    
		List <WebElement> dayList = driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
		System.out.println(dayList.size());
		for(int i=0; i<dayList.size(); i++) {
			System.out.println(dayList.get(i).getText());
			if(dayList.get(i).getText().equals("15")) {
				dayList.get(i).click();
				break;
			}
		}
	}

}
