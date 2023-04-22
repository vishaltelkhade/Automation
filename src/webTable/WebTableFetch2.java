package webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

            // to fetch the all the data from table


public class WebTableFetch2 {
	static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		List<WebElement> col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println(row.size());
		for(int i=0; i<=row.size();i++) {
			System.out.println(row.get(i).getText());
		}
		System.out.println(col.size());
		for(int i=0; i<=col.size();i++) {
			System.out.println(row.get(i).getText());
	}
}
}
	
