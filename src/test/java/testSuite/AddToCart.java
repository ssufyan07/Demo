package testSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCart {
	
	@Test (priority = 2, dependsOnMethods = "login")
	public void addToCart() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com/build-your-cheap-own-computer");
 
		WebElement cartbtn = driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']"));
		cartbtn.click();
		

	}

}
