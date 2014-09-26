package TestClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestUtil1.Helper2;


public class FooterLinks extends Helper2{
	
	
	@BeforeMethod
	
	public void f1() {
		
		browser();
		
		driver.get(config.getProperty("url"));
		
		
	}
	@Test
	public void f() throws Exception {
		// TODO Auto-generated method stub

		driver.get("http://yatra.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		System.out.println("***********************************");
		System.out.println("Displaying footer links");
		System.out.println("***********************************");
		
		List<WebElement> links= driver.findElement(By.id("js_yt_footer")).findElements(By.tagName("a"));
        
        System.out.println("Total footer links are :"+ links.size());
        
                 ArrayList<String> arrLinks = new ArrayList<String>();
                 
        for (int j=0;j<links.size();j++){
        	
         arrLinks.add(links.get(j).getAttribute("href"));
         
            System.out.println(links.get(j).getAttribute("href"));
        } 
        
        for (int i=0;i<links.size();i++){
        	
         driver.get(arrLinks.get(i));
         
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
         
         }
        System.out.println("**********************************************");
        System.out.println("All footer links are displayed sucessfully");
        System.out.println("***********************************************");
      
             
        driver.close();
        
}
}