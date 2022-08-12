package testpackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 
		TakesScreenshot t=(TakesScreenshot)driver;
		
		File source=t.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Nitinsing Tomar\\Desktop\\Nitin\\name.jpeg");
		
		FileHandler.copy(source, dest);
	}

}
