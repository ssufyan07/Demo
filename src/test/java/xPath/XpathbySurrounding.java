package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbySurrounding {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		
		WebElement option = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@value='1']"));
		option.click();
		
		Thread.sleep(2000);
		
		WebElement vote = driver.findElement(By.xpath("//input[@value='Vote']"));
		vote.click();
		
		driver.quit();

}
}
