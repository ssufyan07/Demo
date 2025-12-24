package selectClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethod {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("Sufyan");
		
		WebElement sname = driver.findElement(By.xpath("//input[@name='lastname']"));
		sname.sendKeys("Shaikh");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByValue("4");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Mar");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("1997");
		System.out.println(s3.getOptions());
		List<WebElement> monthoption = s3.getOptions();
		
		for (WebElement option : monthoption)
		{
			System.out.println(option);
		}
		
	
		WebElement male = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
		male.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__' ]"));
		email.sendKeys("ssufi@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__' ]"));
		pass.sendKeys("12345678");
					
		List<WebElement> listyear = driver.findElements(By.id("year"));
		
		 for (WebElement webElement : listyear) {		
			 System.out.println(webElement.getText());
		}
		
		 Thread.sleep(3000);
		 driver.quit();		
		
}
}
