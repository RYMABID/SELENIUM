package usesCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClic {

	public static void main(String[] args) {
		// Chemin Chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		// ouverture chrme
		WebDriver driver = new ChromeDriver();
		// Delette Cookies
		driver.manage().deleteAllCookies();
		// Maximase Fenetre
		driver.manage().window().maximize();
		// Implicity Wait
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		//ouverture URl
		driver.navigate().to("https://demoqa.com/buttons");
		// Identification Elements
		WebElement rightbt;
		rightbt = driver.findElement(By.id("rightClickBtn"));
		// Istanciation de la class Action
		Actions action = new Actions(driver);
		action.contextClick(rightbt).perform();
		//Verification
		String message = driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertEquals(message, "You have done a right click");
		System.out.println(message);
		driver.close();
		

	}

}
