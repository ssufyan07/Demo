package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelFiles {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Saba Shaikh\\Desktop\\CommonTestData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		Cell cell = row.getCell(1);
	
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String URL = cell.getStringCellValue();
		driver.get(URL);
		
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		String USERNAME = sh.getRow(0).getCell(3).getStringCellValue();
		uname.sendKeys(USERNAME);
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	    String PASSWORD = sh.getRow(0).getCell(5).getStringCellValue();
		pass.sendKeys(PASSWORD);
		
		WebElement login = driver.findElement(By.xpath("//div[text()='Log in']"));
		login.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
}
}
