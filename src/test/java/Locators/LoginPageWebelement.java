package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageWebelement {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		
		WebElement loginpage = driver.findElement(By.linkText("Log in"));
		loginpage.click();
		
		// WebElement emailid = driver.findElement(By.id("Email"));
		 //emailid.sendKeys("ssufi@gmail.com");
		 
		// WebElement paswrd = driver.findElement(By.id("Password"));
		// paswrd.sendKeys("123456789");
		 
		 //WebElement loginbtn = driver.findElement(By.className("login-button"));
		 //loginbtn.click();
		 
		 WebElement login = driver.findElement(By.cssSelector("input[value='Log in']"));
		 login.click();
		 
		 //WebElement search = driver.findElement(By.id("small-searchterms"));
		 //search.sendKeys("Mobile");
		 
		//WebElement error = driver.findElement(By.xpath("//span[starts-with(text(),'Login was unsuccessful.')]"));
		//String msg = error.getText();
		//System.out.println(msg);
		
		WebElement error2 = driver.findElement(By.xpath("//span[ends-with(text(),'account found')]"));
		String msg2 = error2.getText();
		
		System.out.println(msg2);
}
	
}
