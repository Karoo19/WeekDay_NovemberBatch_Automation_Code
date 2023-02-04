package automation_code_jan_18th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Using_Contains {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("//input[contains(@id, 'input-firstname')]")).sendKeys("karima");
		driver.findElement(By.xpath("//input[contains(@id, 'input-lastname')]")).sendKeys("Bou");
		driver.findElement(By.xpath("//input[contains(@id, 'input-email')]")).sendKeys("karima123@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,  'input-telephone')]")).sendKeys("1234567000");
		driver.findElement(By.xpath("//input[contains(@id,  'input-password')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[contains(@id, 'input-confirm')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();

	}

}
