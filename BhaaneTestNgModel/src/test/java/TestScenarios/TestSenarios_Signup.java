package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.SignupPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSenarios_Signup {

	WebDriver driver;
	
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://www.bhaane.com/");
		
	}
	
	@Test(priority=1)
	public void account() throws InterruptedException {
		SignupPage acc = new SignupPage(driver);
		acc.createaccount();
	}
	@Test(priority=0)
	public void alert() {
		SignupPage acc = new SignupPage(driver);
		acc.handlealert();
		
	}
	
	@Test(priority=2)
	public void registeruser() throws InterruptedException {
		SignupPage acc = new SignupPage(driver);
		acc.signupbutton();
		
	}
	
	@Test(priority=3)
	public void selectitems() throws InterruptedException {
		SignupPage acc = new SignupPage(driver);
		acc.selectitem();
		
	}
	
	
	@AfterTest
	public void aftertest() {
		//driver.quit();
	}
}
