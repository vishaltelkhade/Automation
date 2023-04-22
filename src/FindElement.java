import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// THIS PROGRAM IS ONLY FOR DIFFERENCE BETWEEN findElement and findElements
//                                                  
                                                    

public class FindElement {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vtelk\\OneDrive\\Desktop\\installer\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/");	
//        String Text = driver.findElement(By.xpath("//a[@class=\"nav-a  \"]")).getText();
//        System.out.println(Text);
        
        List<WebElement> link = driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
        System.out.println(link.size());
        for(WebElement ELe: link) {
        	System.out.println(ELe.getText());
        }
        
        }

	

}
