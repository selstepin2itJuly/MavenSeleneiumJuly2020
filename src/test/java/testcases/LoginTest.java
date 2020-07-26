package testcases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.LoginPage;
import testbase.TestBaseStatic;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginTest {
	
	private WebDriver dr;
	private LoginPage lp;
  
	@Test
    public void loginTest_TC00123() 
	{
		lp.loginMethod("username", "passs");
		assertEquals("", "");
	}
	
	@Test
	public void loginTest_TC00128() 
	{
		lp.loginMethod("username", "passs");
		assertTrue(true);	
	}
	
	@Test
	public void loginTest_TC00178() 
	{
		lp.loginMethod("username", "passs");
		assertTrue(false);
	}
  @BeforeMethod
  public void beforeMethod() //pre-conditions
  {
	  //Browser open
	  dr=TestBaseStatic.getInstance();
	  //url open
	  dr.get("http://www.facebook.com");
	  lp=new LoginPage(dr);
  }

  @AfterMethod
  public void afterMethod() //post-conditions
  {
	  //close browser
	  dr.quit();
  }

  

 

 

}
