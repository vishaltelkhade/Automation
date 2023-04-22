package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox8 {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://total-qa.com/selenium-webdriver/practise-website/");
		Thread.sleep(2000);
		WebElement From = driver.findElement(By.xpath("//select[@id=\"COUNTRY\"]"));
		
		Thread.sleep(4000);
		//WebElement Dest = driver.findElement(By.id("dest"));
		Select select = new Select(From);
		  List<WebElement> from = select.getOptions();
		  System.out.println(from.size());
		  for(int i=0 ; i<from.size(); i++) {
				String coutryname = from.get(i).getText();
				System.out.println(coutryname);
				if(coutryname.equals("INDIA")) {
						from.get(i).click();
						break;
				}
			}
	}
	

}
