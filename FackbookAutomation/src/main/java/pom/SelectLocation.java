package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectLocation {
	@FindBy(xpath ="//button[text()='SELECT MANUALLY']")
	private WebElement location;
	
	@FindBy(xpath ="//h6[text()='Pune']")
	private WebElement pune;
	
	@FindBy(xpath ="//button[text()='View All Cars']")
	private WebElement viewallcars;
	
	@FindBy(xpath ="(//div[@class='filter-section _1NTuv'])[1]")
	private WebElement pricerange;
	
	@FindBy(xpath ="//li[@id='500000-1000000']")
	private WebElement range;
	
	@FindBy(xpath ="//h2[@class='_3FpCg']")
	private WebElement cars;
	
	@FindBy(xpath ="//div[@class='_7udZZ']")
	private WebElement price;
	
	
	
	//@FindBy(xpath ="//div[@class='_7udZZ']")
	//private WebElement price;
	
	public SelectLocation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnlocation() throws InterruptedException {
		Thread.sleep(2000);
		location.click();
	}
	
	public void clickOnPune() {
		pune.click();
	}
	
	public void clickOnViewAllCars() {
		viewallcars.click();
	}
	
	public void clickOnPriceRange() {
		pricerange.click();
	}
	
	public void clickOnRange() {
		range.click();
	}
	
	public void clickOnCars() {
		cars.click();
	}
	
	public void clickOnPrice() {
		price.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
