package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement sourse = driver.findElement(By.xpath("//a[contains(text(),' 5000 ') and @class=\"button button-orange\"]"));
        WebElement target = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        Actions act = new Actions(driver);
       // act.clickAndHold(sourse).moveToElement(target).release().build().perform();
       // INSTEAD OF THIS THERE IS SHORCUT MENTHOD
        
        act.dragAndDrop(sourse, target).build().perform();
      
     
	}

}
