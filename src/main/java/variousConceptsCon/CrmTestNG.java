package variousConceptsCon;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class CrmTestNG {
	
		WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_74.1.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	@Test(priority=2)
	public void loginTest() {
	
	WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
	WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//button[@name='login']"));
	
	
	USERNAME_FIELD_ELEMENT.clear();
	USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
	PASSWORD_FIELD_ELEMENT.sendKeys("abc123");
	SIGNIN_BUTTON_ELEMENT.click();

	
}
	
	
	@Test(priority=1)
	public void loginTest1() {
	
	WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
	WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//button[@name='login']"));
	
	
	USERNAME_FIELD_ELEMENT.clear();
	USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
	PASSWORD_FIELD_ELEMENT.sendKeys("abc1234");
	SIGNIN_BUTTON_ELEMENT.click();
	
	WebElement DASHBOARD_PAGE_TITLE_ELEMENT = driver.findElement(By.xpath("//h2[contains(text(),' Dashboard ')]"));
	Assert.assertEquals(DASHBOARD_PAGE_TITLE_ELEMENT.getText(), "DASHBOARD","Dashboardtitle doesn't match!");

}


	@AfterMethod
	public void tearDown() {
	
		driver.close();      
		driver.quit(); 


	}


}