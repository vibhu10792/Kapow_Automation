import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.Repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Signup  {
	
	WebDriver driver;
	
	@AfterTest
	public void Verify_blank_name(){
		
		Kapow_Repo.Repository.name(driver).clear();
		if(Kapow_Repo.Repository.Enter(driver).isEnabled()){
			System.out.println("Test case pass");
		}
		
		else{
			System.out.println("Test case");
		}	
	}
	
	/*@Test
	public void Verify_name(){
		
		String name= Kapow_Repo.Repository.name(driver).getText();
		if(name.isEmpty()){
			Kapow_Repo.Repository.name(driver).sendKeys("Tester Test");
		}
		else{
			System.out.println(name);
		}
	}
		
	@Test
	public void Verify_blank_mail(){
			
			Kapow_Repo.Repository.mail(driver).clear();
			if(Kapow_Repo.Repository.Enter(driver).isEnabled()){
				System.out.println("Test case pass");
			}
			
			else{
				System.out.println("Test case fail");
			}	
		}
		
	
	@Test
	public void Verify_email(){
		
		String mail= Kapow_Repo.Repository.mail(driver).getText();
		if(mail.isEmpty()){
			Kapow_Repo.Repository.mail(driver).sendKeys("vibhu.dixit15@gmail.com");
		}
		
		
	}
	
	
	
*/
}
