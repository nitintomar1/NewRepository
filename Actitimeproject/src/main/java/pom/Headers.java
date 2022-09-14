package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Headers {
	@FindBy (xpath = "//div[text()='TIME-TRACK']") 
	private WebElement timeTrack ;
	
	@FindBy (xpath = "//div[text()='TASKS']") 
	private WebElement tasks ;
	
	@FindBy (xpath = "//div[text()='REPORTS']") 
	private WebElement reports ;
	
	@FindBy (xpath = "//div[text()='USERS']") 
	private WebElement users ;
	
	@FindBy (xpath = "//a[text()='Logout']") 
	private WebElement logout ;
	
	
	public Headers (WebDriver driver) {            // driver = new ChromeDriver()
		
		PageFactory.initElements(driver, this);
	}
	
	public void openTimeTrack() {
		timeTrack.click();
	}
	public void openTasks() {
		tasks.click();
	}
	public void openReports() {
		reports.click();
	}
	public void openUsers() {
		users.click();
	}
	public void clickONLogout() {
		logout.click();
	}

}
