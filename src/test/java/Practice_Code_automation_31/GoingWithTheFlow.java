package Practice_Code_automation_31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoingWithTheFlow {

	
	public WebDriver driver;
	
	@BeforeMethod
	public void openRediff() {
		driver = new ChromeDriver();
		driver.get("https://rediff.com");
	}
	
	@Test
	public void clickOnSignInLink() {
		driver.findElement(By.className("signin")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
