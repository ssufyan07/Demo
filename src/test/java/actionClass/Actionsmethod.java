package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsmethod {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		
		Actions acc = new Actions(driver);
			
		WebElement click = driver.findElement(By.id("clickable"));	
		acc.doubleClick(click).perform();   // action performed double click
		//acc.contextClick(click).perform();
		
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		acc.dragAndDrop(drag, drop).perform(); // action performed drag and drop 
		
		Thread.sleep(2000);
		WebElement hover = driver.findElement(By.id("hover"));
		acc.moveToElement(hover).perform(); // action performed cursor to center of webElement 
	
		
		Thread.sleep(3000);
		driver.quit();
		
}
}
