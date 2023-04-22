package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//when more than one element showing by the one xpathexpression then only we can use Xpath by Index
//syntax xpath by index: (xpath expression)[index number]

//xpath expression will be anything here it is depends on DOM structure for example in this program
//xpath expression is Xpath by text : (//a[text()=\"Best Sellers\"])[1] 
//in this program we can also find the element by attribute name here xpath expression is by attribute: (//a[@class=\"nav-a  \"])[5]


public class XpathByIndex {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//a[text()=\"Best Sellers\"])[1]")).click();
	driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[5]")).click();
	
}
}
