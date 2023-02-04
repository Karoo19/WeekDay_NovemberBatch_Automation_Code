package Automation_code_jan_11th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FACEBOOK_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sarah");
		driver.findElement(By.name("lastname")).sendKeys("Lamis");
		driver.findElement(By.name("reg_email__")).sendKeys("12312312314");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Selenium@123");
		Thread.sleep(3000);
		Select month_drp=new Select(driver.findElement(By.id("month")));
		month_drp.selectByVisibleText("Jun");
		Select date_drp=new Select(driver.findElement(By.id("day")));
		date_drp.selectByVisibleText("9");
		Select year_drp=new Select(driver.findElement(By.id("year")));
		year_drp.selectByVisibleText("1987");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		
		Thread.sleep(5000);
		

	}

}
