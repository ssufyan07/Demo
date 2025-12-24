package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCancel {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");

		driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		Thread.sleep(2000);
		driver.quit();
		
		
}
}