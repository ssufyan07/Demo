package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(3000);
		
		
		WebElement close = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
		close.click();
		
		WebElement dep = driver.findElement(By.xpath("//label[@for='departure']"));
		dep.click();
		
		Thread.sleep(3000);
		
        WebElement next = driver.findElement(By.xpath("//span[@tabindex='0' and @aria-label='Next Month'] "));
        next.click();
        
        Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//div[text()='January 2026']/../..//p[text()='14']"));
		date.click();
		
		Thread.sleep(2000);
		 
		WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
		search.click();
		
		driver.quit();
			
	}
}
