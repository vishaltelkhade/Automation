package ListBoxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//List Box  Handling By Object Creation

public class ListBox2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		
		WebElement day   = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		WebElement year  = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Thread.sleep(3000);
		
		//1. select element using selectbyVisibleText (string Text)
//		Select select1 = new Select(day);
//	    select1.selectByVisibleText("31");
//		Select select2 = new Select(month);
//		select2.selectByVisibleText("Mar");
//	    Select select3 = new Select(year);
//		select3.selectByVisibleText("1997");
		
		//2 select Byindex
//		
//		Select select4 =new Select(day);
//		select4.selectByIndex(20);
//		Select select5 =new Select(month);
//		select5.selectByIndex(3);
//		Select select6 =new Select(year);
//		select6.selectByIndex(4);
		
		//3. selct by Value ....this method we can use only when in Dom structure value tagname is present.
		
		Select select7 = new Select(day);
		select7.selectByValue("3");
		Select select8 = new Select(month);
		select8.selectByValue("3");
		Select select9 = new Select(year);
		select9.selectByValue("1997");
		
		
		
		
		
		
	}
}
