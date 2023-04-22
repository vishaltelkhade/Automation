package actionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo");
		Actions act = new Actions(driver);
		WebElement RightClick = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		act.contextClick(RightClick).build().perform();
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		Alert Alt = driver.switchTo().alert();
		System.out.println(Alt.getText());
		Alt.accept();

	}

}
