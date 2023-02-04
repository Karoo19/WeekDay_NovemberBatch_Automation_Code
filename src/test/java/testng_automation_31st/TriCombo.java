package testng_automation_31st;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo {
	
	@BeforeMethod
	public void start() {
		System.out.println("I am opening the browser");
	}
	
	@Test
	public void testClass1() {
		System.out.println("Selenium code");
	}
	
	@Test
	public void testClass2() {
		System.out.println("Selenium code2");
	}

}
