package WebelementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// isSelected method is use wheather the cheakbox or radio button is selected or not


public class Isselected {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	Thread.sleep(2000);
	boolean b=driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
	System.out.println(b);   //   o/p: false because we didint click on radio button yet.
	driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
	Thread.sleep(2000);
	boolean b1=driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
	Thread.sleep(2000);
	System.out.println(b1);	
}
}
