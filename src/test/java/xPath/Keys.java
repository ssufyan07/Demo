package xPath;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		
		Thread.sleep(3000);
		WebElement searchfield = driver.findElement(By.id("small-searchterms"));
		searchfield.sendKeys(org.openqa.selenium.Keys.SHIFT,"superman");
		
	
		Thread.sleep(2000);
		searchfield.clear();
		
}
}

