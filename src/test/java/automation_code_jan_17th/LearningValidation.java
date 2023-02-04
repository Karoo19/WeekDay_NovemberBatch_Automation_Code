package automation_code_jan_17th;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningValidation {
	// getTitle(); this give a title for current page
		//getcurrentUrl(); this give URL
		//getpageSource();https://mail.rediff.com/cgi-bin/login.cgi

	public static void main(String[] args) throws InterruptedException {
		
		// getTitle(); this give a title for current page
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		System.out.println("Title of this page is: "+driver.getTitle());
		System.out.println("current url of this page : "+ driver.getCurrentUrl());
		driver.findElement(By.className("signin")).click();
		System.out.println("Title of this page is :  "+ driver.getTitle());
		System.out.println("current url of this page is :"+ driver.getCurrentUrl());
		
		System.out.println("Title of this oage is : "+driver.getTitle());
		System.out.println("current url of this page : "+ driver.getCurrentUrl());
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(5000);
		System.out.println("Title of this page is :  "+ driver.getTitle());
		System.out.println("current url of this page is :"+ driver.getCurrentUrl());
		
		driver.findElement(By.className("rd_logout")).click();
		
		Thread.sleep(3000);
		WebElement confirmationMessage = driver.findElement(By.xpath("//a[@class='rd_logout']" ));
		System.out.println(confirmationMessage.isDisplayed());
		System.out.println("Title of this page is: "+driver.getTitle());
		System.out.println("current url of this page is "+ driver.getCurrentUrl());
		
		
		

	}

}
