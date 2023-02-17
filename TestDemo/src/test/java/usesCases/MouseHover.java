package usesCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

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
		driver.get("https://demoqa.com/menu/");
		// Element
		WebElement item2,subitem,subsubitem;
		item2 = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		// Action
		Actions act = new Actions(driver);
		act.moveToElement(item2).perform();
		subitem = driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"));
		act.moveToElement(subitem).perform();
		subsubitem = driver.findElement(By.xpath("//a[normalize-space()='Sub Sub Item 2']"));
		act.moveToElement(subsubitem).perform();
		driver.close();
		

	}

}
