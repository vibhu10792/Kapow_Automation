package Generic;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
public class Launcher  {


	public static AppiumDriver<?> driver;
	public WebDriverWait wait;

	@BeforeSuite
	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Asus");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		capabilities.setCapability(CapabilityType.VERSION, "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.what3words.android");
		capabilities.setCapability("appActivity", "com.what3words.android.activities.WelcomeActivity_");
		driver = (AppiumDriver<?>) new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		wait = new WebDriverWait(driver, 30);
	}
	@AfterSuite
	public void tearDown() throws Exception {
		driver.quit();
	}


}



