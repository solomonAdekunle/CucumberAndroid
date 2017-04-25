package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

public class WebConnector {
	
		
	static WebConnector w;
	 static Properties Config;
	 Properties OR;
	//public static WebDriver d;
	 static AndroidDriver d;
	static EventFiringWebDriver dr;
	
public WebConnector() throws IOException{		
		if(d==null){
			
		// initialising the properties
			Config = new Properties();
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Config\\Config.Properties");
		Config.load(fs);
		System.out.print("Looking for Bog1");
           // OR
		  OR = new Properties();
              fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Config\\OR.Properties");
		            OR.load(fs);
		            System.out.print("Looking for Bog");
			}
			
			
		}

		public static void SetPath() throws MalformedURLException{
			DesiredCapabilities capabilities = new DesiredCapabilities();
           capabilities.setCapability("automationName", "Appium");
            capabilities.setCapability("deviceName","8917f630");
            capabilities.setCapability("platformVersion", "5.0");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability(CapabilityType.BROWSER_NAME,"Chrome");
            capabilities.setCapability("newCommandTimeout", 10000);
            //capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");
            //d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
            System.out.print(Config.getProperty("Is Android initailising"));
            d= new AndroidDriver(new URL("http://10.44.3.81:4723/wd/hub"),capabilities);
		       d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		       
		}
	
	
		 public void click(String identifier){
		   		try{
		   		if(identifier.endsWith("_xpath"))
		   			d.findElement(By.xpath(OR.getProperty(identifier))).click();
		   		else if(identifier.endsWith("_id"))
		   			d.findElement(By.id(OR.getProperty(identifier))).click();
		   		else if(identifier.endsWith("_name"))
		   			d.findElement(By.name(OR.getProperty(identifier))).click();
		   		else if((identifier.endsWith("_Selector")))
		   			d.findElement(By.cssSelector(OR.getProperty(identifier))).click();
		   			}catch(NoSuchElementException e){
		   				//Utility.takeScreenshot(identifier);
		   			Assert.fail("Element not found - "+identifier);
		   			
		   		}
		   	}
		   		public void clear(String identifier){
		   			try{
		   				if(identifier.endsWith("_xpath"))
		   					d.findElement(By.xpath(OR.getProperty(identifier))).clear();
		   				else if(identifier.endsWith("_id"))
		   					d.findElement(By.id(OR.getProperty(identifier))).clear();
		   				else if(identifier.endsWith("_name"))
		   					d.findElement(By.name(OR.getProperty(identifier))).click();
		   				else if((identifier.endsWith("_Selector")))
		   					d.findElement(By.cssSelector(OR.getProperty(identifier))).clear();
		   				}catch(NoSuchElementException e){
		   					//Utility.takeScreenshot(identifier);//take screenshot 
		   					Assert.fail("Element not found - "+identifier);
		   					
		   				}
		   		}
		   	
		   		public void input(String identifier,String data){
		   			try{
		   			if(identifier.endsWith("_xpath"))
		   				d.findElement(By.xpath(OR.getProperty(identifier))).sendKeys(data);
		   			else if(identifier.endsWith("_id"))
		   				d.findElement(By.id(OR.getProperty(identifier))).sendKeys(data);
		   			else if(identifier.endsWith("_name"))
		   				d.findElement(By.name(OR.getProperty(identifier))).sendKeys(data);
		   			else if((identifier.endsWith("_Selector")))
		   				d.findElement(By.cssSelector(OR.getProperty(identifier))).sendKeys(data);
		   			}catch(NoSuchElementException e){
		   				Assert.fail("Element not found - "+identifier);
		   				//Utility.takeScreenshot(identifier);
		   			}
		   		}
		   		    public boolean verifyTitle(String expectedTitleKey){
		   				String expectedTitle=OR.getProperty(expectedTitleKey);
		   				String actualTitle=d.getTitle();
		   				//Utility.takeScreenshot(expectedTitleKey);
		   				if(expectedTitle.equals(actualTitle))
		   					return true;
		   				else
		   					return false;
		   			}
		   			public boolean isElementPresent(String identifier){
		   				int size=0;
		   				if(identifier.endsWith("_xpath"))
		   					size = d.findElements(By.xpath(OR.getProperty(identifier))).size();
		   				else if(identifier.endsWith("_id"))
		   					size = d.findElements(By.id(OR.getProperty(identifier))).size();
		   				else if(identifier.endsWith("_name"))
		   					size = d.findElements(By.name(OR.getProperty(identifier))).size();
		   				else if(identifier.endsWith("_Selector"))
		   					size=d.findElements(By.cssSelector(identifier)).size();
		   				else // not in prop file
		   					size=d.findElements(By.xpath(OR.getProperty(identifier))).size();
		   				//Utility.takeScreenshot(identifier);
		   				if(size>0)
		   					return true;
		   				else
		   					return false;
		   		}
		   			public String getText(String identifier){
		   				String  text="";
		   				if(identifier.endsWith("_xpath"))
		   					text = d.findElement(By.xpath(OR.getProperty(identifier))).getText();
		   				else if(identifier.endsWith("_id"))
		   					text = d.findElement(By.id(OR.getProperty(identifier))).getText();
		   				else if(identifier.endsWith("_name"))
		   					text =d.findElement(By.name(OR.getProperty(identifier))).getText();
		   				else if(identifier.endsWith("_Selector"))
		   					text=d.findElement(By.cssSelector(OR.getProperty(identifier))).getText();
		   				//Utility.takeScreenshot(identifier);
		   				return text;
		   				
		   			}
		   			
		   			
		   		// navigates to a URL
		   			public void navigate() throws MalformedURLException {
		   			// d.get(Config.getProperty("URL"));
		   				d.get("https://www.supercasino.com");
		   			System.out.print(Config.getProperty("URL"));
		   			   
		   			}
		   			public void quit(){
		   				if(d!=null){
		   					d.quit();
		   					d=null;
				 
				}

		   			}
				
		   			
		
				public static void takeScreenshot(String fileName) {

					File scrFile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
				    try {
						FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\screenshots\\"+fileName+".JPg"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			    public void doLogin( String Username,String Password) throws InterruptedException, MalformedURLException{
			    	//TestBase.SetPath();
					//d.get(Config.getProperty("URL"));
					Thread.sleep(2000);
					click("hp_TopLogin_xpath");
					input("username_Selector",Username);
					input("password_Selector",Password);
					click("Signin_Selector");
		}
				public void doDefaultLogin(String browser) throws InterruptedException, MalformedURLException{
					doLogin(Config.getProperty("defaultUsername"), Config.getProperty("defaultPassword"));
				}
				

		
				// Creating a Dynamatic Data Generator
				
				
				public String generateStringWithAllobedSplChars(int length,String allowdSplChrs){
					  String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
					    "1234567890" +   //numbers
					    allowdSplChrs;
					  return RandomStringUtils.random(length, allowedChars);
					 }

							
				public String generateRandomAlphaNumeric(int length){
					  return RandomStringUtils.randomAlphanumeric(length);
					 }


				
				/******** Singleton **********/
				public static WebConnector getInstance() {
					if (w == null)
						try {
							w = new WebConnector();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					return w;
				}

			



			}


