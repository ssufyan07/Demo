package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.youtube.com");
			
			
			String sessionid = driver.getWindowHandle();
			//Thread.sleep(3000);
			
		//driver.get("https://www.facebook.com");
			
			//Thread.sleep(3000);
			
			//driver.close();
			System.out.println(sessionid);
			
			Thread.sleep(3000);
			
			driver.quit();
	}} 
