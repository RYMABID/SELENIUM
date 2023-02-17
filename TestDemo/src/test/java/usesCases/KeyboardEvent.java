package usesCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {

	public static void main(String[] args) {
		// Chemin chrome
				System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
				//open chrome
				WebDriver driver = new ChromeDriver();
				// delete cookies and max
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				// implicity wait
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				// open chrome
				driver.get("https://demoqa.com/text-box");
				//Element
				WebElement champ1,champ2;
				champ1 = driver.findElement(By.id("currentAddress"));
				champ2 = driver.findElement(By.id("permanentAddress"));
				champ1.sendKeys("120 rue de la Marsa");
				// Istanciation de la classe Action
				Actions act = new Actions(driver);
				act.keyDown(champ1, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
				act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
				act.keyDown(champ2, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
				Assert.assertNotNull(champ1.getText(), champ2.getText());
				System.out.println("Ya3tikom Saha");
				driver.close();
				
				

	}

}
