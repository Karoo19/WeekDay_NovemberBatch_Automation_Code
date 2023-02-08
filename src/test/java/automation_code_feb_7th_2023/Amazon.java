package automation_code_feb_7th_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {
	
public static WebDriver driver;
	
	@BeforeMethod
	public void openwebsite() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
	}

	
	@Test
	public void amazonTest() {
		System.out.println("code for amazon is here");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	}


