package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Computer {

	@Test
	public void cm() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com");
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
