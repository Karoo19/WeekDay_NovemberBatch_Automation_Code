package Practice_Code_automation_31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWebsites {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.get("https://amazon.com");
		
	}
	
	@Test
	public void openWalmart() {
		driver.get("https://walmart.com");
	}
	
	@Test
	public void openFlipkart() {
		driver.get("https://flipkart.com");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
