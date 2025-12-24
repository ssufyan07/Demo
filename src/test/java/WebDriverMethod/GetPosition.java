package WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
		
	driver.get("https://www.shopperstack.com");
	
	//driver.manage().window().minimize();
	
	Thread.sleep(1000);
	
	//driver.manage().window().maximize();


	Point position = driver.manage().window().getPosition();
	int x = driver.manage().window().getPosition().getX();
    int y = driver.manage().window().getPosition().getY();
	System.out.println(position);
	System.out.println(x);
	System.out.println(y);
	
	driver.manage().window().setPosition(new Point(50, 50));  

}
}
