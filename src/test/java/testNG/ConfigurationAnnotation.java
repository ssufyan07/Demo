package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {

	@BeforeSuite
	public void BeforeSuite1() {
		Reporter.log("Connecting to DataBase 1",true);
	}
	
	@BeforeClass
	public void BeforeClass1() {
		Reporter.log("Launch the Browser1",true);
	}
	
	@BeforeMethod
	public void BeforeMethod1() {
		Reporter.log("Login 1",true);
	}
	
	@Test 
	public void Test1() {
		Reporter.log("Register Process Completed 1",true);
	}
	

	@Test 
	public void Test2() {
		Reporter.log("Register Process Completed 2",true);
	}
	

	@Test 
	public void Test3() {
		Reporter.log("Register Process Completed 3",true);
	}
	
	@AfterMethod
	public void AfterMethod1() {
		Reporter.log("Logout 1",true);
	}
	

	@AfterClass
	public void AfterClass1() {
		Reporter.log("Close the Browser1",true);
	}
	
	@AfterSuite
	public void AfterSuite1() {
		Reporter.log("close connectivity of DataBase 1",true);
	}
	
}
