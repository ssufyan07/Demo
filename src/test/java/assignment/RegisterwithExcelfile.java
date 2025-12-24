package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterwithExcelfile {

	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Saba Shaikh\\Desktop\\RegisterTestData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		Cell cell = row.getCell(1);
	
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String URL = cell.getStringCellValue();
		driver.get(URL);
		
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		Thread.sleep(2000);
		WebElement gen = driver.findElement(By.xpath("//label[text()='Male']"));
		gen.click();
		
		Thread.sleep(1000);
		WebElement firstname = driver.findElement(By.id("FirstName"));
		String fn = sh.getRow(0).getCell(3).getStringCellValue();
		firstname.sendKeys(fn);
		
		
		Thread.sleep(1000);
		WebElement lastname = driver.findElement(By.id("LastName"));
		String ln = sh.getRow(0).getCell(5).getStringCellValue();
		lastname.sendKeys(ln);
		
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("Email"));
		String em = sh.getRow(0).getCell(7).getStringCellValue();
		email.sendKeys(em);
		
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.name("Password"));
		String  ps = sh.getRow(0).getCell(9).getStringCellValue();
		pass.sendKeys(ps);
		
		Thread.sleep(1000);
		WebElement confirmpass = driver.findElement(By.xpath("//input[@name ='ConfirmPassword']"));
		String cp = sh.getRow(0).getCell(11).getStringCellValue();
		confirmpass.sendKeys(cp);
		
		Thread.sleep(1000);
		WebElement reg = driver.findElement(By.id("register-button"));
		reg.click();
}
}
