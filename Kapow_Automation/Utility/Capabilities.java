package Utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Capabilities {
	 static WebDriver driver;

	public static void setUp() throws MalformedURLException 
	{

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "My Device");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		capabilities.setCapability(CapabilityType.VERSION, "5.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", Constant.App_Package);
		capabilities.setCapability("appActivity", Constant.App_Activity);
		capabilities.setCapability("unicodeKeyboard", true);
		capabilities.setCapability("resetKeyboard", true);

		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}
}
