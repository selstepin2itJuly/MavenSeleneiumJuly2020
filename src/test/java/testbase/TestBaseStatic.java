package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBaseStatic {

	public static WebDriver driver;
	
	public static WebDriver getInstance() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static WebDriver getInstance(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) 
		{
			//System.setProperty("webdriver.edge.driver", "./drivers/edgedriver.exe");
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("IE")) 
		{
			System.setProperty("webdriver.ie.driver", "./drivers/IEdriver.exe");
			driver = new InternetExplorerDriver();
		}else 
		{
			Throwable th=new Throwable();
			th.initCause(null);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}
}
