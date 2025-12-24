package popup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupHandlesandAvoid {
public static void main(String[] args) throws InterruptedException, IOException {
	
	    ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("--disable-notifications");	
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.easemytrip.com/");

}
}