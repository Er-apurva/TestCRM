package com.TestCRM.TestUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.TestCRM.TestBase.TestBase;

public class Timers extends TestBase{

	
	public static long implicitwait=40;
	public static long pageloadTimeOut=20;
	
	
	
	public static void smallStaticWait()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void takeScreenShots(String testName)
	{
		String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,  new File(".\\ScreenShots\\"+testName+date+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
	
	
	
	
	
}
