package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

               

public class ListBox6 {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		
		
		String day = "//select[@id=\"day\"]//option";
		String month = "//select[@id=\"month\"]//option";
		String year ="//select[@id=\"year\"]//option ";
		
		System.out.println("=======================TOTAL DAYS===============================");
		selectdropdown(day, "17"); 
		System.out.println("========================TOTAL MONTH==============================");
		selectdropdown(month, "Mar"); 
		System.out.println("=========================TOTAL YEAR=============================");
		selectdropdown(year, "2015"); 
		
		}
	public static void selectdropdown(String element, String value) {
		List<WebElement> s1 =  driver.findElements(By.xpath(element));
		System.out.println(s1.size());
		for (int i=0; i<s1.size(); i++) {
			System.out.println(s1.get(i).getText());
			if(s1.get(i).getText().equals(value)) {
				s1.get(i).click();
			
			}
		}
	}
}
