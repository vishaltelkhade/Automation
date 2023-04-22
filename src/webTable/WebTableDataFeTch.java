package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDataFeTch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
			System.out.println(row);
			
		List<WebElement> rownum = 	driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
         System.out.println(rownum.size());
	}

}
