import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompletePractice {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/jon/Desktop/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		 
		WebElement addressInput = driver.findElement(By.id("autocomplete"));
		addressInput.sendKeys("5816 Burnham Ave, Buena Park, CA");
		//Thread.sleep(1000);
		//WebElement queryInfo = driver.findElement(By.id("example");
		// queryInfo.click();
		    
//	    driver.quit();
//		
		
	}

}
