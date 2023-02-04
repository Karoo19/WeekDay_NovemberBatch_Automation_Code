package testNG_automation_code_feb_1st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassAssignement1 {

	public WebDriver driver;

	@BeforeMethod
	public void openTutorialNinja() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
	}
	@Test
	public void clickOnMyAccountLink() {
		driver.findElement(By.linkText("My Account")).click();
	}
	@Test
	public void clickOnLoginLink() {
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.id("input-id")).click();
	}
}
