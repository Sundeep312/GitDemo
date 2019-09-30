package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login

{
public WebDriver driver;
	
	public Login (WebDriver driver) 
	{
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Login & Signup')]")
	WebElement signup;
	
	@FindBy(xpath="//span[contains(text(),'Get access to your Orders, Wishlist and Recommenda')]")
	WebElement text;
	
	@FindBy(css="._29YdH8")
	WebElement close;
	
	
	@FindBy(css="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement Email;
	
	@FindBy(css="._3v41xv")
	WebElement Password;
	
   @FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
   WebElement submit;

	public WebElement signup()
	{
		return signup;
		
	}
	
	public WebElement text()
	{
		return text;
		
	}
	
	public WebElement close()
	{
		return close;
		
	}
   
	public WebElement Email()
	{
		return Email;
		
	}
	
	public WebElement Password()
	{
		return Password;
		
	}
	public WebElement submit()
	{
		return submit;
		
	}
	

}
