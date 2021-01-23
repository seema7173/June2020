package variousConceptsCon;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//	public class learnMultiBrowsers {
//	
//		WebDriver driver;
//	
//	
//	@BeforeMethod
//	public void launchBrowser() {
//		
//		String browser = "Chrome";
//		
//		if(browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_74.1.exe");
//			driver = new ChromeDriver();
//			
//		}else if(browser.equalsIgnoreCase("Firefox")) {
//			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
//		
//		driver.get("http://techfios.com/billing/?ng=admin/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
  //-------------------------------------------------------------------------------------------------//		
		
//		String browser = "Chrome";
//				
//		if(browser == "chrome") {
//			
//			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_74.1.exe");
//			driver = new ChromeDriver();
//			
//		}else if(browser == "Firefox") {
//			
//			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
		
  //-----------------------------------------------------------------------------------------------------//
		
//		String browser = "Firefox";
//		
//		if(browser == "Chrome") {
//			
//			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_74.1.exe");
//			driver = new ChromeDriver();
//			
//		}else if(browser == "Firefox") {
//			
//			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
  //-------------------------------------------------------------------------------------------------//
		
		
//		String browser = "Chrome";
//		
//		if(browser.equalsIgnoreCase("chrome")) {
//			
//			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_74.1.exe");
//			driver = new ChromeDriver();
//			
//		}else if(browser.equalsIgnoreCase("Firefox")) {
//			
//			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
		
  //-----------------------------------------------------------------------------------------------------//
		
//		String browser = "Safari";
//		
//		if(browser.equalsIgnoreCase("chrome")) {
//			
//			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_74.1.exe");
//			driver = new ChromeDriver();
//			
//		}else if(browser.equalsIgnoreCase("Firefox")) {
//			
//			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//			
//		}else if(browser.equalsIgnoreCase("Safari")) {
//			
//			System.setProperty("webdriver.safari.driver", "drivers\\safaridriver.exe");
//			driver = new SafariDriver();
//		}
		
//-------------------------------------------------------------------------------------------------//		
		
//		driver.get("http://techfios.com/billing/?ng=admin/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
  //--------------------------------------------------------------------------------------------------//		
//	}
//	
//	@Test(priority=2)
//	public void loginTest() {
//	
//	WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
//	WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"password\"]"));
//	WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//button[@name='login']"));
//	
//	
//	USERNAME_FIELD_ELEMENT.clear();
//	USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
//	PASSWORD_FIELD_ELEMENT.sendKeys("abc123");
//	SIGNIN_BUTTON_ELEMENT.click();
//
//	
//}
//	
//	
//	//@Test(priority=1)
//	public void loginTest1() {
//	
//	WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
//	WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"password\"]"));
//	WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//button[@name='login']"));
//	
//	
//	USERNAME_FIELD_ELEMENT.clear();
//	USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
//	PASSWORD_FIELD_ELEMENT.sendKeys("abc1234");
//	SIGNIN_BUTTON_ELEMENT.click();
//	
//	WebElement DASHBOARD_PAGE_TITLE_ELEMENT = driver.findElement(By.xpath("//h2[contains(text(),' Dashboard ')]"));
//	Assert.assertEquals(DASHBOARD_PAGE_TITLE_ELEMENT.getText(), "DASHBOARD","Dashboardtitle doesn't match!");
//
//}
//
//
//	//@AfterMethod
//	public void tearDown() {
//	
//		driver.close();      
//		driver.quit(); 
//	}
//
//	}
	
//************************************************************************************************************//
	
	
	public class learnMultiBrowsers {
		
		WebDriver driver;
		String browser = null;
		String url = null;
		
	@BeforeTest	
	public void readConfig() {	
		Properties prop = new Properties();
		
		// InputStream // FileReader //BufferedReader //Scanner
		
		try {
			InputStream input = new FileInputStream("src\\main\\java\\config\\config.properties");
			prop.load(input);
			browser = prop.getProperty("browser");
			System.out.println("Used browser: " + browser);
			url = prop.getProperty(url);
			
		}catch(IOException e) {
			e.printStackTrace();
			}
		
		}
	
	@BeforeMethod
	public void launchBrowser() {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_74.1.exe");
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		                           //driver.get("http://techfios.com/billing/?ng=admin/");
		driver.get(url);
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
	
	@AfterMethod
		public void tearDown() {
		
			driver.close();      
			driver.quit(); 
	   }
}


