package testNGListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomePage {
	@FindBy(linkText="Register") private WebElement registerLink;
	@FindBy(linkText="Log in") private WebElement loginLink ;
	@FindBy(xpath= "//span[text()='Shopping cart']") private WebElement shoppingLink;
	@FindBy(xpath= "//span[text()='Wishlist']") private WebElement wishlistLink;
	@FindBy(partialLinkText="BOOKS") private WebElement booksLink;
	@FindBy(partialLinkText="COMPUTERS") private WebElement computersLink;
	@FindBy(partialLinkText="ELECTRONICS") private WebElement electronicsLink;
	
	
	//initialization
	public welcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getRegisterLink() {
		return registerLink;
	}


	public WebElement getLoginLink() {
		return loginLink;
	}


	public WebElement getShoppingLink() {
		return shoppingLink;
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
	
	
	
	

}
