package Practice_Code_automation_31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoingWith2 {

	public WebDriver driver;

	@BeforeMethod
	public void openRediff() {
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
	}

	@Test(priority=1)
	public void clickOnSignInLink() throws InterruptedException {
	driver.findElement(By.linkText("create new account")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("firstname")).sendKeys("Python");
		
	}
		
	@Test(priority=2)
	public void clickOnCloseIcon() throws InterruptedException {
		Thread.sleep(3000);
	driver.findElement(By.cssSelector("img._8idr.img")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
