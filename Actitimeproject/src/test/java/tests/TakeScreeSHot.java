package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreeSHot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");		
	    WebDriver driver = new ChromeDriver();    		  // upcasting
	    
	    //TestCase 1 TaskPage
	    driver.get("https://www.google.co.in/webhp");
	    
	   File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   File destination =new File("C:\\Users\\Nitinsing Tomar\\Pictures\\Screenshots\\New folder.jpeg");
	   
	   FileHandler.copy(source, destination);
	   
	   // System.out.println("end");
	    
	}

}
