package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	
	
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id = "FirstName")
	private WebElement firstname;
	
	@FindBy(id = "LastName")
	private WebElement lastname;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement pass;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpassword;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
	

}
