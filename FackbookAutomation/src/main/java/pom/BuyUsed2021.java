package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyUsed2021 {

	@FindBy(xpath ="//li[text()='Exterior']")
	private WebElement exterior;

	
	public BuyUsed2021(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnExterior()
	{
		exterior.click();
	}
}
