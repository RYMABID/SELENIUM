package amazon.com.gestionRoles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreationCompteFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// Implicity
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// ouvrir URL
		driver.get("https://www.facebook.com/");
		// Identification Elements
		WebElement cree, prenom,nomf,mail,mailconf,password,listj,listm,lista,genre,inscrire;
		cree =driver.findElement(By.xpath("(//a[normalize-space()='Créer nouveau compte'])[1]"));
		cree.click();
		prenom =driver.findElement(By.name("firstname"));
		nomf =driver.findElement(By.name("lastname"));
		mail =driver.findElement(By.name("reg_email__"));
		listj  =driver.findElement(By.id("day"));
		listm  =driver.findElement(By.id("month"));
		lista  =driver.findElement(By.id("year"));
		prenom.sendKeys("Test");
		nomf.sendKeys("Me");
		mail.sendKeys("schoolibnarafa@gmail.com");
		mailconf=driver.findElement(By.name("reg_email_confirmation__"));
		mailconf.sendKeys("schoolibnarafa@gmail.com");
		password =driver.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("admin123");
		//declaration class Slect
		Select selectj = new Select(listj);
		selectj.selectByValue("10");
		Select selectm = new Select(listm);
		selectm.selectByValue("1");
		Select selecta = new Select(lista);
		selecta.selectByValue("2002");
		genre =driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
        genre.click();
        inscrire =driver.findElement(By.xpath("//button[@name='websubmit']"));
        inscrire.click();
        driver.close();
		
	}

}
