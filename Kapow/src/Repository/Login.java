package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public static  class Repository {

		public static WebElement Username (WebDriver driver){

			WebElement element = driver.findElement(By.id("com.what3words.android:id/login_email_address_field"));

			return element;

		}
		
		public static WebElement Password(WebDriver driver){

			WebElement element = driver.findElement(By.id("com.what3words.android:id/login_password_field"));

			return element;

		}
		public static WebElement Submit_Login(WebDriver driver){

			WebElement element = driver.findElement(By.id("com.what3words.android:id/login_button"));

			return element;
	

}
		public static WebElement Home_image(WebDriver driver){

			WebElement element = driver.findElement(By.id("android:id/home"));

			return element;
	

}
	}}
