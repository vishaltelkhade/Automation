package ListBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

                                   //NOT GIVING PROPER O/P

public class dynamicListBox9 {
     static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(4000);
		
		
		Thread.sleep(3000);
		String from = "//ul[@class=\"autoFill homeSearch\"]//li";
		String dest = "//ul[@class=\"autoFill homeSearch\"]//li";
		redbus(from, "Wakad,Pune");
		redbus(dest, "Anjangaon,Amravati");

	}
	public static void redbus(String start, String end) {
		List<WebElement> s1 = driver.findElements(By.xpath(start));
		//List<WebElement> s2 = driver.findElements(By.xpath(end));
		System.out.println(s1.size());
		for(int i=0 ; i<s1.size(); i++) {
			System.out.println(s1.get(i).getText());
			if(s1.get(i).getText().equals(end)) {
				s1.get(i).click();
			}
		}
	}
	public static void redbus1(String start, String end) {
		List<WebElement> s1 = driver.findElements(By.xpath(start));
		//List<WebElement> s2 = driver.findElements(By.xpath(end));
		System.out.println(s1.size());
		for(int i=0 ; i<s1.size(); i++) {
			System.out.println(s1.get(i).getText());
			if(s1.get(i).getText().equals(end)) {
				s1.get(i).click();
			}
		}
	}

}
