package usesCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// Chemin Chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		// ouverture Chrome
		WebDriver driver = new ChromeDriver();
		//Suppression cookies
		driver.manage().deleteAllCookies();
		// Agrandir 
		driver.manage().window().maximize();
		//implicity
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// ouverture url
		driver.get("https://demoqa.com/droppable");
		// Identification Element
		WebElement Drag = driver.findElement(By.id("draggable"));
		WebElement Drop = driver.findElement(By.id("droppable"));
		// Identification Class Action
		Actions Act = new Actions(driver);
		Act.dragAndDrop(Drag, Drop).perform();
		

	}

}
