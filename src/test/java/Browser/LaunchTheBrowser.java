package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchTheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		String s = driver.getTitle();
		System.out.println(s);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String pg = driver.getPageSource();
		System.out.println(pg);
	}

}
