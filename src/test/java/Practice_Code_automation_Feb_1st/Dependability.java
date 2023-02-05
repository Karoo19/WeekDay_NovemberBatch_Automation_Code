package Practice_Code_automation_Feb_1st;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependability {

	

	@Test
	public void logic1() {
		Assert.fail("deliberality failing my test case");
		
	}
	
	@Test(dependsOnMethods="logic1", alwaysRun= true)
	public void logic2() {
		
	}
	
	@Test(dependsOnMethods= {"logic1", "logic2"})
	public void logic3() {
		
	}
}
