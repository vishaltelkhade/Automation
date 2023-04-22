package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		Thread.sleep(3000);
		WebElement newuser = driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]"));
		Thread.sleep(3000);
		WebElement profile = driver.findElement(By.xpath("//div[contains(text(),'My Profile')]"));
		Thread.sleep(3000);
		WebElement FlipkartZone = driver.findElement(By.xpath(" //div[contains(text(),'Flipkart Plus Zone')]"));
		Thread.sleep(3000);;
		Actions act = new Actions(driver);
		act.moveToElement(login).build().perform();
		Thread.sleep(3000);
		act.moveToElement(newuser).build().perform();
		Thread.sleep(3000);
		act.moveToElement(profile).build().perform();
		Thread.sleep(3000);
		act.moveToElement(FlipkartZone).click().build().perform();
		
	

	}

}
