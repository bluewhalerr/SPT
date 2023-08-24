package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class ActionsDemo {

	public static void ActionsDemo() throws AWTException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// 3)Navigate to FB
		driver.get("https://www.amazon.in/");
		WebElement bestSeller = driver.findElement(By.xpath("//a[contains(text(),\"Best Sellers\")]"));
		
		Actions a = new Actions(driver);
		//Right click the element
		a.contextClick(bestSeller).build().perform();
		
		//Using Keyboard Keys
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) throws AWTException {
		ActionsDemo();
	}
}
