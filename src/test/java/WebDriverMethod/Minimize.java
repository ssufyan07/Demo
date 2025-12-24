package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
			driver.manage().window().fullscreen();
			driver.get("https://www..com");
			
			Thread.sleep(4000);
			
			driver.manage().window().minimize();
			driver.quit();
						
			
}}	

