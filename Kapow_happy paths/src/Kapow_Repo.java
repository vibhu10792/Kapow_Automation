import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Kapow_Repo{

	public static  class Repository {

		public static WebElement name(WebDriver driver){

			WebElement element = driver.findElement(By.id("games.kapow.android.studio:id/name"));

			return element;

		}
		public static WebElement mail(WebDriver driver){

			WebElement element = driver.findElement(By.id("games.kapow.android.studio:id/email"));

			return element;

		}

		public static WebElement number(WebDriver driver){

			WebElement element = driver.findElement(By.id("games.kapow.android.studio:id/phone_number"));

			return element;

		}

		public static WebElement Enter(WebDriver driver){

			WebElement element = driver.findElement(By.id("games.kapow.android.studio:id/enter_kapow_button"));

			return element;

		}

		public static WebElement OTP(WebDriver driver){

			WebElement element = driver.findElement(By.id("games.kapow.android.studio:id/otp"));

			return element;

		}
		public static WebElement Verify_OTP(WebDriver driver){

			WebElement element = driver.findElement(By.xpath("//android.widget.Button[@index='0']"));

			return element;

		}



		public static WebElement Playing(WebDriver driver){

			WebElement element = driver.findElement(By.id("//android.widget.TextView[@text='Playing']"));

			return element;

		}
		public static WebElement games(WebDriver driver){

			WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@index='0']"));

			return element;

		}
		public static WebElement games1(WebDriver driver){

			WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));

			return element;

		}
		public static WebElement All_Games(WebDriver driver){

			WebElement element = driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'android:id/text1') and @text='All']"));

			return element;
		}
		public static WebElement Alerts(WebDriver driver){

			WebElement element = driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'android:id/text1') and @text='Alerts']"));

			return element;
		}
		public static WebElement Profile(WebDriver driver){

			WebElement element = driver.findElement(By.className("//android.widget.TextView[contains(@resource-id,'android:id/text1') and @text='Profile']"));

			return element;
		}
		public static WebElement Action_Bar(WebDriver driver){

			WebElement element = driver.findElement(By.xpath("//android.widget.ImageView[@index='0']"));

			return element;
		}
		public static WebElement Log_Out(WebDriver driver){

			WebElement element = driver.findElement(By.id("games.kapow.vadapow.studio:id/title"));

			return element;
		}
	}
}
