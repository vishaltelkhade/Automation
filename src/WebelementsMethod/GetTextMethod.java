package WebelementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(4000);
	String text=driver.findElement(By.xpath("//div[contains (text(),'Log in to Facebook')]")).getText();
	Thread.sleep(4000);
	System.out.println(text);
	String ExpectedResult="Log in to Facebook";
	System.out.println(text.equals(ExpectedResult));
}
}
