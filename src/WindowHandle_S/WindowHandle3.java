package WindowHandle_S;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();

		Thread.sleep(3000);

		Set<String> ID = driver.getWindowHandles();

		Iterator<String> it = ID.iterator();
		String PWindow = it.next();
		String CWindow = it.next();

		System.out.println("Parent Window :"+PWindow);
		System.out.println("Child Window :"+CWindow);

		driver.switchTo().window(PWindow);
		Thread.sleep(2000);
		System.out.println("PWindow title :"+driver.getTitle());

		driver.switchTo().window(CWindow);
		Thread.sleep(3000);
		System.out.println("CWindow Tilte :"+driver.getTitle());

		Thread.sleep(3000);
		driver.findElement(By.id("linkadd")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("Form_getForm_Name")).sendKeys("Vishal");
		Thread.sleep(3000);

		driver.switchTo().window(PWindow); 
		Thread.sleep(5000);
		System.out.println("Title of Parent window again For YOU :"+driver.getTitle());

		//driver.close(); // IT CLOSE THE OPENEND WINDOW OR CURRENT WINDOW
		driver.quit(); // IT CLOSE ALL THE THE WINDOW


	}

}
