package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAccept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(2000);
		driver.quit();
}
}