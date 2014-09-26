package TestUtil1;

import java.util.Random;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import Main.BaseTest1;

public class Helper2 extends BaseTest1 {
	
	public void url1() {
		driver.get(config.getProperty("url"));
	}
	
	public void browser() {
		if(config.getProperty("browserType").equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
			}
			else if(config.getProperty("browserType").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\Exefiles\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			else {
			if(config.getProperty("browserType").equalsIgnoreCase("IE"))
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\Exefiles\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			}
	}
	
	// Random function
	
	public int random(int li1) {
		
		 Random r = new Random();

		  int s1 = r.nextInt(li1);

		  return s1;
	}
	
	//swapping function
	
	
  
}
