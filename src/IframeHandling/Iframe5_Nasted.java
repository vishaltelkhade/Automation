package IframeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe5_Nasted {

	    // NASTED FRAMES : IFRAME CONTAIN ONTHER IFRAME INTO IT CALLED AS NASTED IFRAME 
	    // ONE HAVING PARENT FRAME AND SAME FRAME CONTAIN ONE OR OR MORE FRAME CALLED AS CHILD FRAMES
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("welcome");
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.id("frm3")));
	    driver.findElement(By.id("name")).sendKeys("frame3");
	    Thread.sleep(3000);	
	    
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Select dropdown = new Select(driver.findElement(By.id("selectnav1")));
		dropdown.selectByVisibleText("YouTube Courses");
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("yes it is parent frame3 for frame1 inside it");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("that is the main page");
		
		}

}
