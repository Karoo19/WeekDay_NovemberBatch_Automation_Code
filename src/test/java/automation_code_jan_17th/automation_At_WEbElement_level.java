package automation_code_jan_17th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation_At_WEbElement_level {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rediff.com/");
		
		WebElement videoslink = driver.findElement(By.className("vdicon"));
		
		System.out.println(videoslink.isDisplayed());
		System.out.println(videoslink.isEnabled());
		System.out.println(videoslink.isSelected());
		
		if(videoslink.isEnabled() && videoslink.isDisplayed());
		{
			videoslink.click();
		}

		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		WebElement chekBox = driver.findElement(By.id("remember"));
		
		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		
		if (checkBox.isEnabled() && checkBox.isDisplayed() && checkBox.isSelected())
		{
			driver.findElement(By.name("proceed"));
		}*/
	}

}
