package Practice_Code_automation_31;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void beforSuite() {
		System.out.println("This is before suite annotations");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before Test annotations");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before Class annotations");
	}
	
	@BeforeMethod
	public void beofreMethod() {
		System.out.println("this is before method annotations");
	}
	
	@Test
	public void testcase1() {
		System.out.println("this is test case");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is after method annotations");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("this is after class annotations");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("this is after test annotations");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("this is after Suite annotations");
	}
}
