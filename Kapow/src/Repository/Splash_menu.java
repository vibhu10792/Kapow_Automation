package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Splash_menu {
	
	public static  class Repository {

		public static WebElement Go_To_Map_Btn(WebDriver driver){

			WebElement element = driver.findElement(By.id("com.what3words.android:id/btn_locate"));

			return element;

		}
		
	   public static WebElement Menu_Btn(WebDriver driver){

			WebElement element = driver.findElement(By.id("android:id/up"));

			return element;

		}
	   public static WebElement Menu_Item_1(WebDriver driver){

			WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Map']"));

			return element;

		}
	   public static WebElement Menu_Item_2(WebDriver driver){

			WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Compass']"));

			return element;

	}
	   public static WebElement Menu_Item_3(WebDriver driver){

			WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']"));

			return element;

	}
	   public static WebElement Menu_Item_4(WebDriver driver){

			WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Login or Sign up']"));

			return element;


	}
	}}
	   
