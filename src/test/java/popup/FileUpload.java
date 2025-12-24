package popup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.naukri.com/registration/createAccount");
		
		WebElement exp = driver.findElement(By.xpath("//div[@class='textWrap']"));
		exp.click();
		
		WebElement up = driver.findElement(By.id("resumeUpload"));
		up.sendKeys("C:\\Users\\Saba Shaikh\\Downloads\\Sufyan Shaikh-Numeric Function.pdf");
}
}
