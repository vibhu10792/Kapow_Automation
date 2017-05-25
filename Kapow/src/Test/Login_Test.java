package Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.Launcher;
import Repository.Login;
import Repository.Splash_menu;

public class Login_Test extends Launcher {

	//static WebDriver driver=null;
	

	@Test
	public void Verify_Neagtive_Login_Scenario()
	{
		if(Login.Repository.Username(driver).isDisplayed()){
			Login.Repository.Username(driver).sendKeys("me@email.com");
			Login.Repository.Password(driver).sendKeys("test");
			Login.Repository.Submit_Login(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			if(Login.Repository.Submit_Login(driver).isDisplayed())
				System.out.println("Login Unsuccessful");
		}
		else{
			System.out.println("Test case fail");
		}

	}
	
	@Test
	public void Verify_Positive_Login_Scenario()
	{
		if(Login.Repository.Username(driver).isDisplayed()){
			Login.Repository.Username(driver).sendKeys("vibhu.dixit15@gmail.com");
			Login.Repository.Password(driver).sendKeys("123456");
			Login.Repository.Password(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			if(Login.Repository.Home_image(driver).isDisplayed())
				System.out.println("Login Successful");
		}
		else{
			System.out.println("Test case pass");
		}

	}

}
