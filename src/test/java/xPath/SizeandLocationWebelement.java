package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeandLocationWebelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
		Dimension size = search.getSize();
		
		Point position = search.getLocation();
		
		 Point point = search.getRect().getPoint();
		int height = search.getRect().getHeight();
		System.out.println(size);
		System.out.println(position);
		System.out.println(point);
		System.out.println(height);
		
		driver.quit();
}}

