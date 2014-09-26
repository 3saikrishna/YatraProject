package TestClasses;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestUtil1.Helper2;


public class SliderBarChecking extends Helper2 {
	
@BeforeMethod
	
	public void f1() {
		
		browser();
		
		driver.get(config.getProperty("sliderurl"));
}

	@Test 
	public void Test5() throws Exception {
		
		
		//driver.get("http://dpack.yatra.com/flights-hotels/wait?cityName=Goa&cityCode=Goa&country=INDIA&checkInDate=27/09/2014&checkOutDate=30/09/2014&roomRequests[0].id=1&roomRequests[0].noOfAdults=1&roomRequests[0].noOfChildren=0&roomRequests[0].noOfInfant=0&type=R&flight_depart_date=27/09/2014&arrivalDate=30/09/2014&origin=HYD&destination=GOI");
		
		driver.manage().window().maximize();
		
		Thread.sleep(40000);
		 System.out.println("************************************************");
		System.out.println("SliderBar Checking and displaying the rupees difference");
		 System.out.println("************************************************");
		
		//Identify WebElement
		WebElement slider = driver.findElement(By.cssSelector("a.ui-slider-handle.ui-state-default.ui-corner-all"));
		
		//Using Action Class
		
		Actions move = new Actions(driver);
		
		Action action = move.dragAndDropBy(slider, 30, 0).build();
		
		action.perform();
		
		String s = driver.findElement(By.id("fltprice")).findElement(By.className("js-pricemin")).getText();
		
		//driver.quit();
		
		String str1[] = s.split(",");
		
		//System.out.println(str1[1]);
		
		//System.out.println(str1[0]);
		
		System.out.println(str1[0]+str1[1]);
		
		String  str2 = str1[0]+str1[1];
		
		int i = Integer.parseInt(str2);
		
		//System.out.println(i);
		
		String s3 = driver.findElement(By.id("fltprice")).findElement(By.className("js-pricemax")).getText();
		
		String str3[] = s3.split(",");
		
		//System.out.println(str3[1]);
		
		/*System.out.println(str3[0]);
		System.out.println(str3[1]);
		System.out.println(str3[2]);*/
		
		System.out.println(str3[0]+str3[1]+str3[2]);
		
		String  str4 = str3[0]+str3[1]+str3[2];
		
		int i1 = Integer.parseInt(str4);
		
		//System.out.println(i1);
		
		//driffernce
		System.out.println("ur slected price range in between"+"**"+i1+"---- "+i);
		
	   int i2 = i1-i;
	   
	   System.out.println("Difference between two ranges is");
	   
	   System.out.println(i2);
	   
	   System.out.println("************************************************");
	   
	   System.out.println("Slider bar sucessfully checked and displayed their ranges and their differnce");
	   
	   System.out.println("************************************************");
	   
	   driver.close();
		
	}

}
