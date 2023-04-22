package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	Thread.sleep(3000);
	
	WebElement day   = driver.findElement(By.xpath("//select[@id=\"day\"]"));
	
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	
	WebElement year  = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	Thread.sleep(3000);
	String dob= "31/3/1997";
	String[] date = dob.split("/");
	ListBox(day,date[0]);
	ListBox(month,date[1]);
	ListBox(year,date[2]);

}
public static void ListBox(WebElement element , String value) {
	Select select = new Select(element);
	select.selectByValue(value);
}
}

