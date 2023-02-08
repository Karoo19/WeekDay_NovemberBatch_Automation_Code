package automation_code_feb_7th_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_Objects_In_automation {

	public static WebDriver driver;

	public static void main(String[] args) {


		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");




	

}
 
}
