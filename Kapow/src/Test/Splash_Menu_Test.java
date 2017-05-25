package Test;
import Generic.Launcher;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import Repository.Splash_menu;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Splash_Menu_Test extends Launcher {
	

	
	

	@Test(priority=1)
	public void Verify_Go_To_Map_Btn()
	{
        if(Splash_menu.Repository.Go_To_Map_Btn(driver).isDisplayed()){
		Splash_menu.Repository.Go_To_Map_Btn(driver).click();
		System.out.println("Test case pass");
        }
        else{
        	System.out.println("Test case fail");
        }
		
	}

	
	@Test(priority=2)
	public void verify_Menu_Btn(){
		if(Splash_menu.Repository.Menu_Btn(driver).isDisplayed()){
			Splash_menu.Repository.Menu_Btn(driver).click();
			System.out.println("Test case pass");
	        }
	        else{
	        	System.out.println("Test case fail");
	        }
			}
	
	@Test(priority=3)
	public void verify_Menu_Item_1(){
		if(Splash_menu.Repository.Menu_Item_1(driver).isDisplayed()){
			String Item_1=Splash_menu.Repository.Menu_Item_1(driver).getText();
			Assert.assertTrue(Item_1.equalsIgnoreCase("Map"));
			System.out.println("Test case pass");
	        }
	        else{
	        	System.out.println("Test case fail");
	        }
			}
	@Test(priority=4)
	public void verify_Menu_Item_2(){
		if(Splash_menu.Repository.Menu_Item_2(driver).isDisplayed()){
			String Item_2=Splash_menu.Repository.Menu_Item_2(driver).getText();
			Assert.assertTrue(Item_2.equalsIgnoreCase("Compass"));
			System.out.println("Test case pass");
	        }
	        else{
	        	System.out.println("Test case fail");
	        }
			}
	@Test(priority=5)
	public void verify_Menu_Item_3(){
		if(Splash_menu.Repository.Menu_Item_3(driver).isDisplayed()){
			String Item_3=Splash_menu.Repository.Menu_Item_3(driver).getText();
			Assert.assertTrue(Item_3.equalsIgnoreCase("Settings"));
			System.out.println("Test case pass");
	        }
	        else{
	        	System.out.println("Test case fail");
	        }
			}
	@Test(priority=5)
	public void verify_Menu_Item_4(){
		if(Splash_menu.Repository.Menu_Item_4(driver).isDisplayed()){
			String Item_4=Splash_menu.Repository.Menu_Item_4(driver).getText();
			Assert.assertTrue(Item_4.equalsIgnoreCase("Login or Sign up"));
			System.out.println("Test case pass");
	        }
	        else{
	        	System.out.println("Test case fail");
	        }
			}
	@Test(priority=6)
	public void Pre_condition(){
		if(Splash_menu.Repository.Menu_Item_4(driver).isDisplayed()){
			Splash_menu.Repository.Menu_Item_4(driver).click();
			System.out.println("Test case pass");
	        }
	        else{
	        	System.out.println("Test case fail");
	        }
	}
}