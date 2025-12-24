package testNG;

import org.testng.annotations.Test;

public class DependsONMeethod {

	@Test
	public void createAccount() {
		System.out.println("createAccount");
	}
	
	@Test (dependsOnMethods = "createAccount")
	public void editAccount() {
		
		System.out.println("editAccount");
	}
	@Test (dependsOnMethods = "createAccount")
	public void deleteAccount() {
		
		System.out.println("deleteAccount");
	}
}
