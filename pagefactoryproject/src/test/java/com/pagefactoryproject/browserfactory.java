package com.pagefactoryproject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class browserfactory {
/*
public static void startapp(WebDriver driver,String browsername,String appurl)
	{
		if(browsername.equals("chrome"))
		{
		
	System.setProperty("webdriver.chrome.driver", " C:\\sers\home\workspace\pagefactoryproject\Driver\chromedriver.exe");            
	     driver=new ChromeDriver();	
		driver.get(" https://opensource-demo.orangehrmlive.com");  */
	public static  void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Downloads\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize(); 
		  driver.get("https://opensource-demo.orangehrmlive.com");
	}
	
	
}
