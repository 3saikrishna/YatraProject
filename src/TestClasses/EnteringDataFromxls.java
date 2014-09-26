package TestClasses;
import java.io.File;
import java.util.List;
import java.util.Random;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestUtil1.Helper2;


public class EnteringDataFromxls extends Helper2 {
	
@BeforeMethod
	
	public void f1() {
		
		browser();
		
		driver.get(config.getProperty("url"));
}
	
	
  @Test

	public void Test4() {
	  
	 
	 try

	  {

		 // driver.get("http://yatra.com");

		  driver.manage().window().maximize();

		
		  int columns = sheet.getColumns();

		  int rows = sheet.getRows();

		  String data;

		  int col;

		  Boolean temp;

		  WebElement fightHotel = driver.findElement(By.xpath(".//*[@id='BE_Nav']/li[3]/a"));

		  fightHotel.click();

		  for(int i=1;i<rows;i++)

		  {

			  Thread.sleep(4000);

			  WebElement Origin = driver.findElement(By.id("BE_flighthotel_origin_city"));

			  if (Origin == null)

				  Assert.fail(" Exel data is Empty for Origin");

			  else

			  {

				  Origin.clear();

				  Origin.sendKeys(sheet.getCell(1,i).getContents());

			  }

			  String prevvalue = sheet.getCell(2,i).getContents();

			  WebElement dest = driver.findElement(By.id("BE_flighthotel_arrival_city"));

			  if (Origin == null)

				  Assert.fail(" Exel data is Empty for Origin");

			  else

			  {

				  dest.clear();
				  
				  dest.sendKeys(sheet.getCell(2,i).getContents());
				  
				//  dest.sendKeys(Keys.ENTER);

			  }

			 driver.findElement(By.id("BE_flighthotel_depart_date")).click();
			  
			  Thread.sleep(3000);
			  
			  List<WebElement> depdate = driver.findElement(By.id("ytCalTbl")).findElement(By.id("ytCalBlkOne")).findElements(By.tagName("a"));
			  System.out.println(depdate.size());
			  Thread.sleep(3000);
			  
			  depdate.get(3).click();
			  
			  Thread.sleep(3000);
			  driver.findElement(By.id("BE_flighthotel_return_date")).click();
			  
			  Thread.sleep(3000);
			  
			  List<WebElement> arrdate = driver.findElement(By.id("ytCalBlkOne")).findElements(By.tagName("a"));
			  System.out.println(arrdate.size());
			  Thread.sleep(3000);
			  arrdate.get(4).click();

			 /* if (depdate.size() != 0) {
				 
				int d = depdate.size();
				int k = random(d);
				driver.findElement(By.id("ytCalBlkOne")).findElements(By.tagName("a")).get(k).click();
			  
			  

				// depdate.get(3).click();

			  }
			  else

				  Assert.fail("Not able to click departure");*/
			  
	

			 // List<WebElement> retdate = driver.findElement(By.id("ytCalBlkOne")).findElements(By.tagName("a"));
			 // System.out.println(retdate.size());

			//  if (retdate.size() != 0){
				  
				
		//		  retdate.get(5).click();
			//  }

			  //else

				  Assert.fail("Not able to click return date");

			  System.out.println("Click the Check Box");

			  WebElement Checkbox = driver.findElement(By.xpath(".//*[@id='BE_flighthotel_form']/div[1]/ul[3]/li/label"));

			  if (Checkbox != null)

				  Checkbox.click();

			  else

				  Assert.fail("The Checkbox not clicked");

			  driver.findElement(By.id("BE_flighthotel_hoteldestination_city")).sendKeys(prevvalue);

			  //Traveller clicking Random elements

			  driver.findElement(By.id("msdrpdd26_msdd")).click();

			  List<WebElement> li = driver.findElement(By.id("msdrpdd26_child")).findElements(By.tagName("li"));

			  System.out.println(li.size());
			  
			  int a =li.size();
			  
			  int b = random(a);
			  
			  li.get(b).click();

			 
			  List<WebElement> li2 = driver.findElement(By.cssSelector("div.clearfix.mt20.findFlights")).findElements(By.tagName("input"));

			  System.out.println("hai");

			  System.out.println(li2.size());

			  li2.get(0).click();

			  //driver.switchTo().frame(0); //need to switch to this frame before clicking the slider

			  Thread.sleep(5000);

		  }

	  }catch ( Exception e) {

		  System.out.println(e);

	  }
	 
	 driver.close();

  }

}