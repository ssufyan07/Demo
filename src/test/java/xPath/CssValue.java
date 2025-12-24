package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		String color = register.getCssValue("color");
		
		WebElement btn = driver.findElement(By.xpath("//input[@value='Go to cart']"));
		String btnfont  = btn.getCssValue("font");
		
		
		System.out.println(color);
		System.out.println(btnfont);
}
}
