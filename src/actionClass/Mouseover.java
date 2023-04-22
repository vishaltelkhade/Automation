package actionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.flipkart.com/");
		    Thread.sleep(6000);
		    driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		    Thread.sleep(4000);
		    WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		    Actions act = new Actions(driver);
		    act.moveToElement(login).build().perform();
		    
		    
		    
		 
		   

	}

}
