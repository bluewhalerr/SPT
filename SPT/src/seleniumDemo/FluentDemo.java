package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentDemo {

	public static void waits() {
	
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		// 3)Navigate to FB
		driver.get("https://facebook.com/");
		
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// 4)Click on the Create Account Btn
		
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		
		
		driver.findElement(By.name("firstname")).sendKeys("Ram");
		
	}
	public static void main(String[] args) {
		waits();
	}
}