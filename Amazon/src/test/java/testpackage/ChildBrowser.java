package testpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://secure.indeed.com/account/login");
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//button[@id='login-google-button']")).click();
	    ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
	   String newAddr= addr.get(1);
	   
	   driver.switchTo().window(newAddr);
	   driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gakdfgjhr");
	   
	   driver.quit();
	}

}
