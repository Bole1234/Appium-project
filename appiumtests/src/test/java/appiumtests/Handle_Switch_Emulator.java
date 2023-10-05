package appiumtests;

import java.net.URL;

import io.appium.java_client.AppiumDriver;

public class Handle_Switch_Emulator
{

	public static <MobileElement> void openCalculator() 
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("device name","Redmi 9i Emulator");
		cap.setCapability("udid","5456468ab");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion", "12.8.1");
		cap.setCapability("appPackage","com.Android.mms");
		cap.setCapability(" appActivity ","com.Android.mms.ui.ComposeMessegeActivity");
	
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
	  AppiumDriver s= new AppiumDriver<MobileElement>(url,cap);
	
	   System.out.println("Application Started...");
	   
	   
	
	
}
