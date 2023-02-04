package testNG_automation_code_feb_1st_2023;

import org.testng.annotations.Test;

public class Dependability {
	
	
	@Test
	public void logic1() {
		
	}
	
	@Test (dependsOnMethods= "logic1")
	public void logic2() {
		
	}
	

	@Test (dependsOnMethods= {"logic1", logic2})
	public void logic3() {
		
	}

}
