package testng_automation_31st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniCode_UsingTestNgum {

	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
	}
	
	@Test (priority = 1)
	public void clickOnSignInLink() {
		driver.findElement(By.className("Signin")).click();
	}
	
	@Test (priority = 2)
	public void clickOnMoneyLink() {
		driver.findElement(By.linkText("Money")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
