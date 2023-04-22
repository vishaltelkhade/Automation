package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nift.ac.in/admission");
	WebElement from = driver.findElement(By.xpath("//select[@id=\"lang-dropdown-select-62a047a811811\"]"));
	//WebElement dest = driver.findElement(By.xpath("//input[@id=\"dest\"]"));
	Select input = new Select(from);
	List<WebElement> Start = input.getOptions();
	System.out.println(Start.size());
	for(int i=0; i<Start.size(); i++) {
		String lang = Start.get(i).getText();
		System.out.println(lang);
	if(lang.equals("मराठी")) {
			Start.get(i).click();
			break;
		}
	}
}

}




  
	
	
	
	




