package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(6000);
		WebElement platform = driver.findElement(By.xpath("//a[contains(text(),'Platform') and @class=\"nav-link-hed\"]"));
		WebElement Pmang = driver.findElement(By.xpath("//li[contains(text(),'People Management')]"));
		WebElement Comphansation = driver.findElement(By.xpath("//li[contains(text(),'Compensation')]"));
		Actions Act = new Actions(driver);
		Act.moveToElement(platform).build().perform();
		Thread.sleep(3000);
		Act.moveToElement(Pmang).build().perform();
		Thread.sleep(3000);
		Act.moveToElement(Comphansation).build().perform();
	}

}
