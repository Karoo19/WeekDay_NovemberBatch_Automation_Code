package Practice_Code_automation_Feb_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssignement {

	public WebDriver driver;
	
	@BeforeMethod
	public void opentutorialsninjaWebsite() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialninja.com/demo");
	}
	
	@Test
	public void clickOnMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
		Assert.fail("As per the assignement");
		
	}
	 
	@Test(dependsOnMethods= "clickOnMyAccount", alwaysRun=true)
	public void LoginFunctionality() {
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@Test(dependsOnMethods= {"clickOnMyAccount", "LoginFunctionality"}, alwaysRun=true, invocationCount=5)
	public void logoutFunctionality() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("logout")).click();
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
