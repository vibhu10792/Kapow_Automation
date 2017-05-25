package Test;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Objects.Splash_Menu;
import Utility.Capabilities;

public class Splash_Menu_test {
	WebDriver driver;
	
	@BeforeTest
	public void Initialize() throws MalformedURLException, InterruptedException{
		Capabilities.setUp();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void Splash_Page() throws Exception{
		Splash_Menu.repository.Go_To_Map_btn(driver).click();
		
		
	}
	
	

}
