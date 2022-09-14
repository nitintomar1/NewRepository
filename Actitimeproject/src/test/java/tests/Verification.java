package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Headers;
import pom.LoginPage;

public class Verification {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");		
	    WebDriver driver = new ChromeDriver();    		  // upcasting
	    
	    //TestCase 1 TaskPage
	    driver.get("http://localhost:90/user/submit_tt.do");
	    
	    LoginPage loginPage = new LoginPage(driver);	    
	   
	    loginPage.sendUserName();
	    loginPage.sendPassWord();
	    loginPage.selectKeepMeLogin();
	    loginPage.clickOnLogin();
	    
	    Headers headers = new Headers(driver);	    
	    headers.openTasks();
	    
	    String url = driver.getCurrentUrl();
	    String title = driver.getTitle();
	    if(url.equals("http://localhost:90/tasks/tasklist.do")&& title.equals("actiTIME - Task List")) {
	    	System.out.println("PASS");
	    }else {
	    	System.out.println("FAIL");
	    }
	    headers.clickONLogout();
	    
	    //TestCase 2 Reports
	    driver.get("http://localhost:90/login.do");
	    
	    loginPage = new LoginPage(driver);	    
	   
	    loginPage.sendUserName();
	    loginPage.sendPassWord();
	    loginPage.selectKeepMeLogin();
	    loginPage.clickOnLogin();
	    
	    headers = new Headers(driver);	    
	    headers.openReports();
	    
	    url = driver.getCurrentUrl();
	    title = driver.getTitle();
	    if(url.equals("http://localhost:90/reports/reports.do")&& title.equals("actiTIME - Reports Dashboard")) {
	    	System.out.println("PASS");
	    }else {
	    	System.out.println("FAIL");
	    }
	    headers.clickONLogout();
	    
	    
	    //TestCase 3 Users
	    driver.get("http://localhost:90/login.do");
	    
	    loginPage = new LoginPage(driver);	    
	   
	    loginPage.sendUserName();
	    loginPage.sendPassWord();
	    loginPage.selectKeepMeLogin();
	    loginPage.clickOnLogin();
	    
	    headers = new Headers(driver);	    
	    headers.openUsers();
	    
	    url = driver.getCurrentUrl();
	    title = driver.getTitle();
	    if(url.equals("http://localhost:90/administration/userlist.do")&& title.equals("actiTIME - User List")) {
	    	System.out.println("PASS");
	    }else {
	    	System.out.println("FAIL");
	    }
	    headers.clickONLogout();
	    
	    
	  //TestCase 4 Users
	    driver.get("http://localhost:90/login.do");
	    
	    loginPage = new LoginPage(driver);	    
	   
	    loginPage.sendUserName();
	    loginPage.sendPassWord();
	    loginPage.selectKeepMeLogin();
	    loginPage.clickOnLogin();
	    
	    headers = new Headers(driver);	
	    Thread.sleep(3000);
	    headers.openTimeTrack();
	    
	    url = driver.getCurrentUrl();
	    title = driver.getTitle();
	    if(url.equals("http://localhost:90/user/submit_tt.do")&& title.equals("actiTIME - Enter Time-Track")) {
	    	System.out.println("PASS");
	    }else {
	    	System.out.println("FAIL");
	    }
	    headers.clickONLogout();
	    
	    driver.quit();    
	}

}
