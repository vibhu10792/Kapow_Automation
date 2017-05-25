package Test;
import Page_Objects.Sign_up;
import Utility.Capabilities;
import Utility.Constant;
import Test_Functions.Sign_up_action;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Sign_up_test {

	private static WebDriver driver = null;

	public static void Initialize() throws MalformedURLException{
		Capabilities.setUp();
	}

	public static void Signup(){
		try {
			Sign_up_action.Execute(driver, Constant.username, Constant.password);
		} catch (Exception e) {

			e.printStackTrace();
		}



	}
}
