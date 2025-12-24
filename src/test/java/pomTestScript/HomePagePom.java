package pomTestScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.HomePage;
import pom.RegisterPage;

public class HomePagePom {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Saba Shaikh\\Desktop\\RegisterTestData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(0);
		Cell cell = row.getCell(1);
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		pom.HomePage hp = new HomePage(driver);
		hp.getRegisterLink().click();
		
	    pom.RegisterPage rp = new RegisterPage(driver);
	    String firstname = sh.getRow(0).getCell(3).getStringCellValue();
	    rp.getFirstname().sendKeys(firstname);
		
	}

}
