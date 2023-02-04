package Automation_code_jan_11th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();       //CTRL+SHIFT+O
		driver.manage().window().maximize();      //method chaining
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Rediffmail")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Money")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Business Email")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Videos")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Shopping")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Account")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		

	}

}
