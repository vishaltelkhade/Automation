package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
		
		Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@id=\"menu_directory_viewDirectory\"]")).click();
	
	Thread.sleep(3000);
		WebElement jobTitle = driver.findElement(By.xpath("//select[@id=\"searchDirectory_job_title\"]"));
		
		int JOBTITLE= 20;
		listbox1(jobTitle,JOBTITLE);
		
		}
	public static void listbox1(WebElement element ,int value ) {
		Select select9 = new Select(element);
			select9.selectByIndex(value);
	}

}
