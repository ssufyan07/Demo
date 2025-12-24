package frame;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameSwitching {

public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Actions ac = new Actions(driver);
		ac.scrollByAmount(0, 100).perform();
		
		driver.switchTo().frame("singleframe");
		WebElement txtbt = driver.findElement(By.xpath("//input[@type='text']"));
		txtbt.sendKeys("sufyan");
		
}
}