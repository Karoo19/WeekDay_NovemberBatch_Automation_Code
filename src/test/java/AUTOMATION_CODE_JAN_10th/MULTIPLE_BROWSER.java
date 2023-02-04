package AUTOMATION_CODE_JAN_10th;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MULTIPLE_BROWSER {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		driver.quit();
		
		WebDriver driver1=new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.get("https://www.walmart.com/");
		driver1.quit();

	}

}
