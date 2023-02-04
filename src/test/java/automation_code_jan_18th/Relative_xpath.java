package automation_code_jan_18th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath {

	//Syntax1: html[@attribute = 'valueoftheattribute']
	//Syntax2: html[attribute1 = 'value' and @attribute2 = 'value']
	//Syntax3:  html[@attribute1 = 'value' or @attribute2 = 'value']
	
	
	
	//Syntax 4: html[text() = 'valueofthrtext']     // this is for link
	//Syntax5:  html[contains@attribute, 'value')]
	//Syntax6:  html[contains(text(), 'valueofthetext')]   this is also used for links
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Bonjour");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Azul");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("azul123@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		

	}

}
