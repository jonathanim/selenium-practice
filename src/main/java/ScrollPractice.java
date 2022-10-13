import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/jon/Desktop/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://formy-project.herokuapp.com/scroll");
		 driver.manage().window().maximize();
		 		 
		 WebElement name = driver.findElement(By.id("name"));
		 
		 Actions actions = new Actions(driver);
		 
		 actions.moveToElement(name);
		 name.sendKeys("jonathan");
		 
		 WebElement date = driver.findElement(By.id("date"));
		 date.sendKeys("10/10/2022");
		 
		 
//		 driver.quit();
//		 
		 
		
	}

}
