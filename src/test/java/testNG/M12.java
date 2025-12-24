package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class M12 {

	@Test (priority = 5)
	public void m1() {
		Reporter.log("Execution of Walk Method", true);
	}
	
	@Test (priority = 4)
	public void m2() {
		Reporter.log("Execution of Run", true);
	}
	
	@Test (priority = 3)
	public void m3() {
		Reporter.log("Execution of Sleep", true);
	}
	
	@Test (priority = 1)
	public void m4() {
		Reporter.log("Execution of Eat", true);
	}
	
	@Test (priority = 2)
	public void m5() {
		Reporter.log("Execution of Play", true);
	}
	
}
