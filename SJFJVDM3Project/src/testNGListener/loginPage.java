package testNGListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	//Declaration
	@FindBy(id="Email") private WebElement emailTB;
	@FindBy(id="Password") private WebElement passwordTB;
	@FindBy(xpath = "//input[@value='Log in']") private WebElement loginButton;
	@FindBy(id="RememberMe") private WebElement rememberMeCheckBox;
	@FindBy(linkText="Forgot password") private WebElement forgotPasswordlink;
	
	// initialization
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	
	//Utilization
	public WebElement getEmailTB() {
		return emailTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getForgotPasswordlink() {
		return forgotPasswordlink;
	}

	//Operational Methods / Business Logic
	public void validLogin(String email, String password) {
		emailTB.sendKeys(email);
		passwordTB.sendKeys(password);
		loginButton.click();
	}
	
	public void invalidLogin(String email, String password) throws InterruptedException {
		emailTB.sendKeys(email);
		passwordTB.sendKeys(password);
		loginButton.click();
		Thread.sleep(1000);
		emailTB.clear();
		passwordTB.clear();
	}
	
	}
