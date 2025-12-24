package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		Thread.sleep(2000);
		WebElement gen = driver.findElement(By.xpath("//label[text()='Male']"));
		gen.click();
		
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.sendKeys("Sufyan");
		
		Thread.sleep(1000);
		WebElement lastname = driver.findElement(By.id("LastName"));
		lastname.sendKeys("Shaikh");
		
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("Sk7000@gmail.com");
		
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.name("Password"));
		pass.sendKeys("123456789");
		
		Thread.sleep(1000);
		WebElement confirmpass = driver.findElement(By.xpath("//input[@name ='ConfirmPassword']"));
		confirmpass.sendKeys("123456789");
		
		Thread.sleep(1000);
		WebElement reg = driver.findElement(By.id("register-button"));
		reg.click();
}
}