package TestClasses;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestUtil1.Helper2;


public class SwappingRupees extends Helper2{
@BeforeMethod
	
	public void f1() {
		
		browser();
		
		driver.get(config.getProperty("sawpingurl"));
}

	@Test 
	
	public void Test6() throws Exception {
	
		// TODO Auto-generated method stub
		int i;
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		int k = 0,j;
		System.out.println("*******************************************");
		System.out.println(" Displaying Resorts and their price and checking all prices in order or not");
		System.out.println("*******************************************");
		
		List<String> str = new ArrayList<String>();
		
		List<Integer> str3 = new ArrayList<Integer>();
		
		List<Integer> str7 = new ArrayList<Integer>();
		
		List<WebElement> li2 = driver.findElement(By.id("sortContainer")).findElements(By.className("sortTypeEvent"));
		
		li2.get(1).click();
		
		List<WebElement> li = driver.findElement(By.cssSelector("section.row.result-content")).findElements(By.cssSelector("article.res-article.js-showhotel"));
		
		System.out.println(li.size());
		
		//driver.findElement(By.className("sortTypeEvent")).click();
		
		for(i=0;i<li.size();i++) {
			
           System.out.println("***************");
			
			System.out.println("Printing Resort name and their price in Ascending order");
			
			System.out.println("*********************");
			
			System.out.println(li.get(i).findElement(By.cssSelector("a.js-hotelFltSel.eventTrackable")).getText());
			
			
			System.out.println(li.get(i).findElement(By.cssSelector("li.dyna-price")).findElement(By.tagName("h3")).getText());
			
			String str1 = li.get(i).findElement(By.cssSelector("li.dyna-price")).findElement(By.tagName("h3")).getText();
			
			String str2[] = str1.split("\n");
			
			String str4 = str2[1];
	
			String str5[] = str4.split(",");
			
			String  str6 = str5[0]+str5[1];
			
			int i1 = Integer.parseInt(str6);
			
			System.out.println(i1);
			
			str3.add(i1);
			
			 str.add(li.get(i).findElement(By.cssSelector("li.dyna-price")).findElement(By.tagName("h3")).getText());
			//String str1 = li.get(i).findElement(By.cssSelector("li.dyna-price")).findElement(By.tagName("h3")).getText();
			
			System.out.println("**************************************");
			
		}
		
		System.out.println(str3);
		int b = str3.size();
		
	/*	for(int m=0;m<str3.size();m++)
		{
			for(int l=0;l<str3.size()-1;l++){
			
			if(str3.get(l)>str3.get(l+1)) {
				
				 j = str3.get(l);
				 
				 k=str3.get(l+1);
				 
				int temp =j ;
				
				j = k;
				
				k=temp;
				
				
				str7.add(k);
				
				//System.out.println("Im swapping it");
				
			} else {
				
				System.out.println(" In order");
				System.out.println(str3.get(l));
				
			}
			}
		}
			for(int p=0;p<str7.size();p++)
			{
				
			System.out.println("All Prices are not in order"+str7.get(p));
			
		}*/
		System.out.println("sucessfully executed Printing Resort name and their price in Ascending order");
		
		System.out.println("*********************");
		
		driver.close();
		
	}
}
