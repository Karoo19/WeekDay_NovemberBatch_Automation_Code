package testng_automation_31st;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is before suite annontation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is before method");
	}
	
	@Test
	public void testCase1() {
		System.out.println("this is my case1");
	}
	

	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is after method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("this is after class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("this is after Suite ");
	}
}
