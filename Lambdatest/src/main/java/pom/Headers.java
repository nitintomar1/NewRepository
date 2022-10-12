package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headers {
	@FindBy (xpath ="//a[text()='Dashboard']")
	private WebElement dashbord;
	
	@FindBy (xpath ="//a[text()='Real Time Testing']")
	private WebElement realTimeTesting;
	
	@FindBy (xpath ="//a[@data-amplitude='SB_rd']")
	private WebElement realDevice;
	
	@FindBy (xpath ="//a[text()='Automation']")
	private WebElement automation;
	
	@FindBy (xpath ="//a[@id='profile__dropdown']")
	private WebElement setting;
	
	@FindBy (xpath ="//a[@id='app__logout']")
	private WebElement logOut;
	
public Headers (WebDriver driver) {            // driver = new ChromeDriver()
		
		PageFactory.initElements(driver, this);
	}
    
    public void openDashbord()
    {
    	dashbord.click();
    }
    
    public void openRealTimeTesting()
    {
    	realTimeTesting.click();
    }
    
    public void openRealDevice()
    {
    	realDevice.click();
    }
    
    public void openAutomation()
    {
    	automation.click();
    }
    
    public void clickOnSetting()
    {
    	setting.click();
    }
    
    public void clickOnLogOut()
    {
    	logOut.click();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
