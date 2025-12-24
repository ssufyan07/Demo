package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webE {
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));

		File temp = logo.getScreenshotAs(OutputType.FILE);
		
		File permanent = new File("./screenShots/logo.png");
		
		FileHandler.copy(temp, permanent);
		
		//Thread.sleep(2000);
		//driver.quit();
		
		TakesScreenshot tks = (TakesScreenshot)driver;
		File temp1 = tks.getScreenshotAs(OutputType.FILE);
		File permanent1 = new File("./screenShots/home.png");
		
		FileHandler.copy(temp1, permanent1);
		
}
}
