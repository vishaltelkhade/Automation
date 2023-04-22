package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox7 {


public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	Thread.sleep(3000);
	
	WebElement day   = driver.findElement(By.id("day"));
	
	WebElement month = driver.findElement(By.id("month"));
	
	WebElement year  = driver.findElement(By.id("year"));
	Thread.sleep(3000);
	
	
	
	// HOW YOU WILL GET SIZE OF DAYS MONTH AND YEAR PRESENT DOM OF FB LOGIN
	
	Select select = new Select(day);
	List<WebElement> ListDAY = select.getOptions();  // IT WILL PRINT ALL THE OPTIONS
	System.out.println("TOTAL DAYS : "+ListDAY.size());
	
	// HOW YOU WILL YOU READ AND PRINT ALL THE ELEMENTS PRESENT IN THE LIST
	for(int i=0 ; i<ListDAY.size() ; i++) {
		String Daysvalue = ListDAY.get(i).getText();
		System.out.println(Daysvalue);
		
	//HOW YOU WIL SELECT A SPECIFIC ELELMENTS FROM DROP DOWN	
		
		if(Daysvalue.equals("15")) {
			ListDAY.get(i).click();
			break;

	}
	
	
	
	
	
		}
}
}  





