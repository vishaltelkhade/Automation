package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrent {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(4000);

String URL=driver.getCurrentUrl();
System.out.println(URL);
 String ExpectedResult="https://www.facebook.com/";
  driver.close();
 if(URL.equals(ExpectedResult)) {
	 System.out.println("Correct URL");
 }
 else
	System.out.println("wrong URL");
                                                                                    //hhkakjk_]kKJBN


}
}
