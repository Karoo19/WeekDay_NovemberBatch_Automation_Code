package Automation_code_jan_11th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Hello");
		driver.findElement(By.name("lastname")).sendKeys("python");
		driver.findElement(By.name("reg_email__")).sendKeys("12345678900");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Selenium@123");
		sel=select(driver.findElement(By.xpath("//select[@id='month']")));
		
		
		driver.findElement(By.name("birthday_month")).sendKeys("Jun");
		driver.findElement(By.name("birthday_day")).sendKeys("9");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
		

	}

}
