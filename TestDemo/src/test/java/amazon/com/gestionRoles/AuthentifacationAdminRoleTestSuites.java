package amazon.com.gestionRoles;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class AuthentifacationAdminRoleTestSuites {
	
	
	// Cette classe represente la suite de tests qui regroupe les scenarios de tests
		// qui couvrents l'autentification du user admin

		// Les methodes dans cette classe representent les scenarios de tests = cas de
		// tests

		String url = "https://www.amazon.ca/";

		// On utilise l'annotation @Test pour executer un cas de test 
		
		// @Test remplace la methode principale public static void main dans un projet java natif 
		
		// @Test appartient au package org.junit qui est configure as dependecy dans le pom.xml 
		
		// Une classe peut avoir plusieur methodes d'execusion de tests 
		
		
		@Test
		public void authenticationCorrectAdminCredentials_RedirectionAdminDshbord() {

			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");

			WebDriver driver = new ChromeDriver(); //polymorphisme

			driver.get(url);

			driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.id("ap_email")).sendKeys("ryminfo2021@gmail.com"+Keys.ENTER);
			driver.findElement(By.id("ap_password")).sendKeys("rym28608373"+Keys.ENTER);
			//driver.findElement(By.id("ap_email")).sendKeys("proservicetestauto@gmail.com"+Keys.ENTER);
			//driver.findElement(By.id("ap_password")).sendKeys("AdminProService"+Keys.ENTER);
			
			String actuelText = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
			String unexpectedText ="Hello, Amira";
			
			Assert.assertEquals(unexpectedText, actuelText);
			

		}

		//@Test
		public void authenticationCorrectGuestUserCredentials_RedirectionAdminDshbordMustFail() {

		}


}
