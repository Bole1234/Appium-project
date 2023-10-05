package appiumtests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities.*;

import io.appium.java_client.AppiumDriver;

public class sendSMS_in_AndroidMobile
{

	public static <MobileElement> void openCalculator() 
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("device name","Redmi 9i");
		cap.setCapability("udid","5456468ab");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion", "12.8.1");
		cap.setCapability("appPackage","com.Android.mms");
		cap.setCapability(" appActivity ","com.Android.mms.ui.ComposeMessegeActivity");
	
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
	  AppiumDriver s= new AppiumDriver<MobileElement>(url,cap);
	
	   System.out.println("Application Started...");
	   
	   
	   Thread.sleep(5000);
	   
	   driver.findElement(By.id(".........")).sendkeys("9978568456");
	   driver.findElement(By.id(".........")).sendkeys("9978568456");
	   driver.findElement(By.id(".........")).Click();
	   
	   Thread.sleep(5000);
	   

       ChromeDriver.quit();
	   
	   
	   
	   
	   
	   
}
	
}