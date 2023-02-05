package Practice_Code_automation_31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleRediffUrls {

public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void openRediff() {
		driver.get("https://rediff.com");
	}
	
	@Test
	public void openRediffCredentials() {
		driver.get("https://flipkart.com");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
