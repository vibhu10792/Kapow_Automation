
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Functional {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws MalformedURLException 
	{

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Micromax");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		capabilities.setCapability(CapabilityType.VERSION, "5.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "games.kapow.android.studio");
		capabilities.setCapability("appActivity", "games.kapow.android.ui.activities.SplashActivity");
		capabilities.setCapability("unicodeKeyboard", true);
		capabilities.setCapability("resetKeyboard", true);

		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void Verify_blank_name()
	{

		Kapow_Repo.Repository.name(driver).clear();
		if(Kapow_Repo.Repository.Enter(driver).isEnabled())
		{
			System.out.println("Test case fail");
		}

		else
		{
			System.out.println("Test case pass");
		}	
	}

	@Test
	public void Verify_name()
	{

		String name= Kapow_Repo.Repository.name(driver).getText();
		String updated_name= "Tester Test";
		if(name.isEmpty())
		{
			System.out.println(name);
		}
		else
		{
			Kapow_Repo.Repository.name(driver).sendKeys(updated_name);
		}
	}

	@Test
	public void Verify_updated_name()
	{

		String current_name= Kapow_Repo.Repository.name(driver).getText();
		String updated_name= "Tester Test";
		if(current_name.equalsIgnoreCase(updated_name))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
	}

	@Test
	public void Verify_blank_mail(){

		Kapow_Repo.Repository.mail(driver).clear();
		if(Kapow_Repo.Repository.Enter(driver).isEnabled())
		{
			System.out.println("Test case fail");
		}

		else
		{
			System.out.println("Test case pass");
		}	
	}

	@Test
	public void Verify_mail(){

		String mail= Kapow_Repo.Repository.mail(driver).getText();
		String updated_mail= "vibhu.dixit15@gmail.com";
		if(mail.isEmpty())
		{
			System.out.println(mail);
		}
		else
		{
			Kapow_Repo.Repository.name(driver).sendKeys(updated_mail);
		}
	}

	@Test
	public void Verify_updated_mail()
	{

		String current_mail= Kapow_Repo.Repository.mail(driver).getText();
		String updated_mail= "Tester Test";
		if(current_mail.equalsIgnoreCase(updated_mail)){
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
	}

	@Test
	public void Verify_country_code()
	{

		String country_code= Kapow_Repo.Repository.number(driver).getText();
		String India_country_code= "+91";
		String My_num="9911209559";
		if(country_code.equals(India_country_code)&& !Kapow_Repo.Repository.Enter(driver).isEnabled()){
			Kapow_Repo.Repository.number(driver).sendKeys(My_num);
		}

		else
		{
			System.out.println("Different country code");
		}
	}

	@Test
	public void verify_blank_number(){

		Kapow_Repo.Repository.number(driver).clear();
		if(Kapow_Repo.Repository.Enter(driver).isEnabled()){
			System.out.println("Test case fail");
		}

		else{
			System.out.println("Test case pass");
		}	

	}

	@AfterTest
	public void Enter_number() throws Exception{

		Kapow_Repo.Repository.number(driver).sendKeys("+919911209559");
		if(Kapow_Repo.Repository.Enter(driver).isEnabled()){
			Kapow_Repo.Repository.Enter(driver).click();
		}

		else{
			System.out.println("Test case fail");
		}
	}

	/*@Test
	public void Enter_Blank_OTP(){

		String Empty_OTP=Kapow_Repo.Repository.OTP(driver).getText();
		if(Empty_OTP.isEmpty()&& !Kapow_Repo.Repository.Verify_OTP(driver).isEnabled()){
			System.out.println("Test case pass");

		}
		else{
			System.out.println("Test case fail");
		}


		}

	@Test
	public void Enter_OTP(){
		Kapow_Repo.Repository.OTP(driver).sendKeys(Generic.Get_OTP());

		if(Kapow_Repo.Repository.Verify_OTP(driver).isEnabled()){
			Kapow_Repo.Repository.Verify_OTP(driver).click();
			System.out.println("Test case pass");
		}

		else{
			System.out.println("Test case fail");
		}
	}


	 */







@Test
	public void kapow(){
		boolean s1=Kapow_Repo.Repository.name(driver).getText().equals("Vaibhav Dixit");

		System.out.println(s1);
		Kapow_Repo.Repository.number(driver).clear();
		Kapow_Repo.Repository.number(driver).sendKeys("+919911209559");
		Kapow_Repo.Repository.Enter(driver).click();
		if(Kapow_Repo.Repository.Verify_OTP(driver).getText().equals("Playing")){
			System.out.println("Login Successful");	
		}
		else{
			System.out.println("Login unSuccessful");
		}
		String s3=Kapow_Repo.Repository.games(driver).getText();
		System.out.println(s3);
		String s4=Kapow_Repo.Repository.games1(driver).getText();
		System.out.println(s4);
		Kapow_Repo.Repository.All_Games(driver).click();
		Kapow_Repo.Repository.Alerts(driver).click();
		if(Kapow_Repo.Repository.Profile(driver).isDisplayed()){

		}
		//Kapow_Repo.Repository.Profile(driver).click();
		if(Kapow_Repo.Repository.All_Games(driver).isDisplayed()){
			Kapow_Repo.Repository.All_Games(driver).click();
			Kapow_Repo.Repository.Action_Bar(driver).click();
			Kapow_Repo.Repository.Log_Out(driver).click();

		}
		else{
			Kapow_Repo.Repository.All_Games(driver).click();

		}
		System.out.println("Logout Successful");


	}

	@AfterTest
	public void End() {
	}
	}

	

