package Page_Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Splash_Menu
{

	public static class repository{


		public static WebElement Go_To_Map_btn(WebDriver driver)
		{

			WebElement element = driver.findElement(By.id("com.what3words.android:id/btn_login"));

			return element;

		}

		public static WebElement Menu_Title(WebDriver driver)
		{
			WebElement element = driver.findElement(By.id("android:id/home"));

			return element;

		}

		public static WebElement Menu_btn(WebDriver driver)
		{

			WebElement	element = driver.findElement(By.id("android:id/up"));

			return element;

		}

		public static WebElement Menu_Item_1(WebDriver driver)throws Exception
		{

			WebElement	element = driver.findElement(By.xpath("//android.widget.TextView[@text='Map']"));

			return element;

		}
		public static WebElement Menu_Item_2(WebDriver driver)throws Exception
		{
			WebElement	element = driver.findElement(By.xpath("//android.widget.TextView[@text='Compass']"));

			return element;

		}
		public static WebElement Menu_Item_3(WebDriver driver)throws Exception
		{
			WebElement	element = driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']"));

			return element;

		}
		public static WebElement Menu_Item_4(WebDriver driver)throws Exception
		{

			WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Login or Sign up']"));

			return element;

		}
		public static WebElement Menu_Item_5(WebDriver driver)throws Exception
		{

			WebElement	element = driver.findElement(By.xpath("//android.widget.TextView[@text='About']"));

			return element;

		}
		public static WebElement Menu_Item_6(WebDriver driver)throws Exception
		{

			WebElement	element = driver.findElement(By.xpath("//android.widget.TextView[@text='FAQ']"));

			return element;

		}
		public static WebElement Menu_Item_7(WebDriver driver)throws Exception
		{

			WebElement	element = driver.findElement(By.xpath("//android.widget.TextView[@text='Contact']"));

			return element;

		}
		public static WebElement Menu_Item_8(WebDriver driver)throws Exception
		{

			WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Tutorial']"));

			return element;

		}
		public static WebElement Menu_Item_9(WebDriver driver)throws Exception
		{

			WebElement	element = driver.findElement(By.xpath("//android.widget.TextView[@text='Rate the app']"));


			return element;

		}

	}}



