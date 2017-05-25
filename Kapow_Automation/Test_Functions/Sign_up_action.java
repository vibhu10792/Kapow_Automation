package Test_Functions;

import org.openqa.selenium.WebDriver;

import org.testng.Reporter;

import Page_Objects.Sign_up;
import Utility.Constant;

public class Sign_up_action 
{
	public static void Execute (WebDriver driver, String username, String password) throws Exception{
	
	Sign_up.Login_sign_up().sendKeys(username);
	Sign_up.Password().sendKeys(password);
	Reporter.log("SignIn Action is successfully perfomred");
	
	
	
	
	}
      

	}



