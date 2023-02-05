package Practice_Code_automation_31;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo {

	
	@BeforeMethod
	public void start() {
		System.out.println("I am opning browser");
		
	}
	
	@Test
	public void testCase1() {
		System.out.println("selenium code");
		
	}
	
	@Test
	public void testCase2() {
		System.out.println("selenium code");
		
	}
	
	@AfterMethod
	public void close() {
		System.out.println("I am closing browser");
		
	}
}
