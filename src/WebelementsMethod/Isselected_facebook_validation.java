package WebelementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected_facebook_validation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
	Thread.sleep(4000);
	if(driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected()==false){
		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
	}
	else{
	System.out.println("radio button is not click");
	}
}
}