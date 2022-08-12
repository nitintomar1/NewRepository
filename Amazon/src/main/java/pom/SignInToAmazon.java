package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInToAmazon {
  @FindBy (xpath="//span[text()='Account & Lists']")
  private WebElement signinAccountAndLists;
  
  @FindBy (xpath="//span[text()='Sign in']")
  private WebElement signinButton;
  
  @FindBy (xpath="//input[@type='email']")
  private WebElement mobileNumber;
  
  @FindBy (xpath="//input[@id='continue']")
  private WebElement continueButton;
  
  @FindBy (xpath="//input[@type='password']")
  private WebElement password;
  
  @FindBy (xpath="//input[@id='signInSubmit']")
  private WebElement signInAccount;
  
  public SignInToAmazon (WebDriver driver) {            // driver = new ChromeDriver()
		
		PageFactory.initElements(driver, this);
	}
  
  public void clickOnsigninAccountAndLists()
  {
	  signinAccountAndLists.click();
  }
  
  public void clickOnSigninButton()
  {
	  signinButton.click();
  }
  
  public void enterMobileNumber()
  {
	  mobileNumber.sendKeys("8888051338");
  }
  
  public void clickOncontinueButton()
  {
	  continueButton.click();
  }
  
  public void enterPassword()
  {
	  password.sendKeys("Nitin@8888");
  }
  
  public void clickOnSignInAccount()
  {
	  signInAccount.click();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
