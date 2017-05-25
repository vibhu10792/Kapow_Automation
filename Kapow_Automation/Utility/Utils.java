package Utility;

import java.io.File;
import java.util.concurrent.TimeUnit;
//import Utility.Constant;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Utils {
	
	public static WebDriver driver = null;

	public static void takeScreenshot(WebDriver driver, String sTestCaseName) throws Exception{
	
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(Constant.PathScreenshot + sTestCaseName +".jpg"));	
		
	}
	
 public static void waitForElement(WebElement element){
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	 	}

}
