package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
		@FindBy(id="Email") private WebElement emailTextBox;
		@FindBy(id="Password") private WebElement passwordTextBox;
		@FindBy(id="RememberMe") private WebElement RememberMeCheckBOx;
		@FindBy(linkText = "Forgot password?") private WebElement ForgotPasswordLink;
		@FindBy(xpath = "//input[@value='Log in']") private WebElement LoginButton;
		
		//Initialization
		//PageFactory is a class present in selenium package--it has initElements()-- which is used to initialize variables--
		//--so that every time will fetch the new address-even if page gets refreshed and can avoid the StaleElementReferenceException
		//Constructor
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);  //this will specify all the elements located within this script
		}
		
		//Utilization
		//Need to use getter method to access the private webelements located to access them outside this class
		public WebElement getEmailTextBox() {
			return emailTextBox;
		}

		public WebElement getPasswordTextBox() {
			return passwordTextBox;
		}

		public WebElement getRememberMeCheckBox() {
			return RememberMeCheckBOx;
		}

		public WebElement getForgotPasswordLink() {
			return ForgotPasswordLink;
		}

		public WebElement getLoginButton() {
			return LoginButton;
		} 
		
		//Operational methods or Business login
		//For performing Valid login
		public void validLoginMethod(String email, String password)
		{
			emailTextBox.sendKeys(email);
			passwordTextBox.sendKeys(password);
			LoginButton.click();
		}
		
		//For performing Invalid login
		public void invalidLoginMethod(String email, String password)
		{
			emailTextBox.sendKeys(email);
			passwordTextBox.sendKeys(password);
			LoginButton.click();
			emailTextBox.clear();
			passwordTextBox.clear();
		}

}
