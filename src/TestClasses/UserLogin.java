package TestClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestUtil1.Helper2;


public class UserLogin extends Helper2{
	
	Helper2 h = new Helper2();
	
	@BeforeMethod
	
	public void f1() {
		
		browser();
		
		driver.get(config.getProperty("login"));
		
		
	}
	
	@Test
	public void f() throws FileNotFoundException, IOException  {
		// TODO Auto-generated method stub
		System.out.println("*****************************************");
				System.out.println("Executing signin");
	
				System.out.println(driver.findElements(By.linkText("Sign In")).size());
				
				//checking user log in or not
				
				if( driver.findElements(By.linkText("Sign In")).size()==1)
					
				   {
					
					System.out.println("user logged in");
					
					return;
					
				   }
				//user signin process
				
				//driver.findElement(By.cssSelector("ytBtn.ytBtnBlue.txt13 _w57.latoBold.logIn.eventTrackable")).click();
				
				driver.findElement(By.id("emailId")).sendKeys(config.getProperty("username"));
				
				driver.findElement(By.id("password")).sendKeys(config.getProperty("password"));
				
				driver.findElement(By.cssSelector("button.yt-btn.btn-blue.btn-block.simulateSubmit")).click();
			
				System.out.println(driver.findElement(By.id("emailId")).getAttribute("class"));
				
				//printing login not matched
				
				if(driver.findElement(By.id("emailId")).getAttribute("class").equals("form-control required_field redBorder")){
					
					System.out.println(driver.findElement(By.id("emailId")).getAttribute("data-errormsg"));
					
				}else {
					System.out.println("login failure Try again");
					
					System.out.println("*please check ur Emailid once again");
					
				}
				
				if(driver.findElement(By.id("password")).getAttribute("class").equals("form-control required_field redBorder")){
					
					System.out.println(driver.findElement(By.id("emailId")).getAttribute("data-errormsg"));
					
				}else {
					
					System.out.println("*please check ur password  once again");
					//System.out.println("login failure Try again");
					System.out.println("sign in executed sucessfully");
					System.out.println("**********************************************");
					
										
				}
				driver.quit();
				
				} 

	

} 
