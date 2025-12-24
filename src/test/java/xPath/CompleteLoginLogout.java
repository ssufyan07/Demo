package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteLoginLogout {
	
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
		email.sendKeys("Sk1900@gmail.com");
		
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.name("Password"));
		pass.sendKeys("123456789");
		
		Thread.sleep(1000);
		WebElement confirmpass = driver.findElement(By.xpath("//input[@name ='ConfirmPassword']"));
		confirmpass.sendKeys("123456789");
		
		Thread.sleep(1000);
		WebElement reg = driver.findElement(By.id("register-button"));
		reg.click();
		
		Thread.sleep(1000);
		WebElement logout = driver.findElement(By.linkText("Log out"));
		logout.click();
		
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		
		Thread.sleep(2000);
		WebElement logemail = driver.findElement(By.id("Email"));
		logemail.sendKeys("Hk190002@gmail.com");
		
		Thread.sleep(1000);
		WebElement logpass = driver.findElement(By.id("Password"));
		logpass.sendKeys("123456789");
		
		Thread.sleep(2000);
		WebElement loginbtn = driver.findElement(By.xpath("//input [@value= 'Log in']"));
		loginbtn.click();
		
		Thread.sleep(2000);
		 WebElement search = driver.findElement(By.id("small-searchterms"));
		 search.sendKeys("Laptop");
		 
		 WebElement searchclick = driver.findElement(By.xpath("//input[@value ='Search']"));
		 searchclick.click();
		 
		 Thread.sleep(3000);
		 
		 driver.quit();
		 
		 

}
}

