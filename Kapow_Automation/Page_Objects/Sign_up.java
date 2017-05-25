package Page_Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Sign_up extends BaseClass{
	private static WebElement element = null;

	public Sign_up(WebDriver driver)
	{
		super(driver);
	}

	public static WebElement Login_sign_up() throws Exception{
		
			element = driver.findElement(By.id("com.what3words.android:id/btn_login"));
		
		return element;

	}

	public static WebElement Password() throws Exception{
		
			element = driver.findElement(By.id(""));
		
		return element;

	}
}

