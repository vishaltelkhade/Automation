package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    //syntax of xpath by contains: //tagname[contains(text(),'text value')]
    //OR other way syntax: //tagname[contains(@Attribute,'value')]

	//xpath by contains is used when there is no attribute name and attribute value is present only long text is present in which there is no 
    //any repeated word present then only we can use xpath by contains

    //the difference between xpath by text and xpath by contains is if there is big text value or long text value if we got any one of word which is not reapeted
    //we can use xpath by text


    //for example xpath by contains xpath is "//button[contains(text(),'Log In')]" but if we only "log" still it gives correct result.
   

public class XpathBycontains {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);

driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("vishal123");
driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("12345vt");
driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click(); //this is Xpath by contains


driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("dsgygesg"); //this is second way of doing
}
}
