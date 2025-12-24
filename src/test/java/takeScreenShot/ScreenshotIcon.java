package takeScreenShot;


import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotIcon {
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		List<WebElement> icons = driver.findElements(By.xpath("//div[@class='YBLJE4']"));
        //System.out.println(icons);
		
		 for (WebElement icon : icons) {
			
			File temp =icon.getScreenshotAs(OutputType.FILE);
			String iconname = icon.getText();
			File permanent = new File("./screenShots/"+iconname+".png");
			FileHandler.copy(temp, permanent);
			
		}
}
}
