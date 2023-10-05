package appiumtests;

import io.appium.java_client.AppiumDriver;

public class CalculatorTest

 static AppiumDriver driver;
    
 AppiumDriver<MobileElement>driver;
 
	public static void main(String[]args)
	{
		try 
		{
		openCalculator();
		}
		catch(Exception exp) {
			
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.printStackTrace());
		}
		}
		// TODO Auto-generated method stub
		
		public static <MobileElement> void openCalculator() 
		{
			DesiredCapabilities cap=new DesiredCapabilities();
			
			cap.setCapability("device name","Redmi 9i");
			cap.setCapability("udid","5456468ab");
			cap.setCapability("platformName","Android");
			cap.setCapability("platformVersion", "12.8.1");
			cap.setCapability("appPackage","com.myos.calculator2");
			cap.setCapability(" appActivity ","com.myos.calculator2.calculator");
		
			URL url=new URL("http://127.0.0.1:4723/wd/hub");
			
		  driver = new AppiumDriver<MobileElement>(url,cap);
		
		   System.out.println("Application Started...");
		   
		   
		   //////// Addition 2+3=5   Findout Element using Appium Inspector

	         



	            MobileElement two=driver.findElement(By.id("   "));
			    MobileElement two=driver.findElement(By.id("   "));
	            MobileElement two=driver.findElement(By.id("   "));
	            MobileElement two=driver.findElement(By.id("   "));
	            MobileElement two=driver.findElement(By.id("   "));


	        two.click();
	        plus.click();
	        three.click();
	        equals.click();
	  
	        string res=result.getText();
	        system.out.println("/n Result")
	        System.out.println("/completed....");

	}

		   
		   
		   
		
		
		}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	