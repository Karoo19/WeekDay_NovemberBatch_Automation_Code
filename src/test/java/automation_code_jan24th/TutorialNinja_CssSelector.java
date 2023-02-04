package automation_code_jan24th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialNinja_CssSelector {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Hello123");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("world123");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Helloworld223366@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("223344556677");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("223344556677");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("223344556677");
		driver.findElement(By.xpath("(//input[@value='0'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Helloworld223366@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("223344556677");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).sendKeys();
		driver.findElement(By.linkText("Continue")).click();
		
		//Validation for account creation
		
		WebElement proofofAccountcreation= driver
		
		
		
		
		
		
		
		
		

	}

}
