package automation_code_jan_17th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial_Ninja_test {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		
		WebElement chekBox = driver.findElement(By.id("input-firstname"));
		
		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		
		if (checkBox.isEnabled() && checkBox.isDisplayed() && checkBox.isSelected())
		{
			driver.findElement(By.id("input-firstname"));
		}
		}
	

	}


