package variousConceptsCon;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {
	
	WebDriver driver;
	
	@Test
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_74.1.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com/");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
//String title = driver.getTitle();
			System.out.println(driver.getTitle());
//String handle = driver.getWindowHandle() 
			System.out.println(driver.getWindowHandle());    // It returns a handle of the current page/tab      
		
		
		/* Console: 
			Yahoo
			CDwindow-6911C811B0ECF37EFC92B712886122C5*/
//___________________________________________________________________________________________________________________//
		
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("xpath");
		driver.findElement(By.xpath("//*[@id=\"ybar-sf\"]/input[2]")).click();
		driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
	
		
		
		System.out.println(driver.getTitle());
//<List>handles = driver.getWindowHandles();
		System.out.println(driver.getWindowHandles()); // It returns a set of handles of ALL the pages/tabs available
		
		/*Console:
		 	Yahoo
			CDwindow-B79C565FFF48F0885F16228509D3B6C1
			xpath - Yahoo Search Results
			[CDwindow-B79C565FFF48F0885F16228509D3B6C1, CDwindow-E92B8CEFA2B1AE765AAB51A32E828D06]*/     // String Array //
		
		
	//____________________________________________________________________________________________________//
		
	  //driver.get("https://www.yahoo.com/");
		System.out.println(driver.getTitle());        
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("xpath");
		driver.findElement(By.xpath("//*[@id=\"ybar-sf\"]/input[2]")).click();
		
		System.out.println(driver.getTitle());        
		System.out.println(driver.getWindowHandle());
		
		
		driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
		
		System.out.println(driver.getTitle());        
		System.out.println(driver.getWindowHandle());
		
		/* CONSOLE: 
		Yahoo
		CDwindow-B4C6A8E27136F02E711DA959588054C7
		Yahoo
		CDwindow-B4C6A8E27136F02E711DA959588054C7
		xpath - Yahoo Search Results
		CDwindow-B4C6A8E27136F02E711DA959588054C7*/
		
	// Conclusion: Notice the titles have changed but All the window handles are same because the driver is on the same tab and is getting the window handle of it everytime._______________________________________________________________________________________________//

//____________________________________________________________________________________________________________________//
		
		
		
		// To print them individually use 'For-Each Loop'
		
		
		for(String i : driver.getWindowHandles()){
			System.out.println(i);
		}
			
		/*CONSOLE:
		CDwindow-C1462A41E4AAB582E9A3C1DF93A385E7
		CDwindow-915051A5F8098AC64FDBEF19DBADFD95*/
		

 //_________________________________________________________________________________________________________//
		
		
		
			
//	// Now,lets transfer our driver from one Window to another Window	
//		 
//		System.out.println(driver.getTitle());
//		
//		for(String i : driver.getWindowHandles()){
//			System.out.println(i);
//			driver.switchTo().window(i);
//		}
//		
//		System.out.println(driver.getTitle());
		
		
		/*CONSOLE:
		 
		xpath - Yahoo Search Results
		
		CDwindow-DB825B63E2E6B51D445BE885257D9C2F
		CDwindow-854A78D8F9D9FC35A3B365945A35437D
		XPath Tutorial*/

		
	//________________________________________________________________________________________________________//
		
		
		
		System.out.println(driver.getTitle());
		
		for(String i : driver.getWindowHandles()){
			System.out.println(i);
			driver.switchTo().window(i);
		}
		
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("CSS")).click();
		
		
		/*CONSOLE:
		 
		xpath - Yahoo Search Results
		
		CDwindow-DB825B63E2E6B51D445BE885257D9C2F
		CDwindow-854A78D8F9D9FC35A3B365945A35437D
		XPath Tutorial*/
		
	//_________________________________________________________________________________________________________//	
		
		
//		QUESTION: How to switch the driver between Multiple Windows (more than 2)?             Time: 1:00
//		ANSWER: Use 'For-Each loop' and 'SwitchTo-window'
		
    System.out.println(driver.getWindowHandles());    // Will give you a 'List of Array'
		
		for(String i : driver.getWindowHandles()){
			System.out.println(i);
			driver.switchTo().window(i);
		}
		
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("CSS")).click();
		
		for(String i : driver.getWindowHandles()){    // This will take you from CSS to another tab, say 'CSS home'-3rd window
			System.out.println(i);
			driver.switchTo().window(i);
		}
		
  //__________________________________________________________________________________________________________//
		
//	 If you have to jump back to the 1st window, how do you do that ?                  Time: 1:07 - 1:08
//    Complicated and not imp, rarely asked in an interview.
		
	}
	
}
