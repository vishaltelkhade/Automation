package WindowHandle_S;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
       
		// getWindowHandles() METHOD IS USED TO STORE THE ALL THE IDs OF WINDOW OPENED IN BROWSER OR ANY SITE 
		
		// RETURN TYPE OF getWindowHandles() METHOD IS Set<String> WHICH IS IMPORT FROM java.util.Set
		
		// TO READ THE DATA FROM THE getWindowHandles() METHOD WE HAVE TO USE Iterator OR for LOOP
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Thread.sleep(3000);
		
		Set<String> ID = driver.getWindowHandles();
		
		// BY USING ITERATOR WE READ THE DATA FROM getWindowHandles() METHOD
		
		Iterator<String> IT = ID.iterator();
		
		String ID1 = IT.next();
		String ID2 = IT.next();
		
		System.out.println("current window ID :"+ID1);
		System.out.println("Next window ID :"+ID2);
		
	    // READ AND PRINT THE DATA USING ArrayList<String>
		
		ArrayList<String> WindowIDs = new ArrayList(ID);
		
		String Parentwind = WindowIDs.get(0);
		String Childwind = WindowIDs.get(1);
		
		System.out.println("parent ID:"+Parentwind);
		System.out.println("child ID :"+ Childwind);
		

	}

}
