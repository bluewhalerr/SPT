package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropDemo {

	public static void DragAndDropDemo() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		// 3)Navigate to webpage
		driver.get("https://demoqa.com/droppable");
		
		
		WebElement fromElement = driver.findElement(By.id("draggable"));
		WebElement toElement = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		//Using drag and drop
		//a.dragAndDrop(fromElement, toElement).build().perform();
		//Using Move to Element
		a.clickAndHold(fromElement).build().perform();
		a.moveToElement(toElement).build().perform();
	}
public static void main(String[] args) {
	DragAndDropDemo();
}
}
