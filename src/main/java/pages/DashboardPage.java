package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	private WebDriver dr;
	public DashboardPage(WebDriver driver) 
	{
		this.dr=driver;
		PageFactory.initElements(dr, this);
	}
}
