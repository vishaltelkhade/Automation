package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public static void main(String[] args) throws InterruptedException {
	
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com/");


String title=driver.getTitle(); //GetTitle is a method which is used to fetch  or get the title name .
                                //this method has return type as string. so we have store the return o/p in in String Variable.
System.out.println(title);

Thread.sleep(4000);


driver.close();



}
}
