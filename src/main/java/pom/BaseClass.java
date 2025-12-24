package pom;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver;
	
	
	@BeforeSuite
	public void BeforeSuite1() {
		Reporter.log("Connecting to DataBase 1",true);
	}
	
	@BeforeClass
	public void BeforeClass1() {
		 driver = new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void BeforeMethod1() {
		Reporter.log("Login 1",true);
	}
	
	@AfterMethod
	public void AfterMethod1() {
		Reporter.log("Logout 1",true);
	}
	

	@AfterClass
	public void AfterClass1() {
		
		driver.quit();
		
	}
	
	@AfterSuite
	public void AfterSuite1() {
		Reporter.log("close connectivity of DataBase 1",true);
	}
}
