package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.SignInToAmazon;

public class TestClass {

	WebDriver driver;
	
		@BeforeClass
		public void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		    driver=new ChromeDriver();
		}
		
		@BeforeMethod
		public void loginToAmazonApp() {
			driver.get("https://www.amazon.in/");
			
			SignInToAmazon signInToAmazon=new SignInToAmazon(driver);
			
			signInToAmazon.clickOnsigninAccountAndLists();
			signInToAmazon.clickOnSigninButton();
			signInToAmazon.enterMobileNumber();
			signInToAmazon.clickOncontinueButton();
			signInToAmazon.enterPassword();
			signInToAmazon.clickOnSignInAccount();
		
		}
		
		@Test
		public void verify(){
		
		}
		
	}


