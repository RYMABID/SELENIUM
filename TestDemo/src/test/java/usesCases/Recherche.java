package usesCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recherche {

	public static void main(String[] args) throws InterruptedException {
		// chemin de chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		// Open chrome driver
		WebDriver driver =new ChromeDriver();
		// delete cookies
		driver.manage().deleteAllCookies();
		// maximase browser
		driver.manage().window().maximize();
		//open URL Application
		driver.navigate().to("https://www.google.tn/");
		// identification des elements
		WebElement champ;
		champ = driver.findElement(By.name("q"));
		//sleep 5 seconde
		Thread.sleep(5000);
		//bouton = driver.findElement(By.name("btnK"));
		// les actions
		champ.sendKeys("Iphone"+Keys.ENTER);
		//Thread.sleep(2000);
		//bouton = driver.findElement(By.name("btnK"));
		//bouton.click();
		WebElement result;
		result =driver.findElement(By.id("result-stats"));
		String message = result.getText();
		Assert.assertTrue(message.contains("résultats"));
		System.out.println("Test OK");
		
		
	}

}
