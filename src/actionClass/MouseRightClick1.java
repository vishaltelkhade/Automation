package actionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick1 {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	    Thread.sleep(4000);
	    Actions action = new Actions(driver);
	    WebElement RightClick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	    action.contextClick(RightClick).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/ul/li[1]")).click();
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	    

	}

}
