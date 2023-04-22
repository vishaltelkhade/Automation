package webTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchPerticularIndex {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\manual\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	       
		    WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].scrollIntoView();",element);
		
	    int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
			System.out.println(row);
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
            System.out.println(col);
            
            // RETRIVE ALL THE DATA USING FOR LOOP
            for(int i=2; i<=row; i++) {  //INNER LOOP
            	for(int j=1; j<=col; j++) {
            		// WE CAN NOT PASS THE VARIABLE INSIDE THE XPATH
            		String IndexNocity = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
            	if(IndexNocity.equals("Italy")) {
            		System.out.println("row :"+i +" "+ "col :"+j);
            		break;
            	}
            		
            	}
           
            }
		
		
		
		
     }
}
