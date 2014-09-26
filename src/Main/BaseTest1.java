package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest1 {
	
	  public static String dir1;
	 
	  public static Properties config=null;
	  
	  public static Properties OR=null;
	  
	  public static WebDriver driver;
	  
	  public static Workbook wb;
	  
	  public static Sheet sheet;
	  
	  FileInputStream fp, fp1;
	  
	  File fp2;
	  
	  
	  
	  //initializing log4j
	  public static Logger log = Logger.getLogger("devpinoyLogger");
	 
		@BeforeSuite
		
		public void intialize() throws IOException, Exception   {
			
			log.debug("Starting the test suite......");
			
			log.debug("Loading the config files.....");
			
			dir1= System.getProperty("user.dir");
			
			fp= new FileInputStream(System.getProperty("user.dir")+"\\src\\Config1\\config.properties");
			
			config = new Properties();
			
			config.load(fp);
			
			log.debug("Loading the Object repository files.....");
			
			//fp1= new FileInputStream(System.getProperty("user.dir") +"\\src\\Config1\\or.properties");
			//OR = new Properties();
			//OR.load(fp1);
			
			File fp2 = new File(System.getProperty("user.dir") + "\\src\\TestDataXls\\RoundTrip.xls");

			Workbook wb = Workbook.getWorkbook(fp2);
			
		    sheet = wb.getSheet(0);
			
			
			System.out.println("Choosing the browser: "+ config.getProperty("browserType"));
			
				}
	
}
