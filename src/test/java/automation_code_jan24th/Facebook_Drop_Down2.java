package automation_code_jan24th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Drop_Down2 {
	
	public static Select select;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		
		//create object select drop down and pass the location in constructor
		//there are 3 methods under select class which are selectbyVisibleText, selectByIndex, selectbyVisibleText
		
		Thread.sleep(3000);
		
		select=new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jun");
		
		select=new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("9");
		
	    select=new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1987");


	}

}
