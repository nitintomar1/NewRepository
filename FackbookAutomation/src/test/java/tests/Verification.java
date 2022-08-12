package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import pom.BuyUsed2021;
import pom.SelectLocation;

public class Verification {

	
		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.cars24.com/");
			
			SelectLocation selectLocation=new SelectLocation(driver);
			
			selectLocation.clickOnlocation();
			Thread.sleep(2000);
			selectLocation.clickOnPune();
			Thread.sleep(2000);
			selectLocation.clickOnViewAllCars();
			Thread.sleep(2000);
			selectLocation.clickOnPriceRange();
			Thread.sleep(2000);
			selectLocation.clickOnRange();
			Thread.sleep(2000);
			selectLocation.clickOnCars();
			Thread.sleep(2000);
			//selectLocation.clickOnPrice();
			
			BuyUsed2021 buyUsed2021=new BuyUsed2021(driver);
			Thread.sleep(2000);
			buyUsed2021.clickOnExterior();
			
			TakesScreenshot t= (TakesScreenshot)driver;
			File Source=t.getScreenshotAs(OutputType.FILE);
			File Dest=new File("C:\\Users\\Nitinsing Tomar\\Desktop\\Nitin\\TakesScreenshot.jpeg");
			
			FileHandler.copy(Source, Dest);
			
			
			
			
			

	}

}
