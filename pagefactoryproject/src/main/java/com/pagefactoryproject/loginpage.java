package com.pagefactoryproject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class loginpage {
  public WebDriver driver;
	@FindBy(how=How.ID, using="txtUsername")WebElement usernametextbox;
    @FindBy(how=How.ID,using="txtPassword")WebElement passwordtextbox;
	@FindBy(how=How.ID,using="btnLogin")WebElement loginbutton;
	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public void setusername(String struname,String strpass)
{
	  usernametextbox.sendKeys(struname);
	  passwordtextbox.sendKeys(strpass);
}
public void clickon()
{
	loginbutton.click();    
	
}
}

