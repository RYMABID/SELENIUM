package usesCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autentification {

		public static void main(String[] args) throws InterruptedException {
		// Chemin de chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// Implicity wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement user, password, bouton,profil;
		user=driver.findElement(By.name("username"));
		password =driver.findElement(By.name("password"));
		bouton =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		
		user.sendKeys("Admin");
		password.sendKeys("admin123");
		bouton.click();
		
		profil = driver.findElement(By.xpath("//div[@id='app']//div//div//header//div//div//ul//li//span//p"));
		String message = profil.getText();
		System.out.println("Profil de : "+message);
		Assert.assertEquals("Nitesh Bhattarai",message);
		driver.close();

	}

}
