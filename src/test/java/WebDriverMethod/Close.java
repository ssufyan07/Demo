package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		
		String title = driver.getTitle();
		
		System.out.println("The Title of Current URL is : "+title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
