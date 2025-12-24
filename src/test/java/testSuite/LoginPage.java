package testSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {

	@Test (priority = 1, dependsOnMethods = "reg")
	public void login() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com");
		
		
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		
		Thread.sleep(2000);
		WebElement logemail = driver.findElement(By.id("Email"));
		logemail.sendKeys("Sk21000@gmail.com");
		
		Thread.sleep(1000);
		WebElement logpass = driver.findElement(By.id("Password"));
		logpass.sendKeys("123456789");
		
		Thread.sleep(2000);
		WebElement loginbtn = driver.findElement(By.xpath("//input [@value= 'Log in']"));
		loginbtn.click();
	}
}
