package automation_code_jan_18th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Rediff {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		driver.findElement(By.xpath("//a[@class= 'signin']")).click();
		driver.findElement(By.xpath("//input[@ID='login1' and @name='login']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password' and@name='passwd']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();

	}

}
