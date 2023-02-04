package testNG_automation_code_feb_1st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassAssignement {

	public WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
	}

	@Test
	public void clickOnMyAccountLink() {
		driver.findElement(By.linkText("My Account")).click();
	}
	
	@Test(dependsOnMethods = "clickOnMyAccountLink")
	public void clickOnWishListLink() {
		driver.findElement(By.linkText("Wish List")).click();
	}
	
	@Test(dependsOnMethods = "clickOnWishListLink")
	public void clickOnShoppingCartLink() {
		driver.findElement(By.linkText("Shopping Cart")).click();
	}
}
