package usesCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListeDeroulante {

	public static void main(String[] args) {
		// Chemin Chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		// Ouverture Chrome
		WebDriver driver = new ChromeDriver();
		// Delette Cookies
		driver.manage().deleteAllCookies();
		// Maximise Window
		driver.manage().window().maximize();
		// Implicity Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// ouverture URL
		driver.navigate().to("https://demoqa.com/select-menu");
		// Identification Elements
		WebElement list =driver.findElement(By.id("oldSelectMenu"));
		// appel Class select
		Select selection = new Select(list);
		selection.selectByValue("7");
		String R = list.getText();
		System.out.print(R);
		driver.close();

	}

}
