import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/jon/Desktop/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://formy-project.herokuapp.com/keypress");

	        WebElement name = driver.findElement(By.id("name"));
	        name.sendKeys("hello world");
	        WebElement button = driver.findElement(By.id("button"));
	        button.click();
	        driver.quit();
		
	}

}


