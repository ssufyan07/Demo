package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRegister {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com");
	
	WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
	register.click();
	
	WebElement gen = driver.findElement(By.xpath("//label[text()='Male']"));
	gen.click();
	
	WebElement firstname = driver.findElement(By.id("FirstName"));
	firstname.sendKeys("Sufi");
	
	WebElement lastname = driver.findElement(By.id("LastName"));
	lastname.sendKeys("Shaikh");
	
	WebElement email = driver.findElement(By.id("Email"));
	email.sendKeys("sufiyans@gmail.com");
	
	WebElement pass = driver.findElement(By.name("Password"));
	pass.sendKeys("123456789");
	
	WebElement confirmpass = driver.findElement(By.xpath("//input[@name ='ConfirmPassword']"));
	confirmpass.sendKeys("123456789");
	
	WebElement reg = driver.findElement(By.id("register-button"));
	reg.click();
	
	
}
}
