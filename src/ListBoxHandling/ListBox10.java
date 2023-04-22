package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox10 {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://twitter.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[text()=\"Sign up with phone or email\"]")).click();
	  Thread.sleep(2000);
	 
	  String day = "//select[@id=\"SELECTOR_4\"]//option";
	  
	 Thread.sleep(2000);
	  String month = "//select[@id=\"SELECTOR_5\"]//option";
	  
	 Thread.sleep(2000);
	  String year = "//select[@id=\"SELECTOR_6\"]//option";
	 
	  dropdown(day, "March");
	  dropdown(month, "1");
	  dropdown(year, "1997");
}
public static void dropdown(String element , String value) {
	List<WebElement> s1 = driver.findElements(By.xpath(element));
	System.out.println(s1.size());
	for(int i=0 ; i<s1.size();i++) {
		System.out.println(s1.get(i).getText());
		if(s1.get(i).getText().equals(value)) {
			s1.get(i).click();
			break;
		}
	}
      	
}
}

