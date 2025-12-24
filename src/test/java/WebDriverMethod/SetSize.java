package WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
		
	driver.get("https://www.shopperstack.com");
	
	driver.manage().window().minimize();
	
	Thread.sleep(1000);
	
	driver.manage().window().maximize();
	
	System.out.println(driver.manage().window().getSize());
	
	int width = driver.manage().window().getSize().getWidth();
	
	int height = driver.manage().window().getSize().getHeight();
	
	System.out.println(width);
	System.out.println(height);

	driver.manage().window().setSize(new Dimension(500, 1000));		

	}
}

