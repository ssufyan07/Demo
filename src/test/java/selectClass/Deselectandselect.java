package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselectandselect {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		
		WebElement multi = driver.findElement(By.xpath("//select[@name='multi']"));
		
		Select s1 = new Select(multi);
		s1.deselectAll();
		
		s1.selectByVisibleText("Eggs");
		s1.selectByVisibleText("Sausages");
		
		Thread.sleep(2000);
		s1.deselectByVisibleText("Eggs");
		s1.selectByVisibleText("Onion gravy");
		
		s1.deselectAll();
}
}



