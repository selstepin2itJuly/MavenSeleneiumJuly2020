package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import testbase.TestBaseStatic;

public class Utility extends TestBaseStatic {

	public static void waitForElement(WebElement ele)
	{
		WebDriverWait wait= new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void waitForClickableElement(WebElement ele)
	{
		WebDriverWait wait= new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public static void waitForElementFluent(WebElement ele)
	{
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void captureScreenShot() throws IOException 
	{
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("image_"+getDate()+".jpg"));
	}
	
	public static void scrollToElement(WebElement ele) 
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400);","");
	}
	
	public static String getDate() 
	{
		Date dt=new Date();
		//System.out.println(dt);
		SimpleDateFormat sdf= new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss_SS");
		String cal = sdf.format(dt);
		//System.out.println(cal);
		return cal;
	}
}
