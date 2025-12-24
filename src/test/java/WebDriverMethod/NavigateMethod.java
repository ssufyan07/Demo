package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
	
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		
	}

}
