package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		
		  //WebElement searchButton = driver.findElement(By.id("small-searchterms"));
		
		 // searchButton.sendKeys("Mobile");
		
		WebElement registerBtn = driver.findElement(By.linkText("Register"));
		registerBtn.click();
		
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.sendKeys("Sufyan");
		
		WebElement secondname = driver.findElement(By.id("LastName"));
		secondname.sendKeys("Shaikh");
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("ssufi@gmail.com");
		
		//Thread.sleep(2000);
		
		//WebElement cartbtn = driver.findElement(By.partialLinkText("cart"));
		//cartbtn.click();
		
	//	WebElement searchName = driver.findElement(By.className("search-box-text ui-autocomplete-input"));

	//	searchName.sendKeys("Laptop");
		
	}

}
