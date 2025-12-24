package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.RegisterPage;

public class RegAndLogin extends BaseClass{
	
	WebDriver driver;
		
		@Test
		public void register() throws InterruptedException{
			
			RegisterPage rp = new RegisterPage(driver);
			rp.Re
			
			HOme
			
			
			register.click();
			Thread.sleep(2000);
			WebElement gen = driver.findElement(By.xpath("//label[text()='Male']"));
			gen.click();
			
			Thread.sleep(1000);
			WebElement firstname = driver.findElement(By.id("FirstName"));
			firstname.sendKeys("Sufiyan");
			
			Thread.sleep(1000);
			WebElement lastname = driver.findElement(By.id("LastName"));
			lastname.sendKeys("Shaikh");
			
			Thread.sleep(1000);
			WebElement email = driver.findElement(By.id("Email"));
			email.sendKeys("Sk1000@gmail.com");
			
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
		
		@Test
		public void search() {
			WebElement clickbtn = driver.findElement(By.partialLinkText("Computers"));
			clickbtn.click();
			
			WebElement desk = driver.findElement(By.partialLinkText("Desktops"));
			desk.click();
			
			WebElement imgclk = driver.findElement(By.xpath("//img[@alt='Picture for category Desktops']"));
			imgclk.click();
			
			WebElement prodctclick = driver.findElement(By.partialLinkText("Build your own cheap computer"));
			prodctclick.click();
			
			WebElement cartbtn = driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']"));
			cartbtn.click();
		}
	}

