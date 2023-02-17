package usesCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClic {

	public static void main(String[] args) {
		// Chemin Chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//delete cookies
		driver.manage().deleteAllCookies();
		// Maximise Fenetre
		driver.manage().window().maximize();
		// Implicity Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// ouvrir URL
		driver.navigate().to("https://demoqa.com/buttons");
		// Identification Elements
		WebElement doubleClic;
		doubleClic=driver.findElement(By.id("doubleClickBtn"));
		//Instanciation classe Action
		Actions action = new Actions(driver);
		// double click bouton
		action.doubleClick(doubleClic).perform();
		//Verification  doubleClickMessage
		String message =driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals("You have done a double click",message);
		driver.close();
		
		

	}

}
