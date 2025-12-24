package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollaction {

		public static void main(String[] args) throws InterruptedException {
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();	
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://demowebshop.tricentis.com/");
				
				Actions acc = new Actions(driver);
				WebElement youtube = driver.findElement(By.xpath("//a[text()='YouTube']"));
				
				 acc.scrollToElement(youtube).perform();
				 Thread.sleep(2000);
				// acc.click(youtube).perform();
				 
				 
				 acc.scrollByAmount(0, -800).perform();
				 Thread.sleep(2000);
				 driver.quit();
				 
		}			
}
