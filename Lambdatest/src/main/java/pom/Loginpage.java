package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy (xpath ="//input[@id='email']")
	private WebElement email;

	@FindBy (xpath ="//input[@id='password']")
	private WebElement password;

	@FindBy (xpath ="//button[@id='login-button']")
	private WebElement login;


	public Loginpage (WebDriver driver) {            // driver = new ChromeDriver()

		PageFactory.initElements(driver, this);
	}

	public void enterEmail() {
		email.sendKeys("laxmikantkale490@gmail.com");
	}

	public void enterPassword() {
		password.sendKeys("Lucky@1432");
	}
	public void clickOnLogin() {
		login.click();
	}


}
