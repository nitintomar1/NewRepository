package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		
		WebElement bestSEllerInMusic= driver.findElement(By.xpath("(//h2[@class='a-carousel-heading a-inline-block'])[5]"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeAsyncScript("arguments[0].scrollIntoView(true);", bestSEllerInMusic);
	}

}
