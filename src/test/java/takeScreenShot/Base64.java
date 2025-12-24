package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base64 {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		TakesScreenshot tks = (TakesScreenshot)driver;
		String temp = tks.getScreenshotAs(OutputType.BASE64);
		System.out.println(temp);
		
		byte[] decodevalue = java.util.Base64.getDecoder().decode(temp);
		System.out.println(decodevalue);
		
	    Files.write(Paths.get("./screenShots/decode.png"), decodevalue);
		

		
}
}
