package test123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pom.Headers;
import pom.Loginpage;

public class NewTestClass1 {
	
	 WebDriver driver;
	    Headers headers;
	    @BeforeClass
		public void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
			
	    @BeforeMethod
		public void loginToLambdaTest() {
			
			driver.get("https://accounts.lambdatest.com/");

			Loginpage loginPage =new Loginpage(driver);
			loginPage.enterEmail();
			loginPage.enterPassword();
			loginPage.clickOnLogin();
			
			headers=new Headers(driver);
	    }
	    
	    @Test
		public void toVerifyAutomation() throws InterruptedException
	    {
	    	Thread.sleep(5000);
			headers.openAutomation();
			String url=driver.getCurrentUrl();
			System.out.println(url);
			String title=driver.getTitle();
			System.out.println(title);

			if(url.equals("https://automation.lambdatest.com/build") && title.equals("LambdaTest Automation"))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
		}
	     
	      
	    
	    
	    
	    
	    
	    
	    @AfterMethod
		public void logOut() throws InterruptedException {
			//System.err.println("afterMethod ");
	    	Thread.sleep(3000);
			headers.clickOnSetting();
			Thread.sleep(3000);
			headers.clickOnLogOut();
		}

		@AfterClass
		public void quitBrowser() {
			//System.err.println("afterClass");
			driver.quit();  
		}
			

}
