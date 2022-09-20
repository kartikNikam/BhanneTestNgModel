package Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	WebDriver driver;
	
	public  SignupPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	By account = By.xpath("//*[@class='col hidden-xs']");
	
	By alert = By.xpath("//*[@class='cross_sign md']");
	
	By signup = By.xpath("//*[text()='sign up >']");
	By fname = By.xpath("//*[@name='first_name']");
	By lname = By.xpath("//*[@name='last_name']");
	
	By email = By.xpath("(//*[@type='email'])[3]");
	
	By mobile= By.xpath("//*[@name='mobile']");
	By pwd = By.xpath("(//*[@name='password'])[2]");
	By submit = By.xpath("(//*[text()='submit'])[2]");
	
	By bottom =By.xpath("(//*[text()='bottoms'])[2]");
	By denims = By.xpath("(//*[text()='denims'])[2]");
	
	// select product
	
	By selectprod = By.xpath("(//*[@class='img-normal lazy loaded'])[1]");
	
	By addtobag = By.xpath("(//*[text()='add to bag'])[1]");
	
	By gotocart = By.xpath("//*[text()='go to cart']");
	
	By checkout = By.xpath("(//*[text()='checkout'])[2]");
	
	
	

	
	public void handlealert() {
		// TODO Auto-generated method stub
		driver.findElement(alert).click();
	}
	
	public void createaccount() throws InterruptedException {
		driver.findElement(account).click();
		Thread.sleep(5000);
	}
	
	public void signupbutton() throws InterruptedException {
		driver.findElement(signup).click();
		driver.findElement(fname).sendKeys("kkntest");
		driver.findElement(lname).sendKeys("Testone");
		Thread.sleep(3000);
		driver.findElement(email).sendKeys("kknhmt6@gmail.com");
		driver.findElement(mobile).sendKeys("8625049911");
		driver.findElement(pwd).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(submit).click();
		Thread.sleep(5000);
		
	}
	
	public void selectitem() throws InterruptedException {
	
		driver.findElement(bottom).click();
		Thread.sleep(3000);
		driver.findElement(denims).click();
		driver.findElement(selectprod).click();
	    Thread.sleep(3000);
		driver.findElement(addtobag).click();
	    Thread.sleep(3000);
		driver.findElement(gotocart).click();
		driver.findElement(checkout).click();
		
	}
	
	

	
	
}
