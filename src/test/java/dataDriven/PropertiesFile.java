package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = null ;
		//Step \1
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonTestData.properties");
		
		//step2
		Properties pObj = new Properties();
		
		//step3
		
		pObj.load(fis);
		
		//step 4
		String URL = pObj.getProperty("url");
		//WebDriver driver = new ChromeDriver();
		
		
		
		String BROWSER = pObj.getProperty("browser");
		
		if(BROWSER.equals("chrome")) {
			driver = new ChromeDriver();	
		}
		else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(URL);
		
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		String USER = pObj.getProperty("username");
		uname.sendKeys(USER);
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		String PASSWORD = pObj.getProperty("password");
		pass.sendKeys(PASSWORD);
		
	}
}
