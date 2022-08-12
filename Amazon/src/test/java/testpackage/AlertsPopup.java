package testpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("http://demo.guru99.com/test/delete_customer.php");
	    driver.manage().window().maximize();
	    
	    WebElement customerId=driver.findElement(By.xpath("//input[@type='text']"));
	    
	    customerId.sendKeys("1234");
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    Alert alt=driver.switchTo().alert();
	    alt.accept();
	    
	    alt.accept();
	    
	   
	}

}
