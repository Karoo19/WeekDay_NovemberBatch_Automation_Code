package automation_code_jan_18th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTING_XPATH {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("//input[contains(@id, ='input-firstname')]")).sendKeys("testing");
		driver.findElement(By.xpath("//input[contains(@id, ='input-lastname')]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[contains@id, = 'input-email')]")).sendKeys("azul12345@gmail.com");

	}

}
