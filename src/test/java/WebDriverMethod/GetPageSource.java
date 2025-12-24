package WebDriverMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetPageSource {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
		
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
	}
}
