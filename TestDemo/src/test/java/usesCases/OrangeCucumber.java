package usesCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeCucumber {

	WebDriver driver;
	@Given("Ouvrir URL application")
	public void ouvrir_url_application() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	    driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// Implicity wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Saisir login")
	public void saisir_login() {
		WebElement user;
		user=driver.findElement(By.name("username"));
		user.sendKeys("Admin");
	}

	@When("Saisir mot de passe")
	public void saisir_mot_de_passe() {
		WebElement  password;
		password =driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
	}

	@When("Cliquer Bouton")
	public void cliquer_bouton() {
		WebElement bouton;
		bouton =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		bouton.click();
		
	}

	@Then("Ouvrir page acceuil")
	public void ouvrir_page_acceuil() {
		WebElement profil;
		profil = driver.findElement(By.xpath("//div[@id='app']//div//div//header//div//div//ul//li//span//p"));
		String message = profil.getText();
		System.out.println("Profil de : "+message);
		Assert.assertEquals("Nitesh Bhattarai",message);
	}

}
