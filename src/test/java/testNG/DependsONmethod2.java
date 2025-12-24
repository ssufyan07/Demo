package testNG;

import org.testng.annotations.Test;

public class DependsONmethod2 {

	@Test
	public void hdfcAcc() {
		System.out.println("hdfcAcc");
	}
	
	@Test (dependsOnMethods = "hdfcAcc")
	public void hdfceditAccount() {
		
		System.out.println("hdfceditAccount");
	}
	@Test (dependsOnMethods = "hdfcAcc")
	public void hdfcdeleteAccount() {
		
		System.out.println("hdfcdeleteAccount");
	}
}

