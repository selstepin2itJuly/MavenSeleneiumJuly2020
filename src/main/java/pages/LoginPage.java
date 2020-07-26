package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver dr;
	public LoginPage(WebDriver driver) 
	{
		this.dr=driver;
		PageFactory.initElements(dr, this);//important
	}
	
	@FindBy(css="input[type='email']")
	WebElement user;
	
	@FindBy(xpath="//input[@type='password'][@id='pass']")
	WebElement pass;
	
	@FindBy(id="loginbutton")
	WebElement submit;
	
	@FindBy(linkText="Forgot account?")
	WebElement forgotuser;
	
	public void loginMethod(String usr, String pas) 
	{
		user.sendKeys(usr);
		pass.sendKeys(pas);
		submit.click();
	}

	public void clickOneForgotUser() 
	{
		forgotuser.click();
	}
}
