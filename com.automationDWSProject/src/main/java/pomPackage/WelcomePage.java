package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//Declaration
		@FindBy(linkText = "Register") private WebElement registerLink;
		@FindBy(linkText = "Log in") private WebElement loginLink;
		@FindBy(linkText = "Shopping cart") private WebElement shoppingCartLink;
		@FindBy(linkText = "Wishlist") private WebElement wishlistLink;
		@FindBy(partialLinkText = "BOOKS") private WebElement booksLink;
		@FindBy(partialLinkText = "COMPUTERS") private WebElement computersLink;
		@FindBy(partialLinkText = "ELECTRONICS") private WebElement electronicsLink;
		@FindBy(partialLinkText = "APPAREL & SHOES") private WebElement apparelAndShoesLink;
		@FindBy(linkText = "Log out") private WebElement logOutLink;
		@FindBy(xpath = "//a[@href='/customer/info']") private WebElement personalInfoLink;
		
		//Initialization
		public WelcomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public WebElement getRegisterLink() {
			return registerLink;
		}

		public WebElement getLoginLink() {
			return loginLink;
		}

		public WebElement getShoppingCartLink() {
			return shoppingCartLink;
		}

		public WebElement getPersonalInfoLink() {
			return personalInfoLink;
		}

		public WebElement getWishlistLink() {
			return wishlistLink;
		}

		public WebElement getBooksLink() {
			return booksLink;
		}

		public WebElement getComputersLink() {
			return computersLink;
		}

		public WebElement getElectronicsLink() {
			return electronicsLink;
		}

		public WebElement getApparelAndShoesLink() {
			return apparelAndShoesLink;
		}

		public WebElement getLogOutLink() {
			return logOutLink;
		}
		
		//Operational Method
		//For logging out
		public void logOut()
		{
			logOutLink.click();
		}

}
