package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (xpath = "//input[@name='username']") 
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@name='pwd']") 
	private WebElement passWord ;
	
	@FindBy (xpath = "//input[@name='remember']") 
	private WebElement keepMeLoginCheckbox ;
	
	@FindBy (xpath = "//div[text()='Login ']") 
	private WebElement loginButton ;
	
	public LoginPage (WebDriver driver) {            // driver = new ChromeDriver()
		
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName() {
		userName.sendKeys("admin");
	}
	public void sendPassWord() {
		passWord.sendKeys("manager");
	}
	public void selectKeepMeLogin() {
		keepMeLoginCheckbox.click();
	}
	public void clickOnLogin() {
		loginButton.click();
	}
	
	//OR
	
	public void loginToApplication() {
		
		userName.sendKeys("admin");
		passWord.sendKeys("manager");
		keepMeLoginCheckbox.click();
		loginButton.click();
	}
	
	

}
