package TestClasses;

 import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestUtil1.Helper2;

 public class HeaderLinks extends Helper2{
	 
	 
		
		
@BeforeMethod
		
		   public void f1() {
			
			browser();
			
			driver.get(config.getProperty("url"));
			
			
		}
	 

 @Test
 public void Test1() throws Exception {
	 
	
   driver.manage().window().maximize();
  
   //Headerlinks in Helper class
   Thread.sleep(4000);
   System.out.println("********************************");
   System.out.println("Displaying all HeadeerLinks");
   System.out.println("***************************");
   	
   	List<WebElement> links= driver.findElement(By.cssSelector("ul.nav-tabs.tabletHidden")).findElements(By.tagName("a"));
        
        System.out.println("Total header links are :"+links.size());
        
        System.out.println("Displaying all links");
        
        ArrayList<String> arrLinks = new ArrayList<String>();
        
        for (int j=0;j<links.size();j++) {
       	 
         arrLinks.add(links.get(j).getAttribute("href"));
         
         System.out.println(links.get(j).getAttribute("href"));
         
        } 
        
        for (int i=0;i<links.size();i++) {
       	 
         driver.get(arrLinks.get(i));
         
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
          }
        
        System.out.println("************************************************");
   
       System.out.println("All the Header Links are displayed sucessufully");
       
       System.out.println("************************************************");
        driver.close();
        Thread.sleep(4000);
   	
	}
   	
   
 
   
   
  
         
 }
 
    
          
 
 