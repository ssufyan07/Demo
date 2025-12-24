package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopperstack {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://shoppersstack.com/products_page/57");
		
		 WebElement chck = driver.findElement(By.id("Check Delivery")); 
		 chck.sendKeys("600412");
		 
		 
		WebElement submit = driver.findElement(By.id("Check"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		
		

		
		//WebElement dot = driver.findElement(By.xpath("//li[@value='0']"));
		//dot.click();
		
		//WebElement btn = driver.findElement(By.xpath("//button[text()='shop products']"));
		//btn.click();
		
	
		
		
		driver.quit();
}
}
